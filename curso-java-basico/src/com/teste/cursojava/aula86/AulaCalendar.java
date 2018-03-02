package com.teste.cursojava.aula86;

import java.util.Calendar;	

public class AulaCalendar {

	public static void main(String[] args) {

		Calendar hoje = Calendar.getInstance(); // singleton

		int ano = hoje.get(Calendar.YEAR);
		int mes = hoje.get(Calendar.MONTH);
		int dia = hoje.get(Calendar.DAY_OF_MONTH);

		System.out.println(ano);
		System.out.println(mes);
		System.out.println(dia);

		System.out.printf("Hoje é : %02d/%02d/%d ", dia, (mes + 1), ano);
	}

}
