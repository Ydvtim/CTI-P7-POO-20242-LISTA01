package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
        double valor_inicial, juros = 0, valor_parc, total, valor_juros, num_parc = 1;
		System.out.print("Digite o valor_inicial da divida: ");
		valor_inicial = sc.nextDouble();
		
		total = valor_inicial;
		valor_parc = valor_inicial;
		System.out.println("total:" + total);
		System.out.println("juros:" + juros );
		System.out.println("num_parc:" + num_parc);
		System.out.println("valor_parc:" + valor_parc);
		
		juros += 10;
		num_parc += 2;
		
		for (int i = 1; i<=4; i++); {
			valor_juros = valor_inicial * juros  /100;
			total = valor_inicial + valor_juros;
			valor_parc = total / num_parc;
		
			System.out.println("total:" + total);
			System.out.println("valor do juros:" + valor_juros);
			System.out.println("numero de parcelas:" + num_parc);
			System.out.println("valor de parcelas:" + valor_parc);
			
			juros += 5;
			num_parc += 3;

	}

	
		
	}

}
