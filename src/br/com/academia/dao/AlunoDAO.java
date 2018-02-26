package br.com.academia.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityNotFoundException;

import br.com.academia.interfaces.InterfaceDAO;

public class AlunoDAO implements InterfaceDAO{
	
	private EntityManager em;
	
	public AlunoDAO(EntityManager em) {
		this.em = em;
	}

	@Override
	public void cadastrar(Aluno aluno) {
		// TODO Auto-generated method stub
		em.persist(aluno);
	}

	@Override
	public void alterar(Aluno aluno) {
		// TODO Auto-generated method stub
		em.merge(aluno);
	}

	@Override
	public void excluir(int codigo) {
		// TODO Auto-generated method stub
		Aluno aluno = buscar(codigo);
		if (aluno == null)
			throw new EntityNotFoundException("Entidade não encontrada");
		em.remove(aluno);
	}

	@Override
	public Object buscar(int codigo) {
		// TODO Auto-generated method stub
		Aluno aluno = em.find(Aluno.class, codigo);
		return aluno;
	}

	@Override
	public List<?> buscarLista() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
