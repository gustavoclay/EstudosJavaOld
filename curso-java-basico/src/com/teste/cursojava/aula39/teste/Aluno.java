package com.teste.cursojava.aula39.teste;

import com.teste.cursojava.aula39.Pessoa;

public class Aluno extends Pessoa {

	private String[] cursos;
	private String[][] notas;

	public void verificarAcesso() {

		this.nomeVisibilidade = "Maria";
		super.nomeVisibilidade = "Maria";
	}

	public Aluno(String nome, String endereco, String telefone, String[] curso) {
		super(nome, endereco, telefone);
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

	public void metodoQualquer() {
		super.setCpf("03424159199");
		this.setCpf("00000000001");
	}

}
