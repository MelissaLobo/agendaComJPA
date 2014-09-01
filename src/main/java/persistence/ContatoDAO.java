package persistence;

import java.util.List;

import javax.persistence.Query;

import model.Contato;
import model.Usuario;

public class ContatoDAO extends DaoGenerico<Contato, Long>{

	@SuppressWarnings("unchecked")
	public List<Contato> listaContatoPorUsuario(Usuario usuario){
		try{
			Query query = entityManager.createQuery("from Contato contato ");
			return query.getResultList();
		}catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public void deletarPorNome(String nome){
		try{
			Query query = entityManager.createQuery("delete c from Contato c where c.nome = :nome");
			query.setParameter("nome", nome);
			query.executeUpdate();
	}catch (Exception e) {
		e.printStackTrace();
	}
	}
	
	public Contato buscarPorNome(String nome){
		try{
			Query query = entityManager.createQuery("select c from Contato c where c.nome = :nome");
			query.setParameter("nome", nome);
		
	}catch (Exception e) {
		e.printStackTrace();
	}return null;
	}
}
