<%@taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
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
<title>Accueil - Alpha Co-Voiturage</title>
</head>
<body>
	 <h2 class="ui center aligned icon header">
		<i class="circular car icon"></i>
		Alpha Co-Voiturage 
	 </h2>
	 
	 <div style="float:right; margin-top:-50px; margin-right:20px">
	 	<i style="display:inline" class="user icon">  <b>${username}</b></i>
	 	<br/>
	 	<a href="<c:url value='/login?logout'/>">Se déconnecter</a>
	 </div>
	 
     <div class="container">
		 <form class="ui form">
		 <div id="top">
			 <button class="ui purple button">Creer un trajet</button>
	     </div>
	     </form>
	     <br/>
	     <form class="ui form">
		 <div id="bot">
			 <button class="ui teal button">Rejoindre un trajet</button>
		 </div>
		 </form>
	 </div>
</body>
</html>