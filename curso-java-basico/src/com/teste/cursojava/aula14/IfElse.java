package com.teste.cursojava.aula14;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite sua idade: ");
		int idade = scan.nextInt();

		if (idade >= 18) {
			System.out.println("Maior de Idade!");
		} else {
			System.out.println("Menor de Idade!");
		}

	}

}
