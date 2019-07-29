package com.certicamara.certifactura5.front.repositorio;

import org.springframework.data.repository.CrudRepository;

import com.certicamara.certifactura5.front.modelo.Facturador;
import com.certicamara.certifactura5.front.modelo.IdentidadFacturador;

public interface RepositorioFacturador extends CrudRepository<Facturador, IdentidadFacturador>{

}
