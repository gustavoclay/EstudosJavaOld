package com.teste.cursojava.aula35;

public class Fatorial {

	public int calculaFatorial(int num) {
		int total = 1;

		for (int i = num; i > 1; i--) {
			total *= i;
		}

		return total;
	}

	public int fatorial(int num) {
		
		if (num == 0) {
			return 1;
		}
		
		return num * fatorial(num - 1);
	}

}
