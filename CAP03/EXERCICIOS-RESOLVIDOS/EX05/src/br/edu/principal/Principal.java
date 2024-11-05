package br.edu.principal;

public class Principal {

	public static void main(String[] args) {
		double sal, perc, aumento, novosal;
		sal = 1000;
		perc = 25;
		aumento = sal * perc/100;
		System.out.println("O Aumento foi de: " +aumento+"R$");
		novosal = sal + aumento;
		System.out.println("O novo salario com o aumento ficou: "+novosal+"R$");
	}

}
