package com.tune.dox.dto;

public class BookInfoDto extends CommonDto {

  private int id;
  private int isbn_code;
  private String name;
  private String author;
  private String publisher;
  private int price;
  private int category_id;

  public BookInfoDto(int id,int isbn_code,String name,String author,String publisher,
                  int price,int category_id,String datetime,String user,int flg) {
    super(datetime,user,flg);
    this.id = id;
    this.isbn_code = isbn_code;
    this.name = name;
    this.author = author;
    this.publisher = publisher;
    this.price = price;
    this.category_id = category_id;

  }

  public int getId() {
    return id;
  }
  public int getIsbnCode() {
    return isbn_code;
  }
  public String getName() {
    return name;
  }
  public String getAuthor() {
    return author;
  }
  public String getPublisher() {
    return publisher;
  }
  public int getPrice() {
    return price;
  }
  public int getCategoryId() {
    return category_id;
  }

  public void setId(int id) {
    this.id = id;
  }
  public void setIsbnCode(int isbn_code) {
    this.isbn_code = isbn_code;
  }
  public void setName(String name) {
    this.name = name;
  }
  public void setAuthor(String author) {
    this.author = author;
  }
  public void setPublisher(String publisher) {
    this.publisher = publisher;
  }
  public void setPrice(int price) {
    this.price = price;
  }
  public void setCategoryId(int category_id) {
    this.category_id = category_id;
  }

}
