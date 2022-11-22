package one.digitalinnovation.gof.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public abstract class Animal {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int codigo;
	private String especie;
	private int idade;
	private String sexo;
	protected float peso;
	@ManyToOne
	private HistoricoClinico historicoClinico;

	public Animal() {

		this.codigo = 0;
		this.especie = "";
		this.idade = 0;
		this.sexo = "";
		this.peso = 0;
		historicoClinico = new HistoricoClinico();
	}

	public Animal(String especie, int idade, String sexo, float peso, HistoricoClinico historicoClinico) {
		this.codigo = 0;
		this.especie = "";
		this.idade = 0;
		this.sexo = "";
		this.peso = 0;
		historicoClinico = new HistoricoClinico();
	}

	public HistoricoClinico getHistoricoClinico() {
		return historicoClinico;
	}

	public int getCodigo() {
		return codigo;
	}

	public String getEspecie() {
		return especie;
	}

	public int getIdade() {
		return idade;
	}

	public String getSexo() {
		return sexo;
	}

	public float getPeso() {
		return peso;
	}

	public void setHistoricoClinico(HistoricoClinico historicoClinico) {
		this.historicoClinico = historicoClinico;
	}

	public void setCodigo(int codigo) throws NumNegException {
		if (codigo >= 0) {
			this.codigo = codigo;

		} else {
			throw new NumNegException();
		}
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public void setIdade(int idade) throws NumNegException {
		if (idade >= 0) {
			this.idade = idade;

		} else {
			throw new NumNegException();
		}
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public void setPeso(float peso) throws NumNegException {
		if (peso >= 0) {
			this.peso = peso;

		} else {
			throw new NumNegException();
		}

	}

	public abstract void verificaPeso();

	void remove(Animal an) {
		throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
	}

}//fim da classe
