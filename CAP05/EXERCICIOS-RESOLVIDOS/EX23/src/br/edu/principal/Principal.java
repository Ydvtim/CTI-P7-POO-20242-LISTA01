package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double sal, qtd, tipo, valor_kw, gasto, acresc, total,
		tot_geral = 0, qtd_cons = 0;
		
		System.out.print("Digite o valor do salario: ");
		sal = sc.nextDouble();
		
		System.out.print("Digite a quantidade de quilowatts (ou 0 para encerrar); ");
		qtd = sc.nextDouble();
		
		valor_kw = sal / 8;
		
		while (qtd != 0) {
			gasto = qtd * valor_kw;
			
			System.out.print("Digite o tipo do consumidor 1, 2 ou 3: ");
			tipo = sc.nextDouble();
			
			if (tipo == 1) {
				acresc = gasto * 5  /100;
			
			} else if (tipo == 2) {
				acresc = gasto * 10  / 100;
			
			} else if (tipo == 3) { 
				acresc = gasto * 15 / 100;
			
			} else { 
				System.out.println("Tipo não existente.");
				acresc = 0;
			}
			
			total = gasto + acresc;
			tot_geral = tot_geral + total;
			
			if (total >= 500 && total <= 1000) {
				qtd_cons++;
			}
			
			System.out.println("Gastos: " + gasto);
			System.out.println("Acresc: " + acresc);
			System.out.println("Total: " + total);
			
			System.out.print("Digite a quantidade de quilowatts (ou 0 para encerrar); ");
			qtd = sc.nextDouble();
			
			System.out.println("Total geral: " + tot_geral);
			System.out.println("quantidade de consumidores: " + qtd_cons);
		}
		

	}

}
