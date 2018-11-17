<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<table border=1>
		<thead>
		<tr> 
		<th>Código Livro</th>
		<th>Título</th>
		<th>Autor</th>
		<th>Descrição</th>
		<th>Preco</th>
		<th colspan=2>Action</th>
		</tr>
		</thead>
		<tbody>	
		
		<c:forEach items="${requestScope.livros}" var="livro">
			<tr>
				<td><c:out value="${livros.titulo}"></c:out></td>
				<td><c:out value="${livros.autor}"></c:out></td>
				<td><c:out value="${livros.descricao}"></c:out></td>
				<td><a href="livroController?action=editar&livroId=<c:out value="${livro.codigo}"/>">Update</a></td>
				<td><a href="livroController?action=deeltar&livroId=<c:out value="${livro.codigo}"/>">Delete</a></td>
			</tr>
		</c:forEach>
	</tbody>
	</table>
	<p><a href="/jsp-servlet-crud/LivroController?action=insert">Livro</a></p>
	
</body>
</html>