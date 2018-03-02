package com.teste.cursojava.aula49;

import java.util.Scanner;

public class UsandoThrows {

	public static void main(String[] args) {
		System.out.println("Entre com um numero: ");
		try {
			double num = lerNumero();
			System.out.println("numero digitado: " + num);
		} catch (Exception e) {
			System.out.println("ERRO: Entrada inválida!");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}

	public static double lerNumero() throws Exception {
		Scanner n = new Scanner(System.in);
		double num = n.nextDouble();
		return num;

	}

}
