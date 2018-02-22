package com.teste.cursojava.aula43;

public class Teste {

	public static void main(String[] args) {

		Aluno aluno = new Aluno();

		aluno.setCursos("Ciencia da Computacao");
		
		double[] notas = {10, 9, 8, 8};
		aluno.setNotas(notas);
		
		System.out.println(aluno);
		//System.out.println(aluno.getCurso());
		//System.out.println(aluno.getNotas());
		
//		String s1 = "abc";
//		String s2 = "abC";
//		
//		System.out.println(s1 == s2);
//		System.out.println(s1.equalsIgnoreCase(s2));
		
		
		Aluno aluno2 = new Aluno();

		aluno2.setCursos("Ciencia da Computacao");
		
		double[] notas2 = {5, 7, 4, 2};
		aluno2.setNotas(notas2);
		
		System.out.println(aluno2);
		
		//System.out.println(aluno == aluno2);
		
		//System.out.println(aluno.equals(aluno2));
		
		System.out.println(aluno.equals(aluno2));

	}

}
