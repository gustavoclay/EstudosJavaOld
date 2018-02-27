package com.teste.cursojava.aula48;

public class MultiplosCatchJava7 {

	public static void main(String[] args) {

		int[] numeros = { 4, 8, 16, 32, 64, 128 };
		int[] denom = { 2, 0, 4, 8, 0 };

		for (int i = 0; i < numeros.length; i++) {

			try {
				System.out.println(numeros[i] + "/" + denom[i] + " :" + numeros[i] / denom[i]);
			} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
				System.out.println("Ocorreu um erro");
			}

		}

	}

}
