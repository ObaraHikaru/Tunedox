package com.tune.dox.dto;

public class CategoriesDto extends CommonDto {

  private int id;
  private String category;
  private String subCategory;

  public CategoriesDto(int id,String category,String subCategory,String datetime,
		  				String user,int flg) {
    super(datetime,user,flg);
    this.id = id;
    this.category = category;
    this.subCategory = subCategory;
  }

  public int getId() {
    return id;
  }
  public String getCategory() {
    return category;
  }
  public String getSubCategory() {
    return subCategory;
  }

  public void setId(int id) {
    this.id = id;
  }
  public void setCategory(String category) {
    this.category = category;
  }
  public void setSubcategory(String subCategory) {
    this.subCategory = subCategory;
  }
}
