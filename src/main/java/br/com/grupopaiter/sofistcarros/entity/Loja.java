package br.com.grupopaiter.sofistcarros.entity;

import java.util.List;

import javax.persistence.Entity;

import org.jboss.seam.annotations.Name;

@Entity
@Name(value="loja")
public class Loja {
	
	
	private List<Veiculo> veiculos;

	public List<Veiculo> getVeiculos() {
		return veiculos;
	}

	public void setVeiculos(List<Veiculo> veiculos) {
		this.veiculos = veiculos;
	}

}
