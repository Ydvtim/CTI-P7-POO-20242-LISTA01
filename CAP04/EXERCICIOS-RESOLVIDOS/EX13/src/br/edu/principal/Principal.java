package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int opcao;
		double sal, imp, aum, novo_sal;
		System.out.println("MENU DE OPÇÕES");
		System.out.println("1 - IMPOSTO");
		System.out.println("2 - NOVO SALARIO");
		System.out.println("3- CLASSIFICAÇÃO");
		System.out.println("DIGITE A OPÇÃO DESEJADA:");
			opcao = sc.nextInt();
			
			if (opcao == 1) {
				System.out.print("Digite o salário:");
				sal= sc.nextDouble();
				if (sal<500) {
					imp= sal* 0.05;
				} else if (sal>=500 &&  sal <= 850) {
					
					imp= sal*0.10;
				} else {
					imp=sal*0.15;
				}
				System.out.println("O valor do imposto é:"+ imp);
			} else if (opcao == 2) {
				System.out.print("Digite o salário:");
				sal=sc.nextDouble();
				if (sal> 1500) {
					aum= 25;
				} else if (sal >= 750 && sal <=1500) {
					aum=75;
				}else {
					aum = 100;
				}
				
				novo_sal= sal+ aum;
				System.out.println("O novo salário:"+ novo_sal);
			} else if (opcao == 3) {
				System.out.print("Digite o salário:");
				sal = sc.nextDouble();
				if (sal <= 700) {
					System.out.println("Cassificação: Mal remunerado");
				} else {
					System.out.println("Classificação: Bem remunerado");
				}
			} else { 
				System.out.println("Opção inválida");
					
				}
			}
	}