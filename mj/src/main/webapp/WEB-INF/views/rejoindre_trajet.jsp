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
<title>Réserver trajet - Alpha Co-Voiturage</title>
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
		 <h2 class="ui dividing header">
			Réserver un trajet
		 </h2>
		 
		 <c:if test="${not empty error}">
			<div class="error">${error}</div>
		 </c:if>
		 <c:if test="${not empty create}">
			<div class="msg">${create}</div>
		 </c:if>
		 
		 <form:form modelAttribute="reservationForm" class="ui form" method="post" style="max-width: 600px">
		    <table>
		    <tr>
		    <td>
		    	<div class="field" style="margin:0 2px 0 2px">
					<label>Ville de départ</label>
					<div class="ui icon input">
						<form:input type="text" placeholder="Ville de départ" path="rechercheForm.pointDepart"/>
				  	</div>
				</div>
			</td>
			<td>
			   	<div class="field" style="margin:0 2px 0 2px">
				  	<label>Ville d'arrivée</label>
				  	<div class="ui icon input">
						<form:input type="text" placeholder="Ville d'arrivée" path="rechercheForm.pointArrivee"/>
				  	</div>
				</div>
			</td>
			<td>
			   	<div class="field" style="margin:0 2px 0 2px">
				  	<label>Date de depart</label>
				  	<div class="ui icon input">
						<form:input type="text" placeholder="DD/MM/YYYY" path="rechercheForm.dateDepart"/>
				  	</div>
				</div>	
			</td>
			<td>
			   	<div class="field" style="margin:0 2px 0 2px">
				  	<label>Places disponibles</label>
				  	<div class="ui icon input">
						<form:checkbox style="width:20px;height:20px;" path="rechercheForm.placesDispo"/>
				  	</div>
				</div>	
			</td>
			</tr>	
		    </table>
		    
			<button style="margin-top:10px" class="ui green button" type="submit">Rechercher</button>
		</form:form>
		 
		<div class="ui divider"></div>
		 
		<c:if test="${not empty reservationForm.rechercheForm.reservationRow}">
		    <table class="ui six column table">
		    	<thead>
					<th>Ville de départ</th>
					<th>Ville d'arrivée</th>
					<th>Départ</th>
					<th>Nombre de passagers</th>
					<th>Places disponibles</th>
					<th>Rejoindre</th>
				  </tr>
				</thead>
				<tbody>
		        <c:forEach var="trajet" items="${reservationForm.rechercheForm.reservationRow}">
		            <form:form modelAttribute="reservationForm" action="./reserve_trajet" method='POST'>
		            	<form:input type="hidden" path="reservationRowForm.id" value="${trajet.trajetId}"/>
			            <tr>
			                <td>${trajet.villeDepart}</td> 
			                <td>${trajet.villeArrivee}</td> 
			                <td>${trajet.dateDepart}</td>
			                <td>${trajet.nbPassager}</td>
			                <td>${trajet.placesDisponibles}</td>
			                <td>
			                	<button class="ui icon button" type="submit">
			                		<i class="arrow circle right icon"></i>
			                	</button>
		                	</td>
			            </tr>
		            </form:form>
		        </c:forEach>
		        </tbody>
		    </table>
		</c:if>
		<c:if test="${empty reservationForm.rechercheForm.reservationRow}">
			Aucune transaction trouvée
		</c:if>
		 <!-- 
		<table >
		  <thead>
			<tr><th>Conducteur</th>
			<th>Ville de depart</th>
			<th>Ville d'arrivee</th>
			<th>Heure</th>
			<th>Nombre de passagers</th>
			<th>Rejoindre</th>
		  </tr></thead>
		  <tbody>
			<tr>
			  <td>Jacky</td>
			  <td>Lille</td>
			  <td>Marseille</td>
			  <td>16:00</td>
			  <td>3</td>
			  
			</tr>
			<tr>
			  <td>Antoine</td>
			  <td>Lille</td>
			  <td>Marseille</td>
			  <td>12:00</td>
			  <td>2</td>
			  <td><div class="ui icon button"><i class="arrow circle right icon"></i></div></td>
			</tr>
			<tr>
			  <td>TOTO</td>
			  <td>Lille</td>
			  <td>Marseille</td>
			  <td>10:00</td>
			  <td>1</td>
			 <td><div class="ui icon button"><i class="arrow circle right icon"></i></div></td>  
			</tr>
		  </tbody>
		</table>
		 -->
		<form style="margin-top:50px" action="<c:url value='/views/hello'/>" method="get">
		 	<button class="ui red button" type="submit">
		    	<i class="reply icon"></i>
		     	Revenir
			</button>	
		</form>				
	</div>
</body>
</html>