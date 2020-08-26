package com.tune.dox.dto;

public class CommonDto {

  private String update_datetime;
  private String update_user;
  private int del_flg;


  public CommonDto(String datetime,String user,int flg) {
    this.update_datetime = datetime;
    this.update_user = user;
    this.del_flg = flg;
  }

  public String getUpdateDatetime() {
    return update_datetime;
  }
  public String getUpdateUser() {
    return update_user;
  }
  public int getDelFlg() {
    return del_flg;
  }

  public void setUpdateDatetime(String datetime) {
    this.update_datetime = datetime;
  }
  public void setUpdateUser(String user) {
    this.update_user = user;
  }
  public void setDelFlg(int flg) {
    this.del_flg = flg;
  }

}
