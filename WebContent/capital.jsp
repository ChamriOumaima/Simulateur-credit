<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Calcul Capital</title>
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
 	<div class="main-w3layouts wrapper">
		<h1>Calculer le capital</h1>
		<div class="main-agileinfo">
			<div class="agileits-top">
  				<form action="Capital" method="post">
    				Annuité :<br><input type="text" name="annuite" class="text"  placeholder="0.0" required="" value="${annuite }"><br>
    				Duree:<br><input type="text" name="duree" class="text" placeholder="0.0" required="" value="${duree }"><br>
    				Taux:<br><input type="text" name="taux" class="text"  placeholder="0.0" required="" value="${taux }">
					<input type="submit" name="calculer" value="Calculer">
					<input type="submit" name="sauvegarder" value="Sauvegarder">
    			</form>
  				</div>
  		</div>
  </div>
  <div class="main-agileinfo">
     <h1>Resultat <br/></h1>
    <input type="text" name="res" class="text"  value="${capital}" readonly>
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
</body>
</html>