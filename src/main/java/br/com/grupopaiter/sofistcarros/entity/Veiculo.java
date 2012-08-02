package br.com.grupopaiter.sofistcarros.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Version;

import org.jboss.seam.annotations.Name;

@Entity
@Name(value="veiculo")
public class Veiculo {

	@Id
	
	
	private Loja loja;
	
	@Version
	private Integer version;

	public Loja getLoja() {
		return loja;
	}

	public void setLoja(Loja loja) {
		this.loja = loja;
	}
	
	
}
