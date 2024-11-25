package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double sal_min, nht, ndep, nhet;
		double vh, smes, vdep, vhe, sbruto, imp, sliq, grat, sal_receber;
		
		System.out.print("Digite o valor do salário mínimo:");
		sal_min= sc.nextDouble();
		System.out.print("Digite o número de horas trabalhadas:");
		nht= sc.nextDouble();
		System.out.print("Digite o número de dependentes:");
		ndep=sc.nextDouble();
		System.out.print("Digite o número de horas extras trabalhadas:");
		nhet= sc.nextDouble();
		
		vh = sal_min/5;
		smes = nht * vh;
		vdep = 32 * ndep;
		vhe = nhet* ( vh + (vh *0.50));
		sbruto = smes+ vdep + vhe;
		
		if (sbruto < 200) {
			imp = 0;
		}else if (sbruto<=500) {
			imp= sbruto*0.10;
		}else {
			imp= sbruto*0.20;
		}
		sliq = sbruto - imp;
		if (sliq <= 350) {
			grat = 100;
		} else {
			grat = 50;
		}
		sal_receber = sliq+ grat;
		System.out.println("Salário a receber é :" + sal_receber);
		}

}
