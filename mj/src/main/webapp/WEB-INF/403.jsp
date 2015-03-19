<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8" />
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<!-- Latest compiled and minified CSS -->
<link href="<c:url value='/resources/semantic.css'/>" rel="stylesheet"/>
<script src="<c:url value='/resources/semantic.js'/>"></script>
<title>403 - Alpha Co-Voiturage</title>
</head>
<body>
	<h2 class="ui center aligned icon header">
		<i class="circular car icon"></i>
		Alpha Co-Voiturage 
	 </h2>
	 
	<div class="container">
		<h2 class="ui center aligned icon header">
			<i class="circular ban icon"></i>
			Error 403 : Vous n'avez pas l'autorisation de circuler dans cette zone, <c:if test="${!empty username}">${username}</c:if>!
		</h2>
		<form style="margin-top:50px" action="<c:url value='/login'/>" method="get">
		 	<button class="ui red button" type="submit">
		    	<i class="reply icon"></i>
		     	Revenir
			</button>	
		</form>
	 </div>

 </body>
</html>
