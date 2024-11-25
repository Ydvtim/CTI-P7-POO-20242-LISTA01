package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double op, sal, imp = 0, aum = 0, novo_sal;
		
		do {
			System.out.println("MENU DE OPÇÕES");
			System.out.println("1- Imposto");
			System.out.println("2- Novo Salário");
			System.out.println("3- Classificação");
			System.out.println("4- Finalizar o programa");
			System.out.println("Digite a opção desejada: ");
			op = sc.nextDouble();
			
			if (op > 4 || op < 1) {
				System.out.println("Opção invalida!");
			} else if (op == 1) {
				System.out.println("Digite o valor do salario:");
				sal = sc.nextDouble();
				
				if (sal < 500) {
					imp = sal * 5 / 100;
				} else if (sal >= 500 && sal <= 850) {
					imp = sal * 10 / 100;
				} else if (sal > 850) {
					imp = sal * 15 / 100;
				}
				
				System.out.println("impostos: " + imp);
				
				
			} else if (op == 2) {
				System.out.println("Digite o valor do salario:");
				sal = sc.nextDouble();
				
				if (sal > 1500) {
					aum = 25;
				} else if (sal >= 750 && sal <= 1500) {
					aum = 50;
				} else if (sal >= 450 && sal < 750) {
					aum = 75;
				} else if (sal < 450) {
					aum = 100;
				} 
				
				novo_sal = sal + aum;
				System.out.println("novo salario: " + novo_sal);
				
				
			} else if (op == 3) {
				System.out.println("Digite o valor do salario:");
				sal = sc.nextDouble();
				
				if (sal <= 700) {
					System.out.println("Mal Renumerado");
				} else {
					System.out.println("Bem Renumerado");
				}
			}
		}while (op ==4);
				System.out.println("Programa Encerrado");
	}

}

