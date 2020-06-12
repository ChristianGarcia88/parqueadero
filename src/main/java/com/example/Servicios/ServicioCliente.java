package com.example.Servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.models.Clientes;
import com.example.repositorio.RepositorioCliente;

@Service
public class ServicioCliente {

	private  RepositorioCliente repoCliente;
	@Autowired
	public  ServicioCliente(RepositorioCliente repoCliente) {
		this.repoCliente=repoCliente;
		
		
	}
	
	
	public Clientes agregarCliente(Clientes cliente) {
		
		return repoCliente.save(cliente);
		
		
		
		
	}
	
	
	
}
