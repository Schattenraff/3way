package com.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Formulario")
public class Formulario extends HttpServlet {

	private static final long serialVersionUID = 1132539037092085928L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String nome = request.getParameter("nome");
		String profissao = request.getParameter("profissao");
		out.println("<html>"
				+ "<body>"
				+ "<h1>" + "Nome : " + nome + "</h1>"
				+ "<h1>" +" Profiss�o: "+ profissao + "</h1>"
				+ "</body></html>");	

	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	}
}
