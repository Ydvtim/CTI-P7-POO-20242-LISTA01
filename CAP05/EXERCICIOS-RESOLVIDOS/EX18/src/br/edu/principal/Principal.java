package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num, quad, cubo, raiz;
		
		System.out.println("digite um numero:");
		num = sc.nextDouble();
		
		while (num > 0) {
			quad = num * num;
			cubo = num * num * num;
			raiz = Math.sqrt(num);
		
			System.out.println("quadrado: " + quad);
			System.out.println("cubo: " + cubo);
			System.out.println("raiz: " + raiz);
		
				if (num <=0);
				num = sc.nextDouble();
	}
		System.out.println("fim do programa");
	}

}
