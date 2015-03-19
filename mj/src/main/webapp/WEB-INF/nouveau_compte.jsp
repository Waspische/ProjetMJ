<%@taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8" />
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<!-- Latest compiled and minified CSS -->
<link href="<c:url value='/resources/semantic.css'/>" rel="stylesheet" />
<script src="<c:url value='/resources/semantic.js'/>"></script>
<title>Nouveau compte - Alpha Co-Voiturage</title>
</head>
<body>
	<h2 class="ui center aligned icon header">
		<i class="circular car icon"></i> Alpha Co-Voiturage
	</h2>

	<div class="container">
		<h2 class="ui dividing header">Créer un compte</h2>

		<c:if test="${not empty error}">
			<div class="error">${error}</div>
		</c:if>

		<form:form modelAttribute="utilisateurForm" class="ui form" method="post" style="max-width: 600px">
			
			<div class="two fields">
				<div class="field">
					<label>Nom</label>
					<div class="ui icon input">
						<form:input type="text" placeholder="Nom" path="nom"/>
					</div>
				</div>
				<div class="field">
					<label>Prénom</label>
					<div class="ui icon input">
						<form:input type="text"  placeholder="Prénom" path="prenom"/>
					</div>
				</div>
			</div>


			<div class="required field">
				<label>Login</label>
				<div class="ui icon input">
					<form:input type="text"  placeholder="Login" path="login"/>
				</div>
			</div>

			<div class="two fields">
				<div class="required field">
					<label>Mot de passe</label>
					<div class="ui icon input">
						<form:input type="password"  placeholder="Mot de passe" path="password"/>
					</div>
				</div>

				<div class="required field">
					<label>Confirmation</label>
					<div class="ui icon input">
						<form:input type="password"  placeholder="Confirmation" path="confirmation"/>
					</div>
				</div>
			</div>


			<div class="field">
				<label>Email</label>
				<div class="ui icon input" >
					<form:input type="text" placeholder="Email" path="email"/>
				</div>
			</div>

			<div class="field">
				<label>Numéro de téléphone</label>
				<div class="ui icon input">
					<form:input type="text"  placeholder="Téléphone" path="telephone"/>
				</div>
			</div>


			<button style="margin-top:30px" class="ui green button" type="submit">Creer un compte</button>
		</form:form>
		<form style="margin-top:50px" action="<c:url value='/login'/>" method="get">
		 	<button class="ui red button" type="submit">
		    	<i class="reply icon"></i>
		     	Annuler
			</button>	
		</form>
	</div>
</body>
</html>