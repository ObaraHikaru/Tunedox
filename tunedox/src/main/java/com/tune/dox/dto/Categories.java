public class Categories extends Common {

  private int id;
  private String category;
  private String subCategory;

  public Categories(int id,String category,String subCategory) {
    super(String datetime,String user,int flg);
    this.id = id;
    this.category = category;
    this.subcategory = subCategory;
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
