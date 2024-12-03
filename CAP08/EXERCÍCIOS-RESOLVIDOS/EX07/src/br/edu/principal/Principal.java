package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		double nota1, nota2, nota3, m;
		String letra;
		
		System.out.print("digite a nota1: ");
		nota1 = sc.nextDouble();
		System.out.print("digite a nota2: ");
		nota2 = sc.nextDouble();
		System.out.print("digite a nota3: ");
		nota3 = sc.nextDouble();
		
		do {
			System.out.print("digite 'a' para calcular a media aritmetica ou 'p' para calcular media ponderada: ");
			letra = sc.next();
		} while (letra == "a" || letra == "p" || letra == "A" || letra == "P");
		m = calcula_media(nota1, nota2, nota3, letra);
		if (letra == "a") {
			System.out.println("a media aritmetica" + m);
		}else {
			System.out.println("a media ponderada" + m);
		}
		
			
		

	}
	public static double calcula_media(double n1, double n2, double n3, String l) {
		double media;
		if (l == "a") {
			media = (n1+n2+n3) /3;
		}else {
			media = (n1*5 + n2*3 + n3*2) / (5+3+2);
		}
		return media;
	}

}