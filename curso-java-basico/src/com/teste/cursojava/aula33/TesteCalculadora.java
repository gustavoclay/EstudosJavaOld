package com.teste.cursojava.aula33;

import java.util.Random;

public class TesteCalculadora {

	public static void main(String[] args) {
		
		MinhaCalculadora calc = new MinhaCalculadora();
		
		System.out.println(calc.soma(1, 2));
		System.out.println(calc.soma(1, 2, 3));
		System.out.println(calc.soma(1, 2));
		
		int[] vetor = new int[5];
		
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = i+1;
		}
		
		System.out.println(calc.soma(vetor));

	}

}
