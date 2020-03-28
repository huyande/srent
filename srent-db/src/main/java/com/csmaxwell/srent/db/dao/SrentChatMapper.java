package com.csmaxwell.srent.db.dao;

import com.csmaxwell.srent.db.domain.SrentChat;
import com.csmaxwell.srent.db.domain.SrentChatExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SrentChatMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srent_chat
     *
     * @mbg.generated
     */
    long countByExample(SrentChatExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srent_chat
     *
     * @mbg.generated
     */
    int deleteByExample(SrentChatExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srent_chat
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srent_chat
     *
     * @mbg.generated
     */
    int insert(SrentChat record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srent_chat
     *
     * @mbg.generated
     */
    int insertSelective(SrentChat record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srent_chat
     *
     * @mbg.generated
     */
    SrentChat selectOneByExample(SrentChatExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srent_chat
     *
     * @mbg.generated
     */
    SrentChat selectOneByExampleSelective(@Param("example") SrentChatExample example, @Param("selective") SrentChat.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srent_chat
     *
     * @mbg.generated
     */
    SrentChat selectOneByExampleWithBLOBs(SrentChatExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srent_chat
     *
     * @mbg.generated
     */
    List<SrentChat> selectByExampleSelective(@Param("example") SrentChatExample example, @Param("selective") SrentChat.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srent_chat
     *
     * @mbg.generated
     */
    List<SrentChat> selectByExampleWithBLOBs(SrentChatExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srent_chat
     *
     * @mbg.generated
     */
    List<SrentChat> selectByExample(SrentChatExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srent_chat
     *
     * @mbg.generated
     */
    SrentChat selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") SrentChat.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srent_chat
     *
     * @mbg.generated
     */
    SrentChat selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srent_chat
     *
     * @mbg.generated
     */
    SrentChat selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srent_chat
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") SrentChat record, @Param("example") SrentChatExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srent_chat
     *
     * @mbg.generated
     */
    int updateByExampleWithBLOBs(@Param("record") SrentChat record, @Param("example") SrentChatExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srent_chat
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") SrentChat record, @Param("example") SrentChatExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srent_chat
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(SrentChat record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srent_chat
     *
     * @mbg.generated
     */
    int updateByPrimaryKeyWithBLOBs(SrentChat record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srent_chat
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(SrentChat record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srent_chat
     *
     * @mbg.generated
     */
    int logicalDeleteByExample(@Param("example") SrentChatExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srent_chat
     *
     * @mbg.generated
     */
    int logicalDeleteByPrimaryKey(Integer id);
}