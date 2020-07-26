package dto;

public class UserInfoDto extends Common{

  private int id;
  private int name;
  private String mail;
  private String pswd;
  private String last_login;

  public UserInfoDto(int id, int name, String mail, String pswd, String last_login) {
    super(String datetime, String user, int flg);
    this.id = id;
    this.name = name;
    this.mail = mail;
    this.pswd = pswd;
    this.last_login = last_login;
  }

  public int getId() {
    return id;
  }
  public int getName() {
    return name;
  }
  public String getMail() {
    return mail;
  }
  public String getPswd() {
    return pswd;
  }
  public String getLastLogin() {
    return last_login;
  }

  public void setId(int id) {
    this.id = id;
  }
  public void setName(int name) {
    this.name = name;
  }
  public void setMail(String mail) {
    this.mail = mail;
  }
  public void setPswd(String pswd) {
    this.pswd = pswd;
  }
  public void setLastLogin(String last_login) {
    this.last_login = last_login;
  }
}
