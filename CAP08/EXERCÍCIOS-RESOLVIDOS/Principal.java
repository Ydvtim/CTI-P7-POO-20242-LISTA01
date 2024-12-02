package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int num, x;
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um Número: ");
		num = sc.nextInt();
		x = verifica(num);
		if (x==1) {
			System.out.println("Número positivo");
		}
		else {
			System.out.println("Número Negativo");
		}

	}
	public static int verifica(int num) {
	int res;
	if (num >= 0){
		res = 1;
	}
	else {
		res = 0;
	}
	return res;
	}
}
