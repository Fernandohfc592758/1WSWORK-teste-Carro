package org.wswork.carro.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


import org.springframework.lang.NonNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@Table(name = "modelo")


public class Modelo {
	
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private long id; 
	
	@NonNull
	private String nomemodelo;
	
	private int ano;
	
	private String combustivel;
	
	
	@NonNull
	private int num_portas;
	
	private float valor_fipe;
	
	@NonNull
	private String cor;
	
	
	@NonNull
	private float timestamp_cadastro;
	
	
	@ManyToOne
	@JsonIgnoreProperties("modelo")
	private Marca marca;


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getNomemodelo() {
		return nomemodelo;
	}


	public void setNomemodelo(String nomemodelo) {
		this.nomemodelo = nomemodelo;
	}


	public int getAno() {
		return ano;
	}


	public void setAno(int ano) {
		this.ano = ano;
	}


	public String getCombustivel() {
		return combustivel;
	}


	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}


	public int getNum_portas() {
		return num_portas;
	}


	public void setNum_portas(int num_portas) {
		this.num_portas = num_portas;
	}


	public float getValor_fipe() {
		return valor_fipe;
	}


	public void setValor_fipe(float valor_fipe) {
		this.valor_fipe = valor_fipe;
	}


	public String getCor() {
		return cor;
	}


	public void setCor(String cor) {
		this.cor = cor;
	}


	public float getTimestamp_cadastro() {
		return timestamp_cadastro;
	}


	public void setTimestamp_cadastro(float timestamp_cadastro) {
		this.timestamp_cadastro = timestamp_cadastro;
	}


	public Marca getMarca() {
		return marca;
	}


	public void setMarca(Marca marca) {
		this.marca = marca;
	}
	
}
	
	

	