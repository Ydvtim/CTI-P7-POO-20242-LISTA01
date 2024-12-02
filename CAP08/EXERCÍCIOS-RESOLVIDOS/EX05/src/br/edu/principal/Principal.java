package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	double precoantigo, precoatual, acrescimo;
	System.out.println("Digite o valor antigo do produto: ");
	precoantigo = sc.nextDouble();
	System.out.println("Digite o valor atual do produto: ");
	precoatual = sc.nextDouble();
	acrescimo = calculo_reajuste(precoantigo, precoatual);
	System.out.println("Acréscimo: " + acrescimo);
	
	}
	public static double calculo_reajuste(double PA, double PN) {
		double result;
		result = (100 * PN - 100 * PA) / PA;
		return result;
	}

}
