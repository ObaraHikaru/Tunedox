import dto.EstimationDto;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
/**
* ユーザ別書籍マスタ用DAO
* @author Obara
* @since 0.1
*/
public class EstimationDao {
  private Connestion con = null;
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

    ArrayList<EstimationDto> estimationList = new ArrayList<EstimationDto>;

    try (con = DriverManager.getConnection()) {

      ps = con.prepareStatement(sb.toString());

      rslt = ps.exexuteQuery();

      while (rslt.next()) {
        EstimationDto returnEstimation = new EstimationDto();
        returnEstimation.setId(rslt.getInt("id"));
        returnEstimation.setUserId(rslt.getInt("user_id"));
        returnEstimation.setBookId(rslt.getInt("book_id"));
        returnEstimation.setEstimation(rslt.getInt("estimation"));
        returnEstimation.setComment(rslt.getString("comment"));
        returnEstimation.setCategoryId(rslt.getInt("category_id"));
        returnEstimation.setStatus(rslt.getInt("status"));
        returnBook.setUpdateDatetime(rslt.getString("update_datetime"));
        returnBook.setUpdateUser(rslt.getString("update_user"));
        returnBook.setDelFlg(rslt.getInt("del_flg"));

        estimationList.add(returnEstimation);
      }

    } catch (SQLExeption e) {
      e.printStackTrace();
      return null;
    } finally {
      if (rslt != null) {
        try {
          rslt.close();
        } catch (SQLExeption e) {
          e.printStackTrace();
        }
        rslt = null;
      }
      if (ps != null) {
        try {
          ps.close();
        } catch (SQLExeption e) {
          e.printStackTrace();
        }
        ps = null;
      }
      if (con != null) {
        try {
          con.close();
        } catch (SQLExeption e) {
          e.printStackTrace();
        }
        con = null;
      }
    }
    return estimationList;
  }
}
