package com.dothings.client;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.dothings.model.Tournament;
import com.dothings.model.TournamentExample;

public interface TournamentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tournament
     *
     * @mbggenerated Sun Dec 06 17:59:21 EET 2015
     */
    int countByExample(TournamentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tournament
     *
     * @mbggenerated Sun Dec 06 17:59:21 EET 2015
     */
    int deleteByExample(TournamentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tournament
     *
     * @mbggenerated Sun Dec 06 17:59:21 EET 2015
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tournament
     *
     * @mbggenerated Sun Dec 06 17:59:21 EET 2015
     */
    int insert(Tournament record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tournament
     *
     * @mbggenerated Sun Dec 06 17:59:21 EET 2015
     */
    int insertSelective(Tournament record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tournament
     *
     * @mbggenerated Sun Dec 06 17:59:21 EET 2015
     */
    List<Tournament> selectByExample(TournamentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tournament
     *
     * @mbggenerated Sun Dec 06 17:59:21 EET 2015
     */
    Tournament selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tournament
     *
     * @mbggenerated Sun Dec 06 17:59:21 EET 2015
     */
    int updateByExampleSelective(@Param("record") Tournament record, @Param("example") TournamentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tournament
     *
     * @mbggenerated Sun Dec 06 17:59:21 EET 2015
     */
    int updateByExample(@Param("record") Tournament record, @Param("example") TournamentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tournament
     *
     * @mbggenerated Sun Dec 06 17:59:21 EET 2015
     */
    int updateByPrimaryKeySelective(Tournament record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tournament
     *
     * @mbggenerated Sun Dec 06 17:59:21 EET 2015
     */
    int updateByPrimaryKey(Tournament record);
}