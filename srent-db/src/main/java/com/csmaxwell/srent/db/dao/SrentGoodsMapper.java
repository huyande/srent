package com.csmaxwell.srent.db.dao;

import com.csmaxwell.srent.db.domain.SrentGoods;
import com.csmaxwell.srent.db.domain.SrentGoodsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SrentGoodsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srent_goods
     *
     * @mbg.generated
     */
    long countByExample(SrentGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srent_goods
     *
     * @mbg.generated
     */
    int deleteByExample(SrentGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srent_goods
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srent_goods
     *
     * @mbg.generated
     */
    int insert(SrentGoods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srent_goods
     *
     * @mbg.generated
     */
    int insertSelective(SrentGoods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srent_goods
     *
     * @mbg.generated
     */
    SrentGoods selectOneByExample(SrentGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srent_goods
     *
     * @mbg.generated
     */
    SrentGoods selectOneByExampleSelective(@Param("example") SrentGoodsExample example, @Param("selective") SrentGoods.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srent_goods
     *
     * @mbg.generated
     */
    SrentGoods selectOneByExampleWithBLOBs(SrentGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srent_goods
     *
     * @mbg.generated
     */
    List<SrentGoods> selectByExampleSelective(@Param("example") SrentGoodsExample example, @Param("selective") SrentGoods.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srent_goods
     *
     * @mbg.generated
     */
    List<SrentGoods> selectByExampleWithBLOBs(SrentGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srent_goods
     *
     * @mbg.generated
     */
    List<SrentGoods> selectByExample(SrentGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srent_goods
     *
     * @mbg.generated
     */
    SrentGoods selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") SrentGoods.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srent_goods
     *
     * @mbg.generated
     */
    SrentGoods selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srent_goods
     *
     * @mbg.generated
     */
    SrentGoods selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srent_goods
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") SrentGoods record, @Param("example") SrentGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srent_goods
     *
     * @mbg.generated
     */
    int updateByExampleWithBLOBs(@Param("record") SrentGoods record, @Param("example") SrentGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srent_goods
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") SrentGoods record, @Param("example") SrentGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srent_goods
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(SrentGoods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srent_goods
     *
     * @mbg.generated
     */
    int updateByPrimaryKeyWithBLOBs(SrentGoods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srent_goods
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(SrentGoods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srent_goods
     *
     * @mbg.generated
     */
    int logicalDeleteByExample(@Param("example") SrentGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srent_goods
     *
     * @mbg.generated
     */
    int logicalDeleteByPrimaryKey(Integer id);

    int logicalRentedByPrimaryKey(Integer id);
}