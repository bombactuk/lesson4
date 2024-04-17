<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Регистрация</title>
<link
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
	rel="stylesheet">
	
	<style>
	
body {
	padding-top: 40px;
	padding-bottom: 40px;
	background-color: #505050;
	color: #F77408;
}

#btnRegistration {
	background-color: #F77408;
}

</style>
</head>

<body>

	<div class="container mt-5">
		<h2>Регистрация пользователя</h2>
		<form action="MyController" method="post">
		    <input type="hidden" name="command" value="new_user_registration"/>
			<div class="form-group">
				<label for="username">Логин</label> <input type="text"
					class="form-control" id="username" name="username" required>
			</div>
			<div class="form-group">
				<label for="password">Пароль</label> <input type="password"
					class="form-control" id="password" name="password" required>
			</div>
			<div class="form-group">
				<label for="name">Имя</label> <input type="text"
					class="form-control" id="name" name="name" required>
			</div>
			<div class="form-group">
				<label for="dob">Дата рождения</label> <input type="date"
					class="form-control" id="dob" name="dob" required>
			</div>
			<div class="form-group">
				<label for="country">Страна проживания</label> <select
					class="form-control" id="country" name="country" required>
					<option value="">Выберите страну</option>
					<option value="russia">Россия</option>
					<option value="usa">США</option>
					<option value="germany">Германия</option>
					<option value="france">Франция</option>
					<!-- Добавьте другие страны по необходимости -->
				</select>
			</div>
			<button id="btnRegistration" type="submit" class="btn btn-primary">Зарегистрироваться</button>
		</form>
	</div>

</body>
</html>