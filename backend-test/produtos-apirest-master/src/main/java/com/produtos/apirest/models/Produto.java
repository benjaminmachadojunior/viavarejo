package com.produtos.apirest.models;

import java.io.Serializable;
import java.math.BigDecimal;



public class Produto implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private long codigo;
	
	private String nome;
	
	private BigDecimal valor;
	
	private BigDecimal valorEntrada;
	
	private int qtdeParcelas;
	
	
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public long getCodigo() {
		return codigo;
	}

	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public BigDecimal getValorEntrada() {
		return valorEntrada;
	}

	public void setValorEntrada(BigDecimal valorEntrada) {
		this.valorEntrada = valorEntrada;
	}

	public int getQtdeParcelas() {
		return qtdeParcelas;
	}

	public void setQtdeParcelas(int qtdeParcelas) {
		this.qtdeParcelas = qtdeParcelas;
	}



	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	
	

}
