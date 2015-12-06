package com.dothings.client;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.dothings.model.Activity;
import com.dothings.model.ActivityExample;

public interface ActivityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity
     *
     * @mbggenerated Sun Dec 06 17:59:21 EET 2015
     */
    int countByExample(ActivityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity
     *
     * @mbggenerated Sun Dec 06 17:59:21 EET 2015
     */
    int deleteByExample(ActivityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity
     *
     * @mbggenerated Sun Dec 06 17:59:21 EET 2015
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity
     *
     * @mbggenerated Sun Dec 06 17:59:21 EET 2015
     */
    int insert(Activity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity
     *
     * @mbggenerated Sun Dec 06 17:59:21 EET 2015
     */
    int insertSelective(Activity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity
     *
     * @mbggenerated Sun Dec 06 17:59:21 EET 2015
     */
    List<Activity> selectByExampleWithBLOBs(ActivityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity
     *
     * @mbggenerated Sun Dec 06 17:59:21 EET 2015
     */
    List<Activity> selectByExample(ActivityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity
     *
     * @mbggenerated Sun Dec 06 17:59:21 EET 2015
     */
    Activity selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity
     *
     * @mbggenerated Sun Dec 06 17:59:21 EET 2015
     */
    int updateByExampleSelective(@Param("record") Activity record, @Param("example") ActivityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity
     *
     * @mbggenerated Sun Dec 06 17:59:21 EET 2015
     */
    int updateByExampleWithBLOBs(@Param("record") Activity record, @Param("example") ActivityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity
     *
     * @mbggenerated Sun Dec 06 17:59:21 EET 2015
     */
    int updateByExample(@Param("record") Activity record, @Param("example") ActivityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity
     *
     * @mbggenerated Sun Dec 06 17:59:21 EET 2015
     */
    int updateByPrimaryKeySelective(Activity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity
     *
     * @mbggenerated Sun Dec 06 17:59:21 EET 2015
     */
    int updateByPrimaryKeyWithBLOBs(Activity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity
     *
     * @mbggenerated Sun Dec 06 17:59:21 EET 2015
     */
    int updateByPrimaryKey(Activity record);
}