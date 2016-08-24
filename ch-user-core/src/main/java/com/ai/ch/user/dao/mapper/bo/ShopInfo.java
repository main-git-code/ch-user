package com.ai.ch.user.dao.mapper.bo;

import java.sql.Timestamp;

public class ShopInfo {
    private String userId;

    private Long depositBalance;

    private String periodType;

    private String rentCycleType;

    private Long rentFee;

    private Integer ratio;

    private Integer rank;

    private String rankLogo;

    private String shopName;

    private String shopDesc;

    private String busiType;

    private Integer goodsNum;

    private Integer hasExperi;

    private String ecommOwner;

    private Timestamp createTime;

    private String tenantId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public Long getDepositBalance() {
        return depositBalance;
    }

    public void setDepositBalance(Long depositBalance) {
        this.depositBalance = depositBalance;
    }

    public String getPeriodType() {
        return periodType;
    }

    public void setPeriodType(String periodType) {
        this.periodType = periodType == null ? null : periodType.trim();
    }

    public String getRentCycleType() {
        return rentCycleType;
    }

    public void setRentCycleType(String rentCycleType) {
        this.rentCycleType = rentCycleType == null ? null : rentCycleType.trim();
    }

    public Long getRentFee() {
        return rentFee;
    }

    public void setRentFee(Long rentFee) {
        this.rentFee = rentFee;
    }

    public Integer getRatio() {
        return ratio;
    }

    public void setRatio(Integer ratio) {
        this.ratio = ratio;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public String getRankLogo() {
        return rankLogo;
    }

    public void setRankLogo(String rankLogo) {
        this.rankLogo = rankLogo == null ? null : rankLogo.trim();
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName == null ? null : shopName.trim();
    }

    public String getShopDesc() {
        return shopDesc;
    }

    public void setShopDesc(String shopDesc) {
        this.shopDesc = shopDesc == null ? null : shopDesc.trim();
    }

    public String getBusiType() {
        return busiType;
    }

    public void setBusiType(String busiType) {
        this.busiType = busiType == null ? null : busiType.trim();
    }

    public Integer getGoodsNum() {
        return goodsNum;
    }

    public void setGoodsNum(Integer goodsNum) {
        this.goodsNum = goodsNum;
    }

    public Integer getHasExperi() {
        return hasExperi;
    }

    public void setHasExperi(Integer hasExperi) {
        this.hasExperi = hasExperi;
    }

    public String getEcommOwner() {
        return ecommOwner;
    }

    public void setEcommOwner(String ecommOwner) {
        this.ecommOwner = ecommOwner == null ? null : ecommOwner.trim();
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId == null ? null : tenantId.trim();
    }
}