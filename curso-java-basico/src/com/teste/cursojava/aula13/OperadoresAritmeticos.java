package com.teste.cursojava.aula13;

import java.util.Scanner;

public class OperadoresAritmeticos {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite um número: ");
		double res = scan.nextDouble();

		System.out.println(res + 2);
		System.out.println(res - 2);
		System.out.println(res * 2);
		System.out.println(res / 2);
		System.out.println(res % 2);

		double result = res++;
		System.out.println(result);
		result = 0;
		result = ++res;
		System.out.println(result);
		result = 0;
		result = res--;
		System.out.println(result);
		result = 0;
		result = --res;
		System.out.println(result);
		
		double num = res;
		num += 1;
		System.out.println(num);
		
		double num1 = res;
		num1 -= 1;
		System.out.println(num1);

	}

}
