package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double sal_carlos, sal_joao, meses;
		
		System.out.println("Digite o salario de carlos: ");
		sal_carlos = sc.nextDouble();
		
		sal_joao = sal_carlos /3;
		meses = 0;
		
		while (sal_joao < sal_carlos) {
			sal_carlos = sal_carlos + (sal_carlos * 2 / 100);
			sal_joao = sal_joao + (sal_joao * 5 / 100);
			meses = meses + 1;
		}
		System.out.println("numero de meses para igualar ou ultrapassar o valor de carlos é: " + meses);
				

	}

}
