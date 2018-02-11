package com.teste.cursojava.aula15;

public class Array {

	public static void main(String[] args) {

		double[] temperaturas = new double[366];
		System.out.println("O tamanho do array: " + temperaturas.length);

		for (int j = 0; j < temperaturas.length; j++) {
			temperaturas[j] = 34.4;
		}
		
/*		for (double d : temperaturas) {
			System.out.println("Temperatura dia"+i+": "+temperaturas[(int) d]);
		}*/
		
		for (int j = 0; j < temperaturas.length; j++) {
			System.out.println("Dia: "+(j+1)+" Temperatura: "+temperaturas[j]);
		}
		
		
	}

}
