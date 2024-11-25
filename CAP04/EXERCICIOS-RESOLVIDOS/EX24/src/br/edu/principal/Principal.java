package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double pre, valor_adic=0, imposto, pre_custo, desconto, novo_pre;
		String tipo, refrig;
		
		System.out.print("Digite o preço:");
		pre= sc.nextDouble();
		System.out.print("Digite o tipo ( A, L, V) :");
		tipo = sc.next();
		System.out.print("O produto é refrigerador ? ( S ou N ) :");
		refrig=sc.next();
		
		if (refrig.equals("N")) {
			if (tipo.equals("A")){
				if  (pre < 15) {
					valor_adic=2;
				}
				else {
					valor_adic=5;
				}
			}
			else if (tipo.equals("L")) {
				if (pre < 10) {
					valor_adic = 1.50;
				}
				else {
					valor_adic = 2.50;
				}
			}
			else if (tipo.equals("V")) {
				if (pre < 30) {
					valor_adic = 3;
				}
				else {
					valor_adic = 2.5;
				}
			}
			
		}
		
		else {
			if (tipo.equals("A")) {
				valor_adic = 8;
			}
			else if (tipo.equals("L") || tipo.equals("V")) {
				valor_adic = 0;
			}
		}
		System.out.println("O valor adicionado :" + valor_adic);
		
		if (pre <25) {
			imposto = 0.05 * pre;
		}
		else {
			imposto = 0.08/100 * pre;
		}
		System.out.println("Imposto :" + imposto);
		
		pre_custo = pre + imposto;
		System.out.println("Preço de custo :" + pre_custo);
		
		if (tipo != "A" && refrig != "S") {
			desconto = 0.03 * pre_custo;
		}
		else {
			desconto = 0;
		}
		System.out.println("Desconto :" + desconto);
		novo_pre = pre_custo + valor_adic - desconto;
		System.out.println("Novo preço :" + novo_pre);
		
		if (novo_pre <= 50) {
			System.out.println("Barato");
		}
		else if (novo_pre < 100 ) {
			System.out.println("Normal");
		}
		else {
			System.out.println("Caro");
		}
	}

}
