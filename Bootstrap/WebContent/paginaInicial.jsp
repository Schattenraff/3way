<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="css/bootstrap.css" rel="stylesheet">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Titulo Aleatorio</title>
</head>
<body>
	<div class="panel panel-primary painel-cadastro">
		<div class="panel-heading">cadastro</div>
		<div class="panel-body">

			<form method="post" action="ServletBoostrap">


					<fieldset>

						<div class="form-group">
							<label for="nome">Nome Completo</label> <input type="text"
								class="form-control" id="nome" name="nome" autofocus required>
						</div>

						<div class="form-group">
							<label for="login">Usu�rio</label> <input type="text"
								class="form-control" id="login" name="login" required>
						</div>

						<div class="form-group">
							<label for="senha1">Senha</label> <input type="password"
								class="form-control" id="senha1" name="senha1" required>
						</div>

						<div class="form-group">
							<label for="senha2">Repita a senha</label> <input type="password"
								class="form-control" id="senha2" name="senha2" required>
						</div>
						
					</fieldset>
					
				<input type="submit" class="btn btn-primary" value="Confirmar">

			</form>
			
			<img src="gifs/jinx.gif">
</body>
</html>