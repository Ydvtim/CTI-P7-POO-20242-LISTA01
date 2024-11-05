package br.edu.principal;

public class Principal {

	public static void main(String[] args) {
		double sal, novosal;
		sal = 100;
		novosal = sal + (sal * 25/100) ;
		System.out.println("O Salário "+sal + " Com um aumento de 25% fica: "+novosal);
	}

}
