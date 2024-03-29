package com.dothings.client;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.dothings.model.QuestCompletion;
import com.dothings.model.QuestCompletionExample;

public interface QuestCompletionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table quest_completion
     *
     * @mbggenerated Sun Dec 06 17:59:21 EET 2015
     */
    int countByExample(QuestCompletionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table quest_completion
     *
     * @mbggenerated Sun Dec 06 17:59:21 EET 2015
     */
    int deleteByExample(QuestCompletionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table quest_completion
     *
     * @mbggenerated Sun Dec 06 17:59:21 EET 2015
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table quest_completion
     *
     * @mbggenerated Sun Dec 06 17:59:21 EET 2015
     */
    int insert(QuestCompletion record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table quest_completion
     *
     * @mbggenerated Sun Dec 06 17:59:21 EET 2015
     */
    int insertSelective(QuestCompletion record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table quest_completion
     *
     * @mbggenerated Sun Dec 06 17:59:21 EET 2015
     */
    List<QuestCompletion> selectByExample(QuestCompletionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table quest_completion
     *
     * @mbggenerated Sun Dec 06 17:59:21 EET 2015
     */
    QuestCompletion selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table quest_completion
     *
     * @mbggenerated Sun Dec 06 17:59:21 EET 2015
     */
    int updateByExampleSelective(@Param("record") QuestCompletion record, @Param("example") QuestCompletionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table quest_completion
     *
     * @mbggenerated Sun Dec 06 17:59:21 EET 2015
     */
    int updateByExample(@Param("record") QuestCompletion record, @Param("example") QuestCompletionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table quest_completion
     *
     * @mbggenerated Sun Dec 06 17:59:21 EET 2015
     */
    int updateByPrimaryKeySelective(QuestCompletion record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table quest_completion
     *
     * @mbggenerated Sun Dec 06 17:59:21 EET 2015
     */
    int updateByPrimaryKey(QuestCompletion record);
}