package com.teste.cursojava.aula43;

import java.util.Arrays;

public class Aluno {

	private String curso;
	private double[] notas;

	public Aluno(String nome, String endereco, String telefone, String curso) {
		// super(nome, endereco, telefone);
		this.curso = curso;
	}

	public Aluno() {
		super();
	}

	public String getCurso() {
		return curso;
	}

	public void setCursos(String string) {
		this.curso = string;
	}

	public double[] getNotas() {
		return notas;
	}

	public void setNotas(double[] notas) {
		this.notas = notas;
	}

	public double calculaMedia() {
		return 0;
	}

	public boolean verificarAprovado() {
		return true;
	}

	public String obterEtiquetaEndereco() {
		String s = "Endere�o do Aluno: ";
		// s += this.getEndereco();

		return s;
	}

	// @Override
	public void imprimirEtiquetaEndereco() {
		System.out.println("Imprimindo o endere�o do aluno: ");
		System.out.println(this.obterEtiquetaEndereco());

	}

	@Override
	public String toString() {
		return "Aluno [curso=" + curso + ", notas=" + Arrays.toString(notas) + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(notas);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		
		Aluno other = (Aluno) obj;

		if(curso.equalsIgnoreCase(other.getCurso())) {
			return true;
		}
		
		return true;
	}
	
	

}
