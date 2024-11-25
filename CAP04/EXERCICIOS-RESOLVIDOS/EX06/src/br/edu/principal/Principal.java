package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int num, r;
		Scanner sc = new Scanner (System.in);
		System.out.print("Digite um Número: ");
		num = sc.nextInt();
		r = num % 2;
		if (r == 0) {
		System.out.print("O Número é par");	
		}
		else {
		System.out.print("O Número é impar");		
		}
		
	}

}