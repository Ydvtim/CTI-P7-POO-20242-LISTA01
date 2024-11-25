package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double sal_min, nht, coeficiente = 0, sal_bruto, imposto = 0, grat, auxilio, sal_liq;
		String turno, categoria;
		
		System.out.print("Digite o salário mínimo:");
		sal_min = sc.nextDouble();
		System.out.print("Digite o turno (M - Matutino , V - Vespertino , N- Noturno) : ");
		turno = sc.next();
		System.out.print("Digite a categoria (O- Operário, G- Gerente) :");
		categoria= sc.next();
		System.out.print("Digite o número de horas trabalhadas :");
		nht= sc.nextDouble();
		
		if (turno.equals("M")) {
			coeficiente = 0.10 * sal_min;
		}
		if (turno.equals("V")) {
			coeficiente = 0.15 * sal_min;
			}
		if (turno.equals("N")) {
			coeficiente = 0.12 * sal_min;
		}
		System.out.println("O coeficiente é :" + coeficiente);
		
		sal_bruto = nht * coeficiente;
		System.out.println("O salário bruto é :" + sal_bruto);
		
		if (categoria.equals("O")) {
			if (sal_bruto>=300) {
				 imposto = 0.05 * sal_bruto;
			}
			else {
				imposto= 0.03 * sal_bruto;
			}
		}
		else {
			if (sal_bruto>= 400) {
				
				imposto= 0.06 * sal_bruto;
			}
			else {
				imposto  = 0.04 * sal_bruto;
			}
		}
		System.out.println("Imposto :" + imposto);
		
		if (turno.equals("N") && nht>80) {
			grat = 50;
		}
		else {
			grat = 30;
		}
		System.out.println("Gratificação :" + grat);
		
		if (categoria.equals("O") || coeficiente <= 25) {
			auxilio = 1.0/3 * sal_bruto;
		}
		else {
			auxilio = 1.0/2 * sal_bruto;
		}
		
		System.out.println(" Auxílio :" + auxilio);
		
		sal_liq = sal_bruto - imposto + grat + auxilio;
		System.out.println("Salário Líquido" + sal_liq);
		if (sal_liq < 350) {
			System.out.println("Mal Remunerado");
		}
		else if (sal_liq >= 350 && sal_liq <= 600) {
			System.out.println("Normal");
		}
		else {
			System.out.println("Bem Remunerado");
		}
	}

}
