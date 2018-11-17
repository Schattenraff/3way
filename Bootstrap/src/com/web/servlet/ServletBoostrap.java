package com.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ServletBoostrap")
public class ServletBoostrap extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ServletBoostrap() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		// width="1200" heigth="920"
		String nome = request.getParameter("nome");
		String usuario = request.getParameter("login");
		String senha1 = request.getParameter("senha1");
		out.println("<html>"
				+ "<body>"
				+ "<h1>" + "Nome : " + nome + "</h1>"
				+ "<h1>" +" Usuário : "+ usuario + "</h1>"
				+ "<h1>" +"Senha : "+ senha1 + "</h1>"
				+ "</body></html>");	
		
		RequestDispatcher rd = getServletContext().getRequestDispatcher("/listarLivros.jsp");
		rd.forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
