<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>

<div>
	<form action="LoginMainController" class="login" style="height:330px;">
		회원님의 아이디는<br><br><p style="font-weight: 1000">${searchId }</p><br>입니다.<br><br><br>
		<button>LOGIN PAGE</button><br><br><br>
  		<a href="searchPwC" style="color:gray; font-size: 6pt;" class="signup">비밀번호 찾기</a>
	</form>
</div>

</body>
</html>