package com.teste.cursojava.aula42;

public class Aluno {

	private String[] cursos;
	private String[][] notas;

	public Aluno(String nome, String endereco, String telefone, String[] curso) {
		//super(nome, endereco, telefone);
		this.cursos = curso;
	}

	public Aluno() {
		super();
	}

	public String[] getCursos() {
		return cursos;
	}

	public void setCursos(String[] cursos) {
		this.cursos = cursos;
	}

	public String[][] getNotas() {
		return notas;
	}

	public void setNotas(String[][] notas) {
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
		//s += this.getEndereco();

		return s;
	}

	//@Override
	public void imprimirEtiquetaEndereco() {
		System.out.println("Imprimindo o endereço do aluno: ");
		System.out.println(this.obterEtiquetaEndereco());
		
	}

}
