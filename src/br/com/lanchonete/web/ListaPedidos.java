package br.com.lanchonete.web;

import java.io.IOException;
import java.util.Collection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.lanchonete.Lanche;
import br.com.lanchonete.dao.LancheDAO;

@WebServlet(urlPatterns = "/listaPedidos")
public class ListaPedidos extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Collection<Lanche> lanches = new LancheDAO().retornaPedidos();
		resp.getWriter().println(lanches);
		RequestDispatcher dispatcher = req.getRequestDispatcher("paginas/listapedidos.html");
		dispatcher.forward(req, resp);
	}
}
