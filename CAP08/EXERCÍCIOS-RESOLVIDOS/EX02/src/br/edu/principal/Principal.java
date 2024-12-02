package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int num1, num2, s;
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um número: ");
		num1 = sc.nextInt();
		System.out.print("Digite outro número: ");
		num2 = sc.nextInt();
		s = somar(num1 , num2);
		System.out.print("Soma = " + s);
	}
	public static int somar(int num1, int num2) {
		int i, s;
		s = 0;
		for(i = num1 + 1; i < num2; i++) {
			s += i;
		}
		return s;
	}
}


