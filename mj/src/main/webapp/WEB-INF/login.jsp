<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<!-- Latest compiled and minified CSS -->
<link href="/resources/dist/semantic.css" rel="stylesheet"/>
<script src="/resources/dist/semantic.js"></script>
<title>Connexion - Alpha Co-Voiturage</title>
<meta name="description" content="Connectez-vous">
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
<style>
.error {
	padding: 15px;
	margin-bottom: 20px;
	border: 1px solid transparent;
	border-radius: 4px;
	color: #a94442;
	background-color: #f2dede;
	border-color: #ebccd1;
}
 
.msg {
	padding: 15px;
	margin-bottom: 20px;
	border: 1px solid transparent;
	border-radius: 4px;
	color: #31708f;
	background-color: #d9edf7;
	border-color: #bce8f1;
}
</style>
</head>
<body>
	 <h2 class="ui center aligned icon header">
		<i class="circular car icon"></i>
		Alpha Co-Voiturage 
	 </h2>
	 <div class="ui divider"></div>
     <div class="container">
		 <h2 class="ui dividing header">
			Connexion : 
		 </h2>
		 <c:if test="${not empty error}">
			<div class="error">${error}</div>
		 </c:if>
		 <c:if test="${not empty msg}">
			<div class="msg">${msg}</div>
		 </c:if>
		 <form class="ui form" action="<c:url value='/j_spring_security_check' />" method='POST'>
	         <div class="field">
				<input type="text" placeholder="Login" name="username">
	         </div>
	         <div class="field">
	            <input type="password" placeholder="Mot de passe" name="password">
	         </div>
			 <button type="submit" class="ui green button">Connexion</button>
			 <div class="ui blue button">Creer un compte</div>
			 <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
		 </form>
	 </div>
</body>
</html>