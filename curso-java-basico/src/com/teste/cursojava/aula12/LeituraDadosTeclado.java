package com.teste.cursojava.aula12;

import java.util.Scanner;

/**
 * @author TR520596
 *
 */
public class LeituraDadosTeclado {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("What's your name? ");
		String nome = scan.nextLine();
		System.out.println(nome);
		
		System.out.println("How old are you? ");
		int idade = scan.nextInt();
		System.out.println(idade);
	}

}
