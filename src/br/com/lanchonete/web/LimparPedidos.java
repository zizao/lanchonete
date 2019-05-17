package br.com.lanchonete.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.lanchonete.dao.LancheDAO;

@WebServlet(value="/limparPedidos")
public class LimparPedidos extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		new LancheDAO().limparPedidos();
		RequestDispatcher dispatcher = req.getRequestDispatcher("paginas/listapedidos.html");
		dispatcher.forward(req, resp);
	}
}
