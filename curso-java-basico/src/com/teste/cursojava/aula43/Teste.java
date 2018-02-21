package com.teste.cursojava.aula43;

public class Teste {

	public static void main(String[] args) {

		Aluno aluno = new Aluno();

		aluno.setCursos("Ciência da Computação");
		
		double[] notas = {10, 9, 8, 8};
		aluno.setNotas(notas);
		
		System.out.println(aluno.getCurso());
		System.out.println(aluno.getNotas());
		

	}

}
