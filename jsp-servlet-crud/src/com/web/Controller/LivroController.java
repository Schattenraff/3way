package com.web.Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.web.dao.LivroDao;
import com.web.model.Livro;

@WebServlet("/LivroController")
public class LivroController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LivroController() {
		super();
	}

	private static final String INSERIR_OU_EDITAR ="/livro.jsp";
	private static final String LISTAR_LIVROS ="/listarLivro.jsp";
	
	private LivroDao dao = new LivroDao();	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String paginaEncaminhar= "";
		String action = request.getParameter("action");
		
		if (action.equalsIgnoreCase("deletar")) {
			int livroId = Integer.parseInt(request.getParameter("livroId"));
			dao.removeById(livroId);
			paginaEncaminhar =LISTAR_LIVROS;
			request.setAttribute("livros", dao.listarTodos());
			
		} else if (action.equalsIgnoreCase("editar")) {
			int codigoLivro = Integer.parseInt(request.getParameter("livroId"));
			Livro livro = dao.consultar(codigoLivro);
			paginaEncaminhar =  INSERIR_OU_EDITAR;
			request.setAttribute("livros", livro);
	
		} else if (action.equalsIgnoreCase("listarLivros")) {
			paginaEncaminhar = LISTAR_LIVROS;
			request.setAttribute("livros", dao.listarTodos());
			
		} else {
			paginaEncaminhar = INSERIR_OU_EDITAR;
		}
		
		RequestDispatcher view = request.getRequestDispatcher(paginaEncaminhar);
		view.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

}
