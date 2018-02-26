package br.com.academia.interfaces;

import java.util.List;

public interface InterfaceDAO {
	
	public void cadastrar(Object obj);
	public void alterar(Object obj);
	public void excluir(int codigo);
	public Object buscar(int codigo);
	public List<?> buscarLista();
	
}
