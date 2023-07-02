package modelo;

import javax.persistence.Entity;
import javax.persistence.Table;

public class Categoria {
	
	@Entity
	@Table(name = "produtos")
	private Long id;
	private String nome;

}
