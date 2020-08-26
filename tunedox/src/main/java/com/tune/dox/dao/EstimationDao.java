package com.tune.dox.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.tune.dox.dto.EstimationDto;
/**
* ユーザ別書籍マスタ用DAO
* @author Obara
* @since 0.1
*/
public class EstimationDao {
  private Connection con = null;
  private PreparedStatement ps = null;
  private ResultSet rslt = null;

  /**
  * 入力されたパスワードをもとにログイン情報を取得
  * @param id 評価ID
  * @param user_id ユーザーID
  * @param book_id 書籍ID
  * @param estimation 評価点
  * @param comment 評価コメント
  * @param category_id 分類ID
  * @param status 読書状態
  * @param update_datetime 更新日時
  * @param update_user 更新者
  * @param del_flg 削除フラグ
  */

  public ArrayList<EstimationDto> searchEstimation() {
    StringBuilder sb = new StringBuilder();
    sb.append("id");
    sb.append("user_id");
    sb.append("book_Id");
    sb.append("estimotion");
    sb.append("comment");
    sb.append("category_id");
    sb.append("status");

    ArrayList<EstimationDto> estimationList = new ArrayList<EstimationDto>();

    try (Connection con = DriverManager.getConnection(null)) {

      ps = con.prepareStatement(sb.toString());

      rslt = ps.executeQuery();

      while (rslt.next()) {
        EstimationDto returnEstimation = new EstimationDto(0,0,0,0,null,0,0,null,null,0);
        returnEstimation.setId(rslt.getInt("id"));
        returnEstimation.setUserId(rslt.getInt("user_id"));
        returnEstimation.setBookId(rslt.getInt("book_id"));
        returnEstimation.setEstimation(rslt.getInt("estimation"));
        returnEstimation.setComment(rslt.getString("comment"));
        returnEstimation.setCategoryId(rslt.getInt("category_id"));
        returnEstimation.setStatus(rslt.getInt("status"));
        returnEstimation.setUpdateDatetime(rslt.getString("update_datetime"));
        returnEstimation.setUpdateUser(rslt.getString("update_user"));
        returnEstimation.setDelFlg(rslt.getInt("del_flg"));

        estimationList.add(returnEstimation);
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
    return estimationList;
  }
}
