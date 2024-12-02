package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, pontos, tot_ap, perc_ap, i, j;
		int resposta[] = new int[8];
		int gabarito[] = new int[8];
		j = 0;
		
		for (i = 0; i < 8; i++) {
			System.out.println("Digite a resposta da questão " + i);
			gabarito[i] = sc.nextInt();
		}
		tot_ap = 0;
		for (i = 0; i < 10; i++) {
			System.out.println("Digite o número do " + i + "° aluno");
			num = sc.nextInt();
			pontos = 0;
			for (i = 1; i <= 8; i++) {
				System.out.println("Digite a resposta dada pelo aluno " + num + " à " + j + "a questão");
				resposta[j] = sc.nextInt();
				if (resposta[j] == gabarito[j]) {
					pontos++;
				}
			}
			System.out.println("A nota do aluno " + num + " foi " + pontos);
			if (pontos >= 6) {
				tot_ap++;
			}
		}
		perc_ap = tot_ap * 100 / 10;
		System.out.println("O percentual de alunos aprovados é " + perc_ap);
	}

}
