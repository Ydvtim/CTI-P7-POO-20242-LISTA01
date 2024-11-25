package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double i, num_cri, meses, porc_f, porc_m, tot_f = 0, tot_m = 0,
		tot_24 = 0, porc_24;
		String sexo;
		
		System.out.print("Digite o numero de crianças nascidas no periodo:");
		num_cri = sc.nextDouble();
		
		for (i = 1; i <= num_cri; i++ );
		System.out.print("Digite o sexo da " + i + " criança (M/F): ");
        sexo = sc.next();

        System.out.print("Digite o tempo de vida (em meses) da " + i + "ª criança: ");
        meses = sc.nextDouble();

        if (sexo.equals("M")) {
            tot_m++;
        } else if (sexo.equals("F")) {
            tot_f++;
        }
        if (meses <= 24) {
            tot_24++;
        }
        
        if (num_cri == 0) {
        	System.out.println("nenhuma criança digitada");
        } else {
        	porc_m = tot_m * 100 / num_cri;
        	porc_f =  tot_f * 100 / num_cri;
        	porc_24 = tot_24 * 100 / num_cri;

        	System.out.println("Percentual de crianças do sexo feminino mortas: " + porc_f);
        	System.out.println("Percentual de crianças do sexo masculino mortas: " + porc_m);
        	System.out.println("Percentual de crianças com 24 meses ou menos mortas no período: " + porc_24 );
}
		
		
		
        
	}
}
