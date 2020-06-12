package com.example.Servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.models.TipoTransporte;
import com.example.repositorio.RepositorioTipo;

@Service
public class ServicioTipo {

	private RepositorioTipo repoTipo;

	@Autowired
	public ServicioTipo(RepositorioTipo repoTipo) {

		this.repoTipo = repoTipo;

	}

	public TipoTransporte agregarTipo(TipoTransporte tipo) {

		return repoTipo.save(tipo);

	}

	public TipoTransporte encontrarTrnsporteTipo(String tipo) {

		return repoTipo.encontrarTipo(tipo);
		
	}
}
