package com.cxg.sell.entity;


public class SellInfoEntity {

  private long id;
  private java.sql.Timestamp sellDate;
  private long sellName;
  private double sellNum;
  private double sellPrice;
  private long sellType;
  private String sellRemarkes;
  private java.sql.Timestamp addDate;
  private java.sql.Timestamp updateDate;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public java.sql.Timestamp getSellDate() {
    return sellDate;
  }

  public void setSellDate(java.sql.Timestamp sellDate) {
    this.sellDate = sellDate;
  }


  public long getSellName() {
    return sellName;
  }

  public void setSellName(long sellName) {
    this.sellName = sellName;
  }


  public double getSellNum() {
    return sellNum;
  }

  public void setSellNum(double sellNum) {
    this.sellNum = sellNum;
  }


  public double getSellPrice() {
    return sellPrice;
  }

  public void setSellPrice(double sellPrice) {
    this.sellPrice = sellPrice;
  }


  public long getSellType() {
    return sellType;
  }

  public void setSellType(long sellType) {
    this.sellType = sellType;
  }


  public String getSellRemarkes() {
    return sellRemarkes;
  }

  public void setSellRemarkes(String sellRemarkes) {
    this.sellRemarkes = sellRemarkes;
  }


  public java.sql.Timestamp getAddDate() {
    return addDate;
  }

  public void setAddDate(java.sql.Timestamp addDate) {
    this.addDate = addDate;
  }


  public java.sql.Timestamp getUpdateDate() {
    return updateDate;
  }

  public void setUpdateDate(java.sql.Timestamp updateDate) {
    this.updateDate = updateDate;
  }

}
