package com.tune.dox.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.tune.dox.dto.BookInfoDto;
/**
* 書籍情報管理用DAO
* @author Obara
* @since 0.1
*/
public class BookInfoDao {
  private Connection con = null;
  private PreparedStatement ps = null;
  private ResultSet rslt = null;

  /**
  * 入力されたパスワードをもとにログイン情報を取得
  * @param id 書籍ID
  * @param isbn_code ISBNコード
  * @param name 書籍名
  * @param author 著者名
  * @param publisher 出版社名
  * @param price 定価
  * @param category_id 分類ID
  * @param update_datetime 更新日時
  * @param update_user 更新者
  * @param del_flg 削除フラグ
  */

  public ArrayList<BookInfoDto> searchBookInfo() {
    StringBuilder sb = new StringBuilder();
    sb.append("id,");
    sb.append("isbn_code,");
    sb.append("name,");
    sb.append("author,");
    sb.append("publisher,");
    sb.append("price,");
    sb.append("category_id");

    ArrayList<BookInfoDto> bookList = new ArrayList<BookInfoDto>();

    try (Connection con = DriverManager.getConnection(null)) {

      ps = con.prepareStatement(sb.toString());

      rslt = ps.executeQuery();

      while (rslt.next()) {
        BookInfoDto returnBook = new BookInfoDto(0,0,null,null,null,0,0,null,null,0);
        returnBook.setId(rslt.getInt("id"));
        returnBook.setIsbnCode(rslt.getInt("isbn_code"));
        returnBook.setName(rslt.getString("name"));
        returnBook.setAuthor(rslt.getString("author"));
        returnBook.setPublisher(rslt.getString("publisher"));
        returnBook.setPrice(rslt.getInt("price"));
        returnBook.setCategoryId(rslt.getInt("category_id"));
        returnBook.setUpdateDatetime(rslt.getString("update_datetime"));
        returnBook.setUpdateUser(rslt.getString("update_user"));
        returnBook.setDelFlg(rslt.getInt("del_flg"));

        bookList.add(returnBook);
      }

    } catch (SQLException e) {
      e.printStackTrace();
      return null;
    } finally {
      if (rslt != null) {
        try {
          rslt.close();
        } catch (SQLException e) {
          e.printStackTrace();
        }
        rslt = null;
      }
      if (ps != null) {
        try {
          ps.close();
        } catch (SQLException e) {
          e.printStackTrace();
        }
        ps = null;
      }
      if (con != null) {
        try {
          con.close();
        } catch (SQLException e) {
          e.printStackTrace();
        }
        con = null;
      }
    }
    return bookList;



  }
}
