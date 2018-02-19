package com.teste.cursojava.aula39;

public class Professor extends Pessoa {

	private String departamento;
	private String nomeCurso;
	private double salario;

	public void verificarAcesso() {

		this.nomeVisibilidade = "Maria";
		super.nomeVisibilidade = "Maria";
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String getNomeCurso() {
		return nomeCurso;
	}

	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double calculaSalarioLiquido() {
		return 0;
	}

}
