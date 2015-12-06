package com.dothings.client;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.dothings.model.Event;
import com.dothings.model.EventExample;

public interface EventMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table event
     *
     * @mbggenerated Sun Dec 06 17:59:21 EET 2015
     */
    int countByExample(EventExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table event
     *
     * @mbggenerated Sun Dec 06 17:59:21 EET 2015
     */
    int deleteByExample(EventExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table event
     *
     * @mbggenerated Sun Dec 06 17:59:21 EET 2015
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table event
     *
     * @mbggenerated Sun Dec 06 17:59:21 EET 2015
     */
    int insert(Event record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table event
     *
     * @mbggenerated Sun Dec 06 17:59:21 EET 2015
     */
    int insertSelective(Event record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table event
     *
     * @mbggenerated Sun Dec 06 17:59:21 EET 2015
     */
    List<Event> selectByExample(EventExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table event
     *
     * @mbggenerated Sun Dec 06 17:59:21 EET 2015
     */
    Event selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table event
     *
     * @mbggenerated Sun Dec 06 17:59:21 EET 2015
     */
    int updateByExampleSelective(@Param("record") Event record, @Param("example") EventExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table event
     *
     * @mbggenerated Sun Dec 06 17:59:21 EET 2015
     */
    int updateByExample(@Param("record") Event record, @Param("example") EventExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table event
     *
     * @mbggenerated Sun Dec 06 17:59:21 EET 2015
     */
    int updateByPrimaryKeySelective(Event record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table event
     *
     * @mbggenerated Sun Dec 06 17:59:21 EET 2015
     */
    int updateByPrimaryKey(Event record);
}