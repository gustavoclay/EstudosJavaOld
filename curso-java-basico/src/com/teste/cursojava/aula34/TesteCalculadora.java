package com.teste.cursojava.aula34;

public class TesteCalculadora {

	public static void main(String[] args) {

		int soma1 = MinhaCalculadora.soma(1, 2);
		System.out.println(soma1);

		int soma2 = MinhaCalculadora.soma(1, 2, 3);
		System.out.println(soma2);

		int soma3 = MinhaCalculadora.soma(1, 2);
		System.out.println(soma3);

		int[] vetor = new int[5];
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = i + 1;
		}

		int soma4 = MinhaCalculadora.soma(vetor);
		System.out.println(soma4);

	}

}
