package com.teste.cursojava.aula17;

public class LoopFor {

	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}

		System.out.println("");
		for (int i = 5; i > 0; i--) {
			System.out.println(i);
		}

		System.out.println("");
		for (int i = 0, j = 10; i < j; i++, j--) {
			System.out.println("i: " + i);
			System.out.println("j: " + j);
		}

		int count = 0;
		for (; count < 20;) {
			System.out.println(count);
			count += 2;
		}

		int soma = 0;
		for (int i = 1; i <= 5; soma += i++)
			;
		System.out.println("Soma: " + soma);
	}

}