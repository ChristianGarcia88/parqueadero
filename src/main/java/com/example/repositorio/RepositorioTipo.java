package com.example.repositorio;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.models.TipoTransporte;
import com.example.models.Transporte;

public interface RepositorioTipo  extends CrudRepository<TipoTransporte, Integer>{

	
	@Query("	Select   t  from  TipoTransporte t where   t. tipoTransporte=?1")
	public TipoTransporte encontrarTipo (String  tipoTransporte);
	

}
