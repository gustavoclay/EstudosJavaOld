package com.teste.cursojava.aula25;

public class Carro {

	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;

	void exibirAutonomia () {
		System.out.println("A autonomia do Carro é: "+capCombustivel*consumoCombustivel+" KM.");
	}
	
	
	
}
