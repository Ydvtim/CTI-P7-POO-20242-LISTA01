package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int ano_atual, ano_nascimento, idade_atual, idade_2050=2050;

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite ano atual: ");
		ano_atual = sc.nextInt();

		System.out.println("Digite ano de nascimento: ");
		ano_nascimento= sc.nextInt();

		System.out.println("idade é:" + (ano_atual-ano_nascimento));
		System.out.println("idade em 2050 é:" + (2050-ano_nascimento));
	}
	}
	
