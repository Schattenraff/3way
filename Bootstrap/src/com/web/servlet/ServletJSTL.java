package com.web.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.web.modelo.Livro;

@WebServlet("/ServletJSTL")
public class ServletJSTL extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ServletJSTL() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	
	
	Livro livro1 = new Livro();
	Livro livro2 = new Livro();
	Livro livro3 = new Livro();
	Livro livro4 = new Livro();
	Livro livro5 = new Livro();
	Livro livro6 = new Livro();
	Livro livro7 = new Livro();
	
	livro1.setAutor("George R. R. Martin");
	livro1.setDescricao("Guerra, sexo E DRAGÕES CARA");
	livro1.setTitulo("As Cronicas de Gelo e Fogo");
	
	livro2.setAutor("Ernest Cline");
	livro2.setDescricao("Baseado em Realidade Virtual");
	livro2.setTitulo("jogador numero 1 livro");
	
	livro3.setAutor(" Antoine de Saint-Exupéry");
	livro3.setDescricao("pequeno principe e muito gay");
	livro3.setTitulo("Pequeno Principe");
	
	livro4.setAutor(" Clive Staples Lewis");
	livro4.setDescricao("SpinOff de as cronicas de narnia ");
	livro4.setTitulo(" O cavalo e seu menino ");
	
	livro5.setAutor(" Akira Amano!");
	livro5.setDescricao("Primo Definição de estilo ");
	livro5.setTitulo(" Katekyō Hitman Reborn! ");
	
	livro6.setAutor(" Yoshihiro Togashi");
	livro6.setDescricao(" Hisoka Pedofilo, psicopata. ");
	livro6.setTitulo(" Hunter × Hunter ");

	livro7.setAutor("  Eiichiro Oda ");
	livro7.setDescricao(" Melhor Historia Ever ");
	livro7.setTitulo(" One Piece ");
	
	
	ArrayList<Livro> lista = new ArrayList<>();
	lista.add(livro1);
	lista.add(livro2);
	lista.add(livro3);
	lista.add(livro4);
	lista.add(livro5);
	lista.add(livro6);
	lista.add(livro7);
	
	request.setAttribute("listarLivro", lista);
	
	RequestDispatcher rd = getServletContext().getRequestDispatcher("/listarLivros.jsp");
	rd.forward(request, response);
	
	}
	
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
