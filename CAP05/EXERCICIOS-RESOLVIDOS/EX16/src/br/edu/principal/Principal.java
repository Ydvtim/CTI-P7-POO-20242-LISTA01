package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double base, altura, area;
		
		System.out.println("Digite a base do triangulo (maior que 0):");
		base = sc.nextDouble();
		System.out.println("Digite a altura do triangulo (maior que 0):");
		altura = sc.nextDouble();
		
		if (base > 0 && altura > 0) {
		area = base * altura / 2;
		System.out.println("area do triangulo:" + area);
		
		} else {
			System.out.println("a base e a altura tem que ser maior que 0");
		}
	
		
		
	}

}
