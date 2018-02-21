package com.teste.cursojava.aula43;

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
		String s = "Endereço do Aluno: ";
		// s += this.getEndereco();

		return s;
	}

	// @Override
	public void imprimirEtiquetaEndereco() {
		System.out.println("Imprimindo o endereço do aluno: ");
		System.out.println(this.obterEtiquetaEndereco());

	}

}
