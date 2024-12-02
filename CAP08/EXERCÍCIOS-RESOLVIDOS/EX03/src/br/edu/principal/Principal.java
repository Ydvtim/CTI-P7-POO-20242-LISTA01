package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int a, b, c, result;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Digite o valor de A: ");
			a = sc.nextInt();
		} while(a<=1);
		System.out.println("Digite o valor de B: ");
		b = sc.nextInt();
		System.out.println("Digite o valor de C: ");
		c = sc.nextInt();
		result = divisores(a, b, c);
		System.out.println("Soma dos Inteiros = " + result);
}
	public static int divisores(int a, int b, int c) {
		int i, s, r;
		s = 0;
		for(i = b; i <= c; i++) {
			r = i % a;
			if(r == 0){
				s = s + i;
			}
		}
		return s;
	}

}
