<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>	
<!DOCTYPE html>
<html> 
<head>
<meta charset="UTF-8">
<title>Добро пожаловать в курс Java!</title>
<link
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
	rel="stylesheet">
<style>
body {
	padding-top: 40px;
	padding-bottom: 40px;
	background-color: #505050;
}

.container {
	max-width: 800px;
	padding: 15px;
	margin: auto;
	background-color: #A5A5A5;
	border-radius: 7px;
	box-shadow: 0 2px 4px rgba(0, 0, 0, 0.2);
}

.text-java {
	color: #F77408; /* Teal color */
}

.footer {
	text-align: center;
	padding: 20px 0;
	margin-top: 20px;
	border-top: 1px solid #000000;
	color: #000000;
}

.content {
	margin-top: 20px;
}
</style>
</head>
<body>

	<div class="container text-center">
		<h1 class="text-java">Добро пожаловать в курс Java!</h1>
		<p class="lead">Поздравляем с успешным входом на платформу. Вы
			готовы начать изучение?</p>
			
		
		<p class="lead"><c:out value="${requestScope.invitationMessage}" />	 </p>
		<div class="content">
			<a href="lessons.html" class="btn btn-lg btn-success">Перейти к
				урокам</a> <a href="profile.html" class="btn btn-lg btn-info"
				style="margin-left: 20px;">Мой профиль</a>
		</div>
		<div class="footer">
			<p>&copy; 2024 Изучаем Java. Все права защищены.</p>
		</div>
	</div>

</body>
</html>