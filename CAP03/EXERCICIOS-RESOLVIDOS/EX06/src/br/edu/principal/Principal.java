package br.edu.principal;

public class Principal {

	public static void main(String[] args) {
		double sal, salreceber, grat, imp;
		sal = 100;
		grat = sal * 5/100;
		imp = sal * 7/100;
		salreceber = sal + grat - imp;
		System.out.println("O Salario a receber é de: "+salreceber+"R$");
	}

}
