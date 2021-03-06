package com.csmaxwell.srent.db.dao;

import com.csmaxwell.srent.db.domain.SrentFootprint;
import com.csmaxwell.srent.db.domain.SrentFootprintExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SrentFootprintMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srent_footprint
     *
     * @mbg.generated
     */
    long countByExample(SrentFootprintExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srent_footprint
     *
     * @mbg.generated
     */
    int deleteByExample(SrentFootprintExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srent_footprint
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srent_footprint
     *
     * @mbg.generated
     */
    int insert(SrentFootprint record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srent_footprint
     *
     * @mbg.generated
     */
    int insertSelective(SrentFootprint record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srent_footprint
     *
     * @mbg.generated
     */
    SrentFootprint selectOneByExample(SrentFootprintExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srent_footprint
     *
     * @mbg.generated
     */
    SrentFootprint selectOneByExampleSelective(@Param("example") SrentFootprintExample example, @Param("selective") SrentFootprint.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srent_footprint
     *
     * @mbg.generated
     */
    List<SrentFootprint> selectByExampleSelective(@Param("example") SrentFootprintExample example, @Param("selective") SrentFootprint.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srent_footprint
     *
     * @mbg.generated
     */
    List<SrentFootprint> selectByExample(SrentFootprintExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srent_footprint
     *
     * @mbg.generated
     */
    SrentFootprint selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") SrentFootprint.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srent_footprint
     *
     * @mbg.generated
     */
    SrentFootprint selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srent_footprint
     *
     * @mbg.generated
     */
    SrentFootprint selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srent_footprint
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") SrentFootprint record, @Param("example") SrentFootprintExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srent_footprint
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") SrentFootprint record, @Param("example") SrentFootprintExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srent_footprint
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(SrentFootprint record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srent_footprint
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(SrentFootprint record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srent_footprint
     *
     * @mbg.generated
     */
    int logicalDeleteByExample(@Param("example") SrentFootprintExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srent_footprint
     *
     * @mbg.generated
     */
    int logicalDeleteByPrimaryKey(Integer id);
}