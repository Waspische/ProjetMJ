<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<!-- Latest compiled and minified CSS -->
<link href="<c:url value='/resources/semantic.css'/>" rel="stylesheet"/>
<script src="<c:url value='/resources/semantic.js'/>"></script>
<title>Connexion - Alpha Co-Voiturage</title>
<meta name="description" content="Connectez-vous">
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
</head>
<body>
	 <h2 class="ui center aligned icon header">
		<i class="circular car icon"></i>
		Alpha Co-Voiturage 
	 </h2>

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
		 <c:if test="${not empty create}">
			<div class="msg">${create}</div>
		 </c:if>
		 <form style="margin-top:50px" class="ui form" action="<c:url value='/j_spring_security_check' />" method='POST'>
	         <div class="required field">
	         <label>Username</label>
			  <div class="ui icon input">
				<input type="text" placeholder="Login" name="username">
	         	<i class="user icon"></i>
	         	</div>
	         </div>
	         <br/>
	         <div class="required field">
	         <label>Password</label>
				  <div class="ui icon input">
	            <input type="password" placeholder="Mot de passe" name="password">
	         	<i class="lock icon"></i>
	         	</div>
	         </div>
	         <br/>
			 <button type="submit" class="ui green button">Connexion</button>
		 </form>
		 <form style="margin-top:50px" class="ui form" action="<c:url value='/nouveau_compte' />" method='GET'>
		 	<button type="submit" class="ui blue button">Créer un compte</button>
		 </form>
	 </div>
</body>
</html>