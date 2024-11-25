package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double sal, novo_sal, boni, aux;
		
		System.out.print("Digite o salário inicial do funcionário:");
		sal= sc.nextDouble();
		if (sal<=500) {
			boni= sal*0.05;
		} else if (sal <= 1200) {
			boni= sal*0.12;
		}else {
			boni= 0;
		}
		
		if (sal<= 600) {
			aux= 150;
		} else {
			aux = 100;
		}
		novo_sal= sal+boni+aux;
				System.out.println("O novo salário, com bonificação e auxílio escola é :" + novo_sal);
		
	}

}
