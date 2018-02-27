package com.teste.cursojava.aula45;

public class teste2 {

	public static void main(String[] args) {
		
		Object obj1 = obterString();
		String s1 = (String) obj1; //Downcasting
		
		Object obj2 = "Minha String"; //Upcasting
		String s2 = (String) obj2;
		
//		Object obj3 = new Object();
//		String s3 = (String) obj3;
// Objeto não pode ser convertido em String
		
//		Object obj4 = obterInt();
//		String s4 = (String) obj4;
//	Não pode ser convertido em String
		
//  Downcasting só funciona para conversão do tipo em particular
		
		
	}
	
	public static String obterString() {
		return "Minha String";
	}
	
	public static int obterInt() {
		return 1;
	}

}
