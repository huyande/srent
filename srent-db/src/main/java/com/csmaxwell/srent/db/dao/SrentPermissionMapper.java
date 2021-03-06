package com.csmaxwell.srent.db.dao;

import com.csmaxwell.srent.db.domain.SrentPermission;
import com.csmaxwell.srent.db.domain.SrentPermissionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SrentPermissionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srent_permission
     *
     * @mbg.generated
     */
    long countByExample(SrentPermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srent_permission
     *
     * @mbg.generated
     */
    int deleteByExample(SrentPermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srent_permission
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srent_permission
     *
     * @mbg.generated
     */
    int insert(SrentPermission record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srent_permission
     *
     * @mbg.generated
     */
    int insertSelective(SrentPermission record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srent_permission
     *
     * @mbg.generated
     */
    SrentPermission selectOneByExample(SrentPermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srent_permission
     *
     * @mbg.generated
     */
    SrentPermission selectOneByExampleSelective(@Param("example") SrentPermissionExample example, @Param("selective") SrentPermission.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srent_permission
     *
     * @mbg.generated
     */
    List<SrentPermission> selectByExampleSelective(@Param("example") SrentPermissionExample example, @Param("selective") SrentPermission.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srent_permission
     *
     * @mbg.generated
     */
    List<SrentPermission> selectByExample(SrentPermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srent_permission
     *
     * @mbg.generated
     */
    SrentPermission selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") SrentPermission.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srent_permission
     *
     * @mbg.generated
     */
    SrentPermission selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srent_permission
     *
     * @mbg.generated
     */
    SrentPermission selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srent_permission
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") SrentPermission record, @Param("example") SrentPermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srent_permission
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") SrentPermission record, @Param("example") SrentPermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srent_permission
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(SrentPermission record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srent_permission
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(SrentPermission record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srent_permission
     *
     * @mbg.generated
     */
    int logicalDeleteByExample(@Param("example") SrentPermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srent_permission
     *
     * @mbg.generated
     */
    int logicalDeleteByPrimaryKey(Integer id);
}