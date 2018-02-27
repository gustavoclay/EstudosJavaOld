package com.teste.cursojava.aula47;

public class Excecao {

	public static void main(String[] args) {

		try {

			int[] vetor = new int[4];

			System.out.println("Antes de exception!");

			vetor[4] = 1;

			System.out.println("Não será impresso!");

		} catch (ArrayIndexOutOfBoundsException exception) {

			System.out.println("Erro ao acessar um indice do vetor que não existe");
		}

		System.out.println("Será impresso após a exception!");

	}

}
