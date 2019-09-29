package com.csmaxwell.srent.db.dao;

import com.csmaxwell.srent.db.domain.SrentCollect;
import com.csmaxwell.srent.db.domain.SrentCollectExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SrentCollectMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srent_collect
     *
     * @mbg.generated
     */
    long countByExample(SrentCollectExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srent_collect
     *
     * @mbg.generated
     */
    int deleteByExample(SrentCollectExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srent_collect
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srent_collect
     *
     * @mbg.generated
     */
    int insert(SrentCollect record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srent_collect
     *
     * @mbg.generated
     */
    int insertSelective(SrentCollect record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srent_collect
     *
     * @mbg.generated
     */
    SrentCollect selectOneByExample(SrentCollectExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srent_collect
     *
     * @mbg.generated
     */
    SrentCollect selectOneByExampleSelective(@Param("example") SrentCollectExample example, @Param("selective") SrentCollect.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srent_collect
     *
     * @mbg.generated
     */
    List<SrentCollect> selectByExampleSelective(@Param("example") SrentCollectExample example, @Param("selective") SrentCollect.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srent_collect
     *
     * @mbg.generated
     */
    List<SrentCollect> selectByExample(SrentCollectExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srent_collect
     *
     * @mbg.generated
     */
    SrentCollect selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") SrentCollect.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srent_collect
     *
     * @mbg.generated
     */
    SrentCollect selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srent_collect
     *
     * @mbg.generated
     */
    SrentCollect selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srent_collect
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") SrentCollect record, @Param("example") SrentCollectExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srent_collect
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") SrentCollect record, @Param("example") SrentCollectExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srent_collect
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(SrentCollect record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srent_collect
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(SrentCollect record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srent_collect
     *
     * @mbg.generated
     */
    int logicalDeleteByExample(@Param("example") SrentCollectExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srent_collect
     *
     * @mbg.generated
     */
    int logicalDeleteByPrimaryKey(Integer id);
}