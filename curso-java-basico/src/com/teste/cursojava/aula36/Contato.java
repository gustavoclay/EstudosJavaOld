package com.teste.cursojava.aula36;

import java.util.Arrays;

public class Contato {

	private String nome;
	private Endereco endereco;
	private Telefone[] telefones;

	public Telefone[] getTelefones() {
		return telefones;
	}

	public void setTelefones(Telefone[] telefones) {
		this.telefones = telefones;
	}

	public Contato() {
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "Contato [nome=" + nome + ", endereco=" + endereco + ", telefones=" + Arrays.toString(telefones) + "]";
	}


}
