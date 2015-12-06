package com.dothings.controller;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dothings.model.HealthDetailEntry;
import com.dothings.model.HealthDetailType;
import com.dothings.model.User;
import com.dothings.repository.HealthDetailRepository;
import com.dothings.repository.QuestCompletionRepository;
import com.dothings.repository.QuestRepository;
import com.dothings.repository.UserRepository;
import com.dothings.utils.RestAPIResponse;

@RestController
public class ProfileController extends BaseController {

	@Resource
	private UserRepository userRepository;

	@Resource
	private HealthDetailRepository healthDetailRepository;

	@Resource
	private QuestRepository questRepository;
	
	@Resource
	private QuestCompletionRepository questCompletionRepository;
	
	public static final double VERY_HIGH = 2;
	public static final double HIGH = 1.5;
	public static final double NORMAL = 1;
	public static final double LOW = 0.75;
	public static final double VERY_LOW = 0.5;

	@RequestMapping(value = "/getProfileInformation", method = RequestMethod.GET)
	public RestAPIResponse getProfileInformation() {
		User currentUser = getUser();
		List<HealthDetailEntry> todaysEntries = healthDetailRepository.getTodaysEntries(currentUser);

		for (HealthDetailEntry hde : todaysEntries) {
			if (hde.getType().equals(HealthDetailType.SLEEP)) {
				currentUser.setCurrentSleep(currentUser.getCurrentSleep() + hde.getValue());
			} else if (hde.getType().equals(HealthDetailType.WALK)) {
				currentUser.setCurrentWalk(currentUser.getCurrentWalk() + hde.getValue());
			} else if (hde.getType().equals(HealthDetailType.WATER)) {
				currentUser.setCurrentWater(currentUser.getCurrentWater() + hde.getValue());
			}
		}
		Integer createdQuests = questRepository.getCountByUser(currentUser);
		Integer completedQuests = questRepository.getCountByUser(currentUser);
		
		HashMap<String, Object> profileInformation = new HashMap<>();
		profileInformation.put("user", currentUser);
		profileInformation.put("created", createdQuests);
		profileInformation.put("completed", completedQuests);
		return RestAPIResponse.ok(currentUser);
	}

	@RequestMapping(value = "/setHealthDetailTarget/{detailType}", method = RequestMethod.POST)
	public RestAPIResponse setHealthDetailTarget(@PathVariable("detailType") HealthDetailType detailType,
			@RequestParam("value") Double value) {
		User currentUser = getUser();

		switch (detailType) {
		case SLEEP: {
			currentUser.setSleepAmount(value);
			break;
		}
		case WALK: {
			currentUser.setWalkAmount(value);
			break;
		}
		case WATER: {
			currentUser.setWaterAmount(value);
			break;
		}
		default: {
			break;
		}
		}

		User savedUser = userRepository.save(currentUser);

		return RestAPIResponse.ok(savedUser);

	}
	
	@RequestMapping(value = "/createHealthEntry/{detailType}", method = RequestMethod.POST)
	public RestAPIResponse createHealthEntry(@PathVariable("detailType") HealthDetailType detailType,
			@RequestParam("value") Double value) {
		User currentUser = getUser();
		
		long count = healthDetailRepository.getTodaysEntries(currentUser).stream()
																		.filter(e -> e.getType() == detailType)
																		.count();
		
		if(count == 0) {
			HealthDetailEntry healthDetailEntry = new HealthDetailEntry();
			healthDetailEntry.setUser(currentUser);
			healthDetailEntry.setType(detailType);
			healthDetailEntry.setValue(value);
			
			healthDetailRepository.saveAndFlush(healthDetailEntry);
			return RestAPIResponse.ok(null);
		}
		
		return RestAPIResponse.error(null, "Already Exists");
	}

	@RequestMapping(value = "/getHealthDetail/{detailType}", method = RequestMethod.GET)
	public RestAPIResponse getHealthDetail(@PathVariable("detailType") HealthDetailType detailType) {
		User currentUser = getUser();
		Double currentTarget = new Double(0);
		final Double target = currentTarget;
		switch (detailType) {
		case SLEEP: {
			currentTarget = currentUser.getSleepAmount();
			break;
		}
		case WALK: {
			currentTarget = currentUser.getWalkAmount();
			break;
		}
		case WATER: {
			currentTarget = currentUser.getWaterAmount();
			break;
		}
		default:{
			break;
		}
		}

		List<HealthDetailEntry> lastYearEntriesByType = healthDetailRepository.getLastYearEntriesByType(currentUser,
				detailType);

		long veryHighYearly = lastYearEntriesByType.stream().filter(e -> e.getValue() > target * VERY_HIGH).count();

		long highYearly = lastYearEntriesByType.stream().filter(e -> e.getValue() > target * HIGH).count();

		long normalYearly = lastYearEntriesByType.stream().filter(e -> e.getValue() > target * NORMAL).count();

		long lowYearly = lastYearEntriesByType.stream().filter(e -> e.getValue() > target * LOW).count();

		long veryLowYearly = lastYearEntriesByType.stream().filter(e -> e.getValue() > target * VERY_LOW).count();

		List<Long> distributionYearly = Arrays.asList(veryHighYearly, highYearly, normalYearly, lowYearly,
				veryLowYearly);

		List<HealthDetailEntry> lastMonthEntriesByType = healthDetailRepository.getLastMonthEntriesByType(currentUser,
				detailType);

		long veryHighMonthly = lastMonthEntriesByType.stream().filter(e -> e.getValue() > target * VERY_HIGH).count();

		long highMonthly = lastMonthEntriesByType.stream().filter(e -> e.getValue() > target * HIGH).count();

		long normalMonthly = lastMonthEntriesByType.stream().filter(e -> e.getValue() > target * NORMAL).count();

		long lowMonthly = lastMonthEntriesByType.stream().filter(e -> e.getValue() > target * LOW).count();

		long veryLowMonthly = lastMonthEntriesByType.stream().filter(e -> e.getValue() > target * VERY_LOW).count();

		List<Long> distributionMonthly = Arrays.asList(veryHighMonthly, highMonthly, normalMonthly, lowMonthly,
				veryLowMonthly);

		Map<String, Object> response = new HashMap<>();
		response.put("currentTarget", currentTarget);
		response.put("distributionYearly", distributionYearly);
		response.put("distributonMonthly", distributionMonthly);
		return RestAPIResponse.ok(response);
	}

}
