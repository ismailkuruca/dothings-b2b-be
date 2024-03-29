package com.dothings.client;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.dothings.model.Participant;
import com.dothings.model.ParticipantExample;

public interface ParticipantMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table participant
     *
     * @mbggenerated Sun Dec 06 17:59:21 EET 2015
     */
    int countByExample(ParticipantExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table participant
     *
     * @mbggenerated Sun Dec 06 17:59:21 EET 2015
     */
    int deleteByExample(ParticipantExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table participant
     *
     * @mbggenerated Sun Dec 06 17:59:21 EET 2015
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table participant
     *
     * @mbggenerated Sun Dec 06 17:59:21 EET 2015
     */
    int insert(Participant record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table participant
     *
     * @mbggenerated Sun Dec 06 17:59:21 EET 2015
     */
    int insertSelective(Participant record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table participant
     *
     * @mbggenerated Sun Dec 06 17:59:21 EET 2015
     */
    List<Participant> selectByExample(ParticipantExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table participant
     *
     * @mbggenerated Sun Dec 06 17:59:21 EET 2015
     */
    Participant selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table participant
     *
     * @mbggenerated Sun Dec 06 17:59:21 EET 2015
     */
    int updateByExampleSelective(@Param("record") Participant record, @Param("example") ParticipantExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table participant
     *
     * @mbggenerated Sun Dec 06 17:59:21 EET 2015
     */
    int updateByExample(@Param("record") Participant record, @Param("example") ParticipantExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table participant
     *
     * @mbggenerated Sun Dec 06 17:59:21 EET 2015
     */
    int updateByPrimaryKeySelective(Participant record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table participant
     *
     * @mbggenerated Sun Dec 06 17:59:21 EET 2015
     */
    int updateByPrimaryKey(Participant record);
}