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

@WebServlet(urlPatterns = "/lancheInseridoCardapio")
public class NovoLancheCardapio extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int opcao = Integer.parseInt(req.getParameter("opcao"));
		
		switch (opcao) {
			case 1:
				Lanche lanche = new Lanche("X-Bacon", 0, 1, 1, 0, 1);
				new LancheDAO().adiciona(lanche);
				break;
			case 2:
				Lanche lanche2 = new Lanche("X-Burger", 0, 0, 1, 0, 1);
				new LancheDAO().adiciona(lanche2);
				break;
			case 3:
				Lanche lanche3 = new Lanche("X-Egg", 0, 0, 1, 1, 1);
				new LancheDAO().adiciona(lanche3);
				break;
			case 4:
				Lanche lanche4 = new Lanche("X-Egg Bacon", 0, 1, 1, 1, 1);
				new LancheDAO().adiciona(lanche4);
				break;
		}
				
		RequestDispatcher dispatcher = req.getRequestDispatcher("paginas/adicionado.html");
		dispatcher.forward(req, resp);
	}
}
