public class EstimationDto extends Common {

  private int id;
  private int user_id;
  private int book_id;
  private int estimation;
  private String comment;
  private int category_id;
  private int status;



  public EstimationDto(int id,int user_id,int book_id,int estimation,String comment,
                    int category_id,int status) {
    super(String datetime,String user,int flg);
    this.id = id;
    this.user_id = user_id;
    this.book_id = book_id;
    this.estimation = estimation;
    this.comment = comment;
    this.category_id = category_id;
    this.status = status;
  }

  public int getId() {
    return id;
  }
  public int getUserId() {
    return user_id;
  }
  public int getBookId() {
    return book_id;
  }
  public int getEstimation() {
    return estimation;
  }
  public String getComment() {
    return comment;
  }
  public int getCategoryId() {
    return category_id;
  }
  public int getStatus() {
    return status;
  }

  public void setId(int id) {
    this.id = id;
  }
  public void setUserId(int user_id) {
    this.user_id = user_id;
  }
  public void setBookId(int book_id) {
    this.book_id = book_id;
  }
  public void setEstimation(int estimation) {
    this.estimation = estimation;
  }
  public void setComment(String comment) {
    this.comment = comment;
  }
  public void setCategoryId(int category_id) {
    this.category_id = category_id;
  }
  public void setStatus(int status) {
    this.status = status;
  }


}
