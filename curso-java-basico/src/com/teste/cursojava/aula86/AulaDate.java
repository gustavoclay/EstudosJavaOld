package com.teste.cursojava.aula86;

import java.util.Date;

public class AulaDate {
	public static void main(String[] args) {

		Date hoje = new Date();

		System.out.println(hoje);

		System.out.println("Milisegundos desde 1 jan 1970" + hoje.getTime());
		
		System.out.println(hoje.getDate()); //depreciado warning

	}

}
