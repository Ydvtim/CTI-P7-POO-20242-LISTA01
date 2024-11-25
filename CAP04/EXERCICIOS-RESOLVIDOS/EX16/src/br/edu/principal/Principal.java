package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double pre, venda, novo_pre;
		System.out.print("Digite o preço atual do produto:");
		pre = sc.nextDouble();
		System.out.print("Digite a venda média mensal do produto:");
		venda=sc.nextDouble();
		
		if (venda < 500 || pre < 30) {
			novo_pre= pre + (10.0/100)*pre;
		}else if ((venda >= 500 && venda <1200) || (pre >= 30 && pre < 80)) {
			novo_pre = pre + (15.0/100) *pre;
		}else if  (venda >=1200 || pre >= 80) {
			novo_pre = pre - (20.0/100) * pre;
		}else {
			novo_pre = pre;
		}
		System.out.println("O novo preço do produto é:" + novo_pre);
	}
}