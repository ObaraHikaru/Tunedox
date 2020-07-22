import dto.LoginDto;
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
public class LoginDao {
  //コネクションするためのクラス
  //ステートメントするための型
  //リザルトセット
  /**
  * 入力されたパスワードをもとにログイン情報を取得
  * @param id ログインID
  * @param pswd パスワード
  */
  //DBでidとpswdが一致するレコードを取得するためのSQL文をストリングビルダーもしくは
  //DriverManagerで生成
  //コネクションをする
  //ステートメントクラスを生成
  //IDのパラメータを設定
  //パスワードのパラメータを設定

  //検索結果が見つかった場合はユーザー情報を取得
  //リザルトセットを終了
  //ステートメントを終了
  //コネクションを終了
}
//リターン
