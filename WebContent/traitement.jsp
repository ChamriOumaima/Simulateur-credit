<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Sauvegarde</title>
<meta placeholder="viewport" content="width=device-width, initial-scale=1">
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
		<h1>Sauvegarder votre crédit</h1>
		<div class="main-agileinfo">
			<div class="agileits-top">
				<form action="traitement" method="post">
					Montant du crédit: <input class="text" type="text" value="${cap}" readonly>
					Taux du crédit: <input class="text" type="text" value="${taux}" readonly>
					Durée du crédit: <input class="text" type="text" value="${duree}" readonly>
					Annuitée du crédit: <input class="text" type="text"  value="${annuite}" readonly>
					Date du préversement: <input class="text" type="text" name="dpv" placeholder="dd/MM/yyyy" required="">
					Date actuelle: <input class="text" type="text"  value="${date}" readonly>
					Votre identifiant: <input class="text" type="text" value="${numcli}" readonly>
					<input type="submit" value="Sauvegarder">
				</form>
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