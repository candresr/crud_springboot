package com.certicamara.certifactura5.front.servicio;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.certicamara.certifactura5.front.modelo.Facturador;
import com.certicamara.certifactura5.front.modelo.IdentidadFacturador;
import com.certicamara.certifactura5.front.repositorio.RepositorioFacturador;

@Service
public class ServicioFacturador {
	
	@Autowired
	private RepositorioFacturador facturadorRepository;
	
	public List<Facturador> listar(){
		return (List<Facturador>) facturadorRepository.findAll();
	}
	
	public Optional<Facturador> buscar(IdentidadFacturador indentity){
		return facturadorRepository.findById(indentity);
	}
	
	public Facturador crear(Facturador facturador) {
		return facturadorRepository.save(facturador);
	}
	
	public void borrar(IdentidadFacturador indentity){
		facturadorRepository.deleteById(indentity);
	}
}
