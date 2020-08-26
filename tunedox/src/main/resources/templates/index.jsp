<%@ page language="java" contentType="text/html; charset=UTF-8" %>

<!DOCTYPE html>

<html lang="ja">

<head>
  <meta charaset="UTF-8">
  <title>TuneDoxログイン画面</title>
  <link rel="stylesheet" href="index.css">
</head>

<body>
  <form action="/Login" method="post">

	  <div class="login">
	    <div>
	      <label>メールアドレス</label>
	    </div>
	    <div>
	      <input type="text">
	    </div>
	  </div>

	  <div class="input_form">
	    <div>
	      <label>パスワード</label>
	    </div>
	    <div>
	      <input type="password">
	    </div>
	    <div>
	      <input type="submit" value="ログイン">
	      <!--ここにルーティングを入れる-->
	      <input type="reset" value="リセット">
	    </div>
	  </div>


  </form>
</body>
