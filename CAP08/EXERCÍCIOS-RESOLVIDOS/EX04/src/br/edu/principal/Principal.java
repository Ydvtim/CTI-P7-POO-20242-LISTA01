package br.edu.principal;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		int seg;
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite os segundos: ");
		seg = sc.nextInt();
		transformacao(seg);
	}
	public static void transformacao(int segundos) {
		int h, m, s, r;
		h = segundos / 3600;
		r = segundos % 3600;
		m = r / 60;
		s = r % 60;
		System.out.println("Horas: " + h);
		System.out.println("Minutos: " + m);
		System.out.println("Segundos: " + s);
	}
}

