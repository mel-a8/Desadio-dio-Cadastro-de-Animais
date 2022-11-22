package one.digitalinnovation.gof.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Os atributos desse modelo foram gerados automaticamente pelo site
 * jsonschema2pojo.org. Para isso, usamos o JSON de retorno da API do ViaCEP.
 * 
 * @see <a href="https://www.jsonschema2pojo.org">jsonschema2pojo.org</a>
 * @see <a href="https://viacep.com.br">ViaCEP</a>
 * 
 * @author falvojr
 */
@Entity
public class HistoricoClinico {

	@Id
	private String doenca;
	private String remedio;

	public HistoricoClinico() {
		this.doenca = "";
		this.remedio = "";
	}

	public HistoricoClinico(String doenca, String remedio) {
		this.doenca = "";
		this.remedio = "";
	}

	public String getDoenca() {
		return doenca;
	}

	public String getRemedio() {
		return remedio;
	}

	public void setDoenca(String doenca) {
		this.doenca = doenca;
	}

	public void setRemedio(String remedio) {
		this.remedio = remedio;
	}

}

