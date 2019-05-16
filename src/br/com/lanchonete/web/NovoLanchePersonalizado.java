package br.com.lanchonete.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.lanchonete.Lanche;
import br.com.lanchonete.dao.LancheDAO;

@WebServlet(urlPatterns = "/lancheInseridoPersonalizado")
public class NovoLanchePersonalizado extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String nome = req.getParameter("nome");
		int alface = Integer.parseInt(req.getParameter("alface"));
		int bacon = Integer.parseInt(req.getParameter("bacon"));
		int carne = Integer.parseInt(req.getParameter("carne"));
		int ovo = Integer.parseInt(req.getParameter("ovo"));
		int queijo = Integer.parseInt(req.getParameter("queijo"));
		Lanche lanche = new Lanche(nome, alface, bacon, carne, ovo, queijo);		
		new LancheDAO().adiciona(lanche);
		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/paginas/adicionado.html");
		dispatcher.forward(req, resp);
	}
}
