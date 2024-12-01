package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] qtd = new int[10];
        double[] preco = new double[10];
        double tot_geral = 0, tot_vend, comissao;
        int maior, ind;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite a quantidade do produto " + (i + 1) + ": ");
            qtd[i] = sc.nextInt();

            System.out.print("Digite o preço do produto " + (i + 1) + ": ");
            preco[i] = sc.nextDouble();
        }

        System.out.println("Resumo das vendas:");
        for (int i = 0; i < 10; i++) {
            tot_vend = qtd[i] * preco[i];
            System.out.println("Produto " + (i + 1) + ": Quantidade = " + qtd[i] + ", Preço = " + preco[i] + ", Total Venda = " + tot_vend);
            tot_geral += tot_vend;
        }

        comissao = tot_geral * 5 / 100;

        
        System.out.println("Total Geral das Vendas: " + tot_geral);
        System.out.println("Comissão (5%): " + comissao);

        maior = qtd[0]; 
        ind = 0;        

        for (int i = 1; i < 10; i++) {
            if (qtd[i] > maior) {
                maior = qtd[i];
                ind = i;
            }
        }
    
        System.out.println("Produto mais vendido: Preço = " + preco[ind] + ", Índice = " + (ind + 1));
}
}