package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        double preco, imp, transp, seguro, origem, preco_final, total_imp = 0 ;
        String meio_t, carga;

        System.out.print("Digite o preço do produto (ou 0 para sair): ");
        preco = sc.nextDouble();

        while (preco > 0) {
            System.out.print("Digite a origem do produto (1, 2 ou 3): ");
            origem = sc.nextDouble();

            System.out.print("Digite o meio de transporte (T para terrestre, F para fluvial ou A para aéreo): ");
            meio_t = sc.next().toUpperCase();

            System.out.print("O produto é carregado? (S para sim, N para não): ");
            carga = sc.next().toUpperCase();

            if (preco <= 100) {
                imp = preco * 5 / 100;
            } else {
                imp = preco * 10 / 100;
            }

            if (carga.equals("S")) {
                if (origem == 1) {
                    transp = 50;
                } else if (origem == 2) {
                    transp = 21;
                } else if (origem == 3) {
                    transp = 24;
                } else {
                    System.out.println("Origem nao existente!");
                    continue;
                }
            } else if (carga.equals("N")) {
                if (origem == 1) {
                    transp = 12;
                } else if (origem == 2) {
                    transp = 21;
                } else if (origem == 3) {
                    transp = 60;
                } else {
                    System.out.println("Origem nao existente!");
                    continue;
                }
            } else {
                System.out.println("Entrada de carga inválida!");
                continue;
            }

           
            if (origem == 2 || meio_t.equals("A")) {
                seguro = preco / 2;
            } else {
                seguro = 0;
            }

            preco_final = preco + imp + transp + seguro;

            total_imp = total_imp + imp;

            System.out.printf("Imposto:"  + imp);
            System.out.printf("Transporte:" + transp);
            System.out.printf("Seguro:" + seguro);
            System.out.printf("Custo final" + preco_final);

            System.out.print("Digite o preço do próximo produto: ");
            preco = sc.nextDouble();
        }

        System.out.printf("Total de impostos:" + total_imp);
        
	}
}