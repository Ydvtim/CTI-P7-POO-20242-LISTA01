package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		do {
			num = sc.nextInt();
		} while ((num >= 1) && (num <= 9));
		multiplicacao(num);
		
	}
	
	public static int multiplicacao(int n) {
		int i, j;
		for (i = 1; i <= n; i++) {
			System.out.println();
			for (j = 1; j <= i; j++) {
				System.out.print(i * j + " ");
			}
		}
		return 0;
		
	}
}
