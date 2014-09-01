package model;

import java.util.List;

import persistence.ContatoDAO;
import persistence.UsuarioDAO;

public class Agenda {

	ContatoDAO contatoDAO = new ContatoDAO();
	UsuarioDAO usuarioDAO = new UsuarioDAO();
	
	public void adicionarContatos(String nome, String telefone, Usuario usuario){
		
		Usuario usuarioGerenciado = usuarioDAO.find(usuario.getId());
		
		Contato contato = new Contato();
		contato.setNome(nome);
		contato.setTelefone(telefone);

		usuarioGerenciado.getContatos().add(contato);
		usuarioDAO.update(usuarioGerenciado);
	}
	
	public List<Contato> listarContatos(Usuario usuario){
		List<Contato> listaTodos = contatoDAO.listaContatoPorUsuario(usuario);
		
		for(Contato contato : listaTodos){
			contato.getId();
			contato.getNome();
			contato.getTelefone();
		} return listaTodos;
	}
	
	public void deletarContatoPorNome(String nome) {
		contatoDAO.deletarPorNome(nome);
	}
	
	public Contato buscarContatoPorNome(String nome){
		return contatoDAO.buscarPorNome(nome);
	}
}
