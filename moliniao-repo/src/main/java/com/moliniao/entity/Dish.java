package com.moliniao.entity;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "cms_dish")
public class Dish {
    /**
     * 主键
     */
    @Id
    private String id;

    /**
     * 菜品名称
     */
    private String name;

    /**
     * 菜品价格
     */
    private BigDecimal price;

    /**
     * 菜品状态:0-未上架;1-上架
     */
    private Integer status;

    /**
     * 菜品类型
     */
    @Column(name = "type_id")
    private String typeId;

    /**
     * 菜品单位
     */
    @Column(name = "unit_id")
    private String unitId;

    /**
     * 菜品周期
     */
    @Column(name = "period_id")
    private String periodId;

    /**
     * 组织id
     */
    @Column(name = "organization_id")
    private String organizationId;

    /**
     * 备注
     */
    private String remark;

    /**
     * 图片地址
     */
    private String image;

    private String creator;

    @Column(name = "create_time")
    private Date createTime;

    private String updator;

    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 获取主键
     *
     * @return id - 主键
     */
    public String getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id 主键
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * 获取菜品名称
     *
     * @return name - 菜品名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置菜品名称
     *
     * @param name 菜品名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取菜品价格
     *
     * @return price - 菜品价格
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * 设置菜品价格
     *
     * @param price 菜品价格
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * 获取菜品状态:0-未上架;1-上架
     *
     * @return status - 菜品状态:0-未上架;1-上架
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置菜品状态:0-未上架;1-上架
     *
     * @param status 菜品状态:0-未上架;1-上架
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取菜品类型
     *
     * @return type_id - 菜品类型
     */
    public String getTypeId() {
        return typeId;
    }

    /**
     * 设置菜品类型
     *
     * @param typeId 菜品类型
     */
    public void setTypeId(String typeId) {
        this.typeId = typeId == null ? null : typeId.trim();
    }

    /**
     * 获取菜品单位
     *
     * @return unit_id - 菜品单位
     */
    public String getUnitId() {
        return unitId;
    }

    /**
     * 设置菜品单位
     *
     * @param unitId 菜品单位
     */
    public void setUnitId(String unitId) {
        this.unitId = unitId == null ? null : unitId.trim();
    }

    /**
     * 获取菜品周期
     *
     * @return period_id - 菜品周期
     */
    public String getPeriodId() {
        return periodId;
    }

    /**
     * 设置菜品周期
     *
     * @param periodId 菜品周期
     */
    public void setPeriodId(String periodId) {
        this.periodId = periodId == null ? null : periodId.trim();
    }

    /**
     * 获取组织id
     *
     * @return organization_id - 组织id
     */
    public String getOrganizationId() {
        return organizationId;
    }

    /**
     * 设置组织id
     *
     * @param organizationId 组织id
     */
    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId == null ? null : organizationId.trim();
    }

    /**
     * 获取备注
     *
     * @return remark - 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置备注
     *
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * 获取图片地址
     *
     * @return image - 图片地址
     */
    public String getImage() {
        return image;
    }

    /**
     * 设置图片地址
     *
     * @param image 图片地址
     */
    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
    }

    /**
     * @return creator
     */
    public String getCreator() {
        return creator;
    }

    /**
     * @param creator
     */
    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    /**
     * @return create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * @return updator
     */
    public String getUpdator() {
        return updator;
    }

    /**
     * @param updator
     */
    public void setUpdator(String updator) {
        this.updator = updator == null ? null : updator.trim();
    }

    /**
     * @return update_time
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * @param updateTime
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}