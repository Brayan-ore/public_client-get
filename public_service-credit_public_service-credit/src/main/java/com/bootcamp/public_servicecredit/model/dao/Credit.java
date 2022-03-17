package com.bootcamp.public_servicecredit.model.dao;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(value = "credit") //ADDED
public class Credit {

	@Id
    private String id;
	private String numeroCuenta;
	private Double monto;
	private String tipoMoneda;
	private Boolean estado;
	
}
