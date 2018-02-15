package com.teste.cursojava.aula35;

import java.util.Scanner;

public class TesteFatorial {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Calcula Fatorial> Digite um número: ");
		int num = scan.nextInt();

		Fatorial res = new Fatorial();
		System.out.println("Fatorial normal: " + res.calculaFatorial(num));
		
		System.out.println("Fatorial recursivo: " + res.fatorial(num));
	}

}
