package br.edu.principal;

public class Principal {

	public static void main(String[] args) {
		double i, ano_atual, salario, novo_salario, percentual;
		
		ano_atual = 2024;
		salario = 1000;
		percentual = 1.5/100;
		novo_salario = salario + salario * percentual;
		System.out.println(percentual);
		for (i = 2007; i <= ano_atual; i++) {
			percentual = 2 * percentual;
			novo_salario = novo_salario + novo_salario * percentual;
		}
		System.out.println(novo_salario);
	}

}
