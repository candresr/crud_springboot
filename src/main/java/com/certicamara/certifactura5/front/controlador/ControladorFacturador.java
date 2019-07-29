package com.certicamara.certifactura5.front.controlador;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.certicamara.certifactura5.front.excepcion.ExcepcionRecursoNoEncontrado;
import com.certicamara.certifactura5.front.modelo.Facturador;
import com.certicamara.certifactura5.front.modelo.IdentidadFacturador;
import com.certicamara.certifactura5.front.servicio.ServicioFacturador;

@CrossOrigin(origins = "http://10.30.73.*:4200")
@RestController
@RequestMapping("/api/facturador")
public class ControladorFacturador {

	@Autowired
	private ServicioFacturador facturadorService;

	@GetMapping
	public String helloWord() {
		return "CRUD - Facturador by nomada";
	}

	@GetMapping("/listar")
	public List<Facturador> listar(){
		return facturadorService.listar();
	}
	
	@GetMapping("/buscar/{id_t}/{id_n}")
	public Optional<Facturador> buscarUno(@PathVariable String id_t,@PathVariable String id_n){
		IdentidadFacturador id = new IdentidadFacturador();
		id.setClie_tipi(id_t);
		id.setClie_iden(id_n);
		return facturadorService.buscar(id);
	}

	@PostMapping("/crear")
	public ResponseEntity<Facturador> crear(@RequestBody Facturador facturador) {
		return ResponseEntity.ok(facturadorService.crear(facturador));
	}

	@PutMapping("/actualizar")
	public ResponseEntity<Facturador> actualizar(@RequestBody Facturador facturador) {
		IdentidadFacturador id = new IdentidadFacturador();
		id.setClie_tipi(facturador.getClie_tipi());
		id.setClie_iden(facturador.getClie_iden());

		return facturadorService.buscar(id)
				.map(data ->{
					data.setClie_ciuu(facturador.getClie_ciuu());
					data.setClie_codimp(facturador.getClie_codimp());
					data.setClie_coregim(facturador.getClie_coregim());
					data.setClie_direccio(facturador.getClie_direccio());
					data.setClie_diverif(facturador.getClie_diverif());
					data.setClie_email(facturador.getClie_email());
					data.setClie_nombre(facturador.getClie_nombre());
					data.setClie_esta(facturador.getClie_esta());
					data.setClie_factu(facturador.getClie_factu());
					data.setClie_imag(facturador.getClie_imag());
					data.setClie_natura(facturador.getClie_natura());
					data.setClie_nomimp(facturador.getClie_nomimp());
					data.setClie_resfisc(facturador.getClie_resfisc());
					data.setClie_telefon(facturador.getClie_telefon());
					data.setClie_uactu(facturador.getClie_uactu());
					data.setClie_vigcont(facturador.getClie_vigcont());
					return ResponseEntity.ok(facturadorService.crear(data));
				}).orElseThrow(() -> new ExcepcionRecursoNoEncontrado("User not found with id " + id));
	} 
	
	@DeleteMapping("/borrar/{id_t}/{id_n}")
	public ResponseEntity<?> borrar(@PathVariable String id_t,@PathVariable String id_n) {
		IdentidadFacturador id = new IdentidadFacturador();
		id.setClie_tipi(id_t);
		id.setClie_iden(id_n);
		return facturadorService.buscar(id)
				.map(data ->{
					facturadorService.borrar(id);;
					return ResponseEntity.ok().build();
				}).orElseThrow(() -> new ExcepcionRecursoNoEncontrado("User not found with id " + id));
	}
}
