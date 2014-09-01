package controller;

import static util.Ferramentas.vaiParaPagina;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Agenda;
import model.Contato;

@SuppressWarnings("serial")
@WebServlet("/buscarContato")
public class BuscaContatoPorID extends HttpServlet{


	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		Agenda agenda = new Agenda();
		String nome;
		try{
			nome = req.getParameter("nome");
		}catch(NumberFormatException e){
			req.setAttribute("erro", "Contato não encontrado");
		    vaiParaPagina(req, resp, "site/buscarContato.jsp");
		    return;
		}
		Contato buscandoContato =  agenda.buscarContatoPorNome(nome);
		req.setAttribute("umcontato", buscandoContato);
		vaiParaPagina(req, resp,"site/contatos.jsp");
				
	}


}
