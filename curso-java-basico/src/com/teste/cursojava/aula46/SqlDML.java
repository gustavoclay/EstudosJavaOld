package com.teste.cursojava.aula46;

public interface SqlDML {

	void insert(String query);

	void update(String query);

	void delete(String query);

	String select(String query);

}
