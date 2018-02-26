package br.com.academia.dao;

import java.util.List;

import br.com.academia.interfaces.InterfaceDAO;

public class TreinoDAO implements InterfaceDAO{
	
	private EntityManager em;

	public TreinoDAO(EntityManager em) {
		this.em = em;
	}

	@Override
	public void cadastrar(Treino treino) {
		// TODO Auto-generated method stub
		em.persist(treino);
	}

	@Override
	public void alterar(Treino treino) {
		// TODO Auto-generated method stub
		em.merge(treino);
	}

	@Override
	public void excluir(int codigo) {
		// TODO Auto-generated method stub
		Treino treino = buscar(codigo);
		if (treino == null)
			throw new EntityNotFoundException("Entidade não encontrada");
		em.remove(treino);
	}

	@Override
	public Object buscar(int codigo) {
		// TODO Auto-generated method stub
		Treino treino = em.find(Treino.class, codigo);
		return treino;
	}

	@Override
	public List<?> buscarLista() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
