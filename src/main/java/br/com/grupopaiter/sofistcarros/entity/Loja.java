package br.com.grupopaiter.sofistcarros.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Version;

import org.jboss.seam.annotations.Name;

@Entity
@Name(value="loja")
public class Loja {
	
	@Id
	private long idLoja;
		
	// private List<Veiculo> veiculos;
	
	
	@Version
	private Integer version;
	

/*	public List<Veiculo> getVeiculos() {
		return veiculos;
	}

	public void setVeiculos(List<Veiculo> veiculos) {
		this.veiculos = veiculos;
	}*/

	public long getIdLoja() {
		return idLoja;
	}

	public void setIdLoja(long idLoja) {
		this.idLoja = idLoja;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

}
