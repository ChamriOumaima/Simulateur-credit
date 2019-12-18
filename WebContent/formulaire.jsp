<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Formulaire d'inscription</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- Custom Theme files -->
<link href="style.css" rel="stylesheet" type="text/css" media="all" />
<!-- //Custom Theme files -->
<!-- web font -->
<link href="//fonts.googleapis.com/css?family=Roboto:300,300i,400,400i,700,700i" rel="stylesheet">
<!-- //web font -->
</head>
<body>
	<!-- main -->
	<div class="main-w3layouts wrapper">
		<h1>Formulaire d'inscription</h1>
		<div class="main-agileinfo">
			<div class="agileits-top">
				<form action="inscription" method="post">
					<input class="text" type="text" name="nom" placeholder="Nom" required="">
					<input class="text" type="text" name="prenom" placeholder="Prenom" required="">
					<input class="text email" type="email" name="email" placeholder="Email" required="">
					<input class="text" type="text" name="adresse" placeholder="Adresse" required="">
					<input class="text" type="text" name="ville" placeholder="Ville" required="">
					<input class="text" type="text" name="tel" placeholder="Telephone" required="">
					<input class="text" type="password" name="password" placeholder="Password" required="">
					<input type="submit" value="S'inscrire">
				</form>
				<p>Déjà inscrit ? <a href="Authentification"> Se connecter </a></p>
			</div>
		</div>
		<ul class="colorlib-bubbles">
			<li></li>
			<li></li>
			<li></li>
			<li></li>
			<li></li>
			<li></li>
			<li></li>
			<li></li>
			<li></li>
			<li></li>
		</ul>
	</div>
	<!-- //main -->
</body>
</html>