import dto.UserInfoDto;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
/**
* ログイン用DAO
* @author Obara
* @since 0.1
*/
public class UserInfoDao {
  //コネクションするためのクラス
  private Connection con = null;
  //ステートメントするための型
  private PreparedStatement ps = null;
  //リザルトセット
  private ResultSet rslt = null;

  /**
  * 入力されたパスワードをもとにログイン情報を取得
  * @param mail ログインメールアドレス
  * @param pswd パスワード
  */
  //DBでmailとpswdが一致するレコードを取得するためのSQL文をストリングビルダーもしくは
  //DriverManagerで生成
  public UserInfoDto searchLoginInfo(String mail, String pswd) {
    StringBuilder sb = new StringBuilder();
    sb.append("select ");
    sb.append("mail ");
    sb.append("from ");
    sb.append("UserInfo ");
    sb.append("where ");
    sb.append("mail=? ");
    sb.append("and ");
    sb.append("pswd=? ");
    //コネクションをする
    UserInfoDto returnUser = new UserInfoDto();
    //getConnectionに引数が必要かもしれない↓
    try (con = DriverManager.getConnection()) {

      ps = con.prepareStatement(sb.toString());
      ps.setString(1, mail);
      ps.setString(2, pswd);

      rslt = ps.executeQuery();

      if (rslt.next()) {
        //returnUser.setId(rslt.getInt("id"));
      //  returnUser.setName(rslt.getInt("name"));
        returnUser.setMail(rslt.getString("mail"));
        returnUser.setPswd(rslt.getString("pswd"));
        //returnUser.setLastLogin(rslt.getString("last_login"));
        //returnUser.setUpdateDatetime(rslt.getString("update_datetime"));
        //returnUser.setUpdateUser(rslt.getString("update_user"));
        //returnUser.setDelFlg(rslt.getInt("del_flg"));
      } else {
        return null;
      }
    } catch (SQLException e) {
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

    return returnUser;
    //ステートメントクラスを生成
    //リザルトセットクラスの生成

  }


  //IDのパラメータを設定
  //パスワードのパラメータを設定

  //検索結果が見つかった場合はユーザー情報を取得
  //リザルトセットを終了
  //ステートメントを終了
  //コネクションを終了
}
//リターン
