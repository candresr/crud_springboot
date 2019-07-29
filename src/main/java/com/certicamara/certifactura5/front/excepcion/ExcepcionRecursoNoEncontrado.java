package com.certicamara.certifactura5.front.excepcion;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ExcepcionRecursoNoEncontrado extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ExcepcionRecursoNoEncontrado(String message) {
        super(message);
    }

    public ExcepcionRecursoNoEncontrado(String message, Throwable cause) {
        super(message, cause);
    }
}
