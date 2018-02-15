package com.teste.cursojava.aula36;

public class Teste {

	public static void main(String[] args) {

		Contato contato = new Contato();

		contato.setNome("Gustavo");

		Endereco endereco = new Endereco();

		endereco.setNomeRua("Rua das ostras");
		endereco.setNumero("21");
		endereco.setComplemento("Apartamento");
		endereco.setCidade("Rio de Janeiro");
		endereco.setEstado("Rio de Janeiro");
		endereco.setCep("70000000");

		contato.setEndereco(endereco);

		Telefone telefone = new Telefone();
		telefone.setDdd("61");
		telefone.setTipo("Fixo");
		telefone.setNumero("30000000");

		Telefone telefone2 = new Telefone();
		telefone2.setDdd("61");
		telefone2.setTipo("Celular");
		telefone2.setNumero("999999999");

		Telefone[] telefones = new Telefone[2];
		telefones[0] = telefone;
		telefones[1] = telefone2;

		// contato.setTelefone(telefone);
		contato.setTelefones(telefones);

		System.out.println(contato.getNome());

		if (contato != null && contato.getEndereco() != null) {
			System.out.println(contato.getEndereco().toString());
		}

		/*
		 * if(contato != null && contato.getTelefone() != null) {
		 * System.out.println(contato.getTelefone().toString()); }
		 */

		if (contato != null && contato.getTelefones() != null) {
			for (Telefone t : telefones) {
				System.out.println(t.toString());
			}
		}

	}

}
