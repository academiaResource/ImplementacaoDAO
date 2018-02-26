package br.com.academia.dao;

import java.util.List;

import br.com.academia.interfaces.InterfaceDAO;

public class TreinadorDAO implements InterfaceDAO{

	private EntityManager em;

	public TreinadorDAO(EntityManager em) {
		this.em = em;
	}

	@Override
	public void cadastrar(Treinador treinador) {
		// TODO Auto-generated method stub
		em.persist(treinador);
	}

	@Override
	public void alterar(Treinador treinador) {
		// TODO Auto-generated method stub
		em.merge(treinador);
	}

	@Override
	public void excluir(int codigo) {
		// TODO Auto-generated method stub
		Treinador treinador = buscar(codigo);
		if (aluno == null)
			throw new EntityNotFoundException("Entidade não encontrada");
		em.remove(treinador);
	}

	@Override
	public Object buscar(int codigo) {
		// TODO Auto-generated method stub
		Treinador treinador = em.find(Treinador.class, codigo);
		return treinador;
	}

	@Override
	public List<?> buscarLista() {
		// TODO Auto-generated method stub
		return null;
	}
}
