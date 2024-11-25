package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cod_prod, cod_pais;
		double peso_quilos, peso_gramas, pre_grama =0, pre_total, imposto = 0 , valor_total;
		System.out.print("Informe o cógido do produto:");
		cod_prod= sc.nextInt();
		System.out.print("Informe o peso em quilos:");
		peso_quilos= sc.nextDouble();
		System.out.print("Informe o cógido do país :");
		cod_pais= sc.nextInt();
		
		peso_gramas = peso_quilos * 1000;
		System.out.println("Peso em gramas :" + peso_gramas);
		
		if (cod_prod >= 1 && cod_prod <= 4) {
			pre_grama = 10;
		}
		else if (cod_prod >= 5 && cod_prod <= 7) {
			pre_grama =  25;
		}
		else if (cod_prod >= 8 && cod_prod <= 10) {
			pre_grama= 35;
		}
		pre_total = peso_gramas * pre_grama;
		System.out.println("Preço total : " + pre_total);
		
		if (cod_pais == 1) {
			imposto = 0;
		}
		if (cod_pais == 2) {
			imposto = pre_total * 15/100;
		}
		if (cod_pais == 3) {
			imposto = pre_total * 25/100;
		}
		System.out.println("Imposto :" + imposto);
		valor_total = pre_total + imposto;
		System.out.println("Valor total:" + valor_total);
	}

}
