package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int i;
        double preco, custoEst = 0, imp, precoFinal;
        double maiorP = 0, menorP = 0, totImp = 0, adicional = 0;
        int qtdB = 0, qtdN = 0, qtdC = 0;
        String refri, categ;

        for (i = 1; i <= 12; i++) {
            System.out.print("Digite o preço do produto: ");
            preco = sc.nextDouble();

            System.out.print("O produto é refrigerado? (S/N): ");
            refri = sc.next();

            System.out.print("Digite a categoria do produto (A/L/V): ");
            categ = sc.next();

            if (preco <= 20) {
                if (categ.equalsIgnoreCase("A")) {
                    custoEst = 2;
                } else if (categ.equalsIgnoreCase("L")) {
                    custoEst = 3;
                } else if (categ.equalsIgnoreCase("V")) {
                    custoEst = 4;
                }
            } else if (preco > 20 && preco <= 50) {
                if (refri.equalsIgnoreCase("S")) {
                    custoEst = 6;
                } else {
                    custoEst = 0;
                }
            } else if (preco > 50) {
                if (refri.equals("S")) {
                    if (categ.equals("A")) {
                        custoEst = 5;
                    } else if (categ.equals("L")) {
                        custoEst = 2;
                    } else if (categ.equals("V")) {
                        custoEst = 4;
                    }
                } else {
                    if (categ.equals("A") || categ.equals("V")) {
                        custoEst = 0;
                    } else if (categ.equals("L")) {
                        custoEst = 1;
                    }
                }
            }

            if (!categ.equals("A") && !refri.equals("S")) {
                imp = preco * 2 / 100;
            } else {
                imp = preco * 4 / 100;
            }

            precoFinal = preco + custoEst + imp;

            System.out.println("Custo de armazenamento: " + custoEst);
            System.out.println("Imposto: " + imp);
            System.out.println("Preço final: " + precoFinal);

            if (precoFinal <= 20) {
                qtdB++;
                System.out.println("Classificação: Barato");
            } else if (precoFinal > 20 && precoFinal <= 100) {
                qtdN++;
                System.out.println("Classificação: Normal");
            } else if (precoFinal > 100) {
                qtdC++;
                System.out.println("Classificação: Caro");
            }

            adicional += custoEst + imp;
            totImp += imp;

            if (i == 1) {
                maiorP = precoFinal;
                menorP = precoFinal;
            } else {
                if (precoFinal > maiorP) {
                    maiorP = precoFinal;
                }
                if (precoFinal < menorP) {
                    menorP = precoFinal;
                }
            }
        }

        adicional /= 12;

        System.out.println("Adicional médio: " + adicional);
        System.out.println("Maior preço final: " + maiorP);
        System.out.println("Menor preço final: " + menorP);
        System.out.println("Total de imposto arrecadado: " + totImp);
        System.out.println("Quantidade de produtos classificados como baratos: " + qtdB);
        System.out.println("Quantidade de produtos classificados como normais: " + qtdN);
        System.out.println("Quantidade de produtos classificados como caros: " + qtdC);
		

	}

}