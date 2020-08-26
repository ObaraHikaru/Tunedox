package com.tune.dox.servlet;
/**
* ログイン用サーブレット
* @author Obara
* @since 0.1
*/
@WebServlet("/Login")
public class Login extends HttpServlet {
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
      response.setContentType("text/html; charset=UTF-8");
      request.getRequestDispatcher("/templates/index.jsp").forward(request,response);
    }
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
      HttpSession session = request.getSession();
      String mail = request.getParameter("mail");
      String pswd = request.getParameter("pswd");
      UserInfoDao userInfoDao = new UserInfoDao();
      UserInfoDto userInfoDto = userInfoDao.serchLoginInfo(mail,pswd);
      //エラーの場合
    }
    //ログイン時セッション保存
    //画面遷移



}
