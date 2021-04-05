package com.mballem.curso.boot.service;

import java.util.List;


import com.mballem.curso.boot.domain.Cargo;

public interface CargoService {
	
	void salvar (Cargo cargo);
	
	void editar (Cargo cargo);
	
	void excluir (long id);
	
	Cargo buscarPorId(long id);
	
	List<Cargo> buscarTodos();
	
	

}
