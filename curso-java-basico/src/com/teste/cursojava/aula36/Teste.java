package com.teste.cursojava.aula36;

public class Teste {

	public static void main(String[] args) {

		Contato contato = new Contato();

		contato.setNome("Gustavo");
		contato.setTelefone("0119999999");

		Endereco endereco = new Endereco();

		endereco.setNomeRua("Rua das ostras");
		endereco.setNumero("21");
		endereco.setComplemento("Apartamento");
		endereco.setCidade("Rio de Janeiro");
		endereco.setEstado("Rio de Janeiro");
		endereco.setCep("70000000");

		contato.setEndereco(endereco);

		System.out.println(contato.getNome());
		System.out.println(contato.getEndereco());
		System.out.println(contato.getTelefone());

	}

}
