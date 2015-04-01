<%@taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8" />
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<!-- Latest compiled and minified CSS -->
<link href="<c:url value='/resources/semantic.css'/>" rel="stylesheet"/>
<script src="<c:url value='/resources/semantic.js'/>"></script>
<title>Création trajet - Alpha Co-Voiturage</title>
</head>
<body>
	 <h2 class="ui center aligned icon header">
		<i class="circular car icon"></i>
		Alpha Co-Voiturage 
	 </h2>
	 
	 <div style="float:right; margin-top:-50px; margin-right:20px">
	 	<i style="display:inline" class="user icon">  <b>${username}</b></i>
	 	<br/>
		<a href="<c:url value="/j_spring_security_logout"/>">Se déconnecter</a>
	 </div>
	 
     <div class="container">
	 	<h2 class="ui dividing header">Créer un trajet</h2>
	 	
	 	<c:if test="${not empty error}">
			<div class="error">${error}</div>
		</c:if>
	 	
	 	<form:form modelAttribute="trajetForm" class="ui form" method="post" style="max-width: 600px">
		    <div class="required field">
				<label>Type de voiture</label>
				<div class="ui icon input">
					<form:input type="text" placeholder="Type de voiture" path="typeVoiture"/>
			  	</div>
			</div>
		    <div class="required field">
				<label>Ville de départ</label>
				<div class="ui icon input">
					<form:input type="text" placeholder="Ville de départ" path="pointDepart"/>
			  	</div>
			</div>
		   	<div class="required field">
			  	<label>Ville d'arrivée</label>
			  	<div class="ui icon input">
					<form:input type="text" placeholder="Ville d'arrivée" path="pointArrivee"/>
			  	</div>
			</div>
		   	<div class="required field">
			  	<label>Date de depart</label>
			  	<div class="ui icon input">
					<form:input type="text" placeholder="DD/MM/YYYY" path="dateDepart"/>
			  	</div>
			</div>	
		   	<div class="required field">
			  	<label>Nombre de passagers</label>
			  	<div class="ui icon input">
			  		<form:input type="text" placeholder="Nombre de passagers" path="nbPassager"/>
			  	</div>
			</div>			
			<button style="margin-top:30px" class="ui green button" type="submit">Creer un trajet</button>
		</form:form>
		<form style="margin-top:50px" action="<c:url value='/views/hello'/>" method="get">
		 	<button class="ui red button" type="submit">
		    	<i class="reply icon"></i>
		     	Annuler
			</button>	
		</form>
	 </div>
</body>
</html>