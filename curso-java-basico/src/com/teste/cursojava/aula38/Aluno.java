package com.teste.cursojava.aula38;

public class Aluno extends Pessoa {

	private String[] cursos;
	private String[][] notas;

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

}
