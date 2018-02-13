package com.teste.cursojava.aula17;

import java.util.Random;

public class ForEach {

	public static void main(String[] args) {

		int[] notas = new int[10];

		Random random = new Random();

		for (int i = 0; i < notas.length; i++) {
			notas[i] = random.nextInt(10);
		}
		System.out.println("For: ");
		for (int i = 0; i < notas.length; i++) {
			System.out.println(notas[i]);
		}
		System.out.println("Foreach: ");
		for (int nota : notas) {
			System.out.println(nota);
		}
		
		
		
		
		
		
		
	}

}
