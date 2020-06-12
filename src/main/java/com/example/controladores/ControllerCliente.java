package com.example.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.DTO.DTOClienteVehiculo;
import com.example.Servicios.ServicioCliente;
import com.example.Servicios.ServicioTipo;
import com.example.Servicios.ServicioTransporte;
import com.example.models.Clientes;
import com.example.models.TipoTransporte;
import com.example.models.Transporte;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class ControllerCliente {

	@Autowired
	private ServicioCliente serviceCliente;
	@Autowired
	private ServicioTransporte serviceTransporte;
	@Autowired
	private ServicioTipo serviceTipo;

	@PostMapping(value = "/agregar")
	public ResponseEntity<?> agregarClienteTrnsporte(@RequestBody DTOClienteVehiculo objetoFront) {

		Clientes cliente = new Clientes();
		cliente.setCedula(objetoFront.getCedula());
		cliente.setNombre(objetoFront.getNombre());
		cliente.setApellido(objetoFront.getApellido());

		Clientes cliente1 = serviceCliente.agregarCliente(cliente);
		if (cliente1 == null) {

			return new ResponseEntity<String>("no se pudo insertar el cliente", HttpStatus.NOT_FOUND);

		}

		TipoTransporte tipo = serviceTipo.encontrarTrnsporteTipo(objetoFront.getTipoAutomoto());

		Transporte transporte = new Transporte();
		transporte.setCliente(cliente);
		transporte.setPlaca(objetoFront.getPlaca());
		transporte.setTipoTransporte(tipo);
		
		Transporte transporte1 = serviceTransporte.agregarTransporte(transporte);

		if (transporte1 == null) {

			return new ResponseEntity<String>("no se pudo insertar el transporte", HttpStatus.NOT_FOUND);

		}

		return new ResponseEntity<String>("se insertó correctamente todo", HttpStatus.OK);

	}
	
	
	
	@GetMapping("/listar")
	public List<DTOClienteVehiculo> listaRegistros(){
		
		return serviceTransporte.listarDto();
		
		
	}
	
	
	@GetMapping("/persona/{cedula}")
	public  List<DTOClienteVehiculo>busquedaPorPersona(@PathVariable("cedula") String cedula) {
		
		
		
		System.out.println();
		
		return serviceTransporte.busquedaPorCedula(cedula);
		
		
	}

}
