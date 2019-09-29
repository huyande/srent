package com.csmaxwell.srent.db.dao;

import com.csmaxwell.srent.db.domain.SrentAddress;
import com.csmaxwell.srent.db.domain.SrentAddressExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SrentAddressMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srent_address
     *
     * @mbg.generated
     */
    long countByExample(SrentAddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srent_address
     *
     * @mbg.generated
     */
    int deleteByExample(SrentAddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srent_address
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srent_address
     *
     * @mbg.generated
     */
    int insert(SrentAddress record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srent_address
     *
     * @mbg.generated
     */
    int insertSelective(SrentAddress record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srent_address
     *
     * @mbg.generated
     */
    SrentAddress selectOneByExample(SrentAddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srent_address
     *
     * @mbg.generated
     */
    SrentAddress selectOneByExampleSelective(@Param("example") SrentAddressExample example, @Param("selective") SrentAddress.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srent_address
     *
     * @mbg.generated
     */
    List<SrentAddress> selectByExampleSelective(@Param("example") SrentAddressExample example, @Param("selective") SrentAddress.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srent_address
     *
     * @mbg.generated
     */
    List<SrentAddress> selectByExample(SrentAddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srent_address
     *
     * @mbg.generated
     */
    SrentAddress selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") SrentAddress.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srent_address
     *
     * @mbg.generated
     */
    SrentAddress selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srent_address
     *
     * @mbg.generated
     */
    SrentAddress selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srent_address
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") SrentAddress record, @Param("example") SrentAddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srent_address
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") SrentAddress record, @Param("example") SrentAddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srent_address
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(SrentAddress record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srent_address
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(SrentAddress record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srent_address
     *
     * @mbg.generated
     */
    int logicalDeleteByExample(@Param("example") SrentAddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srent_address
     *
     * @mbg.generated
     */
    int logicalDeleteByPrimaryKey(Integer id);
}