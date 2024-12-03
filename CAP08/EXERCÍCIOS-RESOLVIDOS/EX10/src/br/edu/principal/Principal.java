package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num, s;
		
		System.out.println("digite um numero: ");
		num = sc.nextInt();
		
		s = sequencia(num);
		System.out.println("o valor de S é " + s);
	}
	public static double sequencia(double n) {
		double a, b, f, seq = 1;
		
		for (a = 1; a <= n; a++) {
			f = 1;
			for (b = 1; b <= a; b++) {
				f = f * b;
			}
			
			seq = seq + 1 /f;
	}
			
		return seq;
		
	}
		
}
