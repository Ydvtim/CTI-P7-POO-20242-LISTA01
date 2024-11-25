package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num, soma = 0, qtd = 0, maior = 0, menor = 0, qtd_par = 0, media_par,
		soma_par = 0, qtd_impar = 0, media, perc;
		
		System.out.print("Digite um numero (30000)");
		num = sc.nextDouble();
		
		while (num != 30000) {
            if (qtd == 0) {
                maior = num;
                menor = num;
            } else {
                if (num > maior) {
                    	maior = num;
                }
                if (num < menor) {
                		menor = num;
                }
            }

            soma = soma + num; 
            qtd++;  

            if (num % 2 == 0) {
                soma_par = soma_par + num;
                qtd_par++;
            } else {
                qtd_impar++;
            }

            System.out.print("Digite um número (30000 para encerrar): ");
            num = sc.nextInt();
        }

        if (qtd == 0) {
            System.out.println("Nenhum número digitado.");
        } else {
            System.out.println("Soma dos números: " + soma);
            System.out.println("Quantidade de números: " + qtd);

            media = soma / qtd;
            System.out.println("Média geral: " + media);

            System.out.println("Maior número: " + maior);
            System.out.println("Menor número: " + menor);

            if (qtd_par == 0) {
                System.out.println("Nenhum número par.");
            } else {
                media_par = soma_par / qtd_par;
                System.out.println("Média dos números pares: " + media_par);
            }

            perc = qtd_impar * 100 / qtd;
            System.out.println("Percentual de números ímpares: " + perc );
        }

	}

}