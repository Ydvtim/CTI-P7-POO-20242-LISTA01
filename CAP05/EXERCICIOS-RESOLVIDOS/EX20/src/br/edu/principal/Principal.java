package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double cod, num_h, sal_b, sal_l, media_m = 0, media_f = 0,
		cont_m = 0, cont_f = 0;
		String sexo;
		
		System.out.print("Digite o codigo (99999 para encerrar):");
		cod = sc.nextDouble();

        while (cod != 99999) {
            System.out.print("Digite o sexo (M para masculino, F para feminino): ");
            sexo = sc.next().toUpperCase();

            System.out.print("Digite o número de horas trabalhadas: ");
            num_h = sc.nextDouble();

            sal_b = num_h * 30;

            if (sexo.equals("M")) {
                sal_l = sal_b - (sal_b * 10 / 100);
                media_m = media_m + sal_l;
                cont_m++;
            } else if (sexo.equals("F")) {
                sal_l = sal_b - (sal_b * 5 / 100);
                media_f = media_f + sal_l;
                cont_f++;
            } else {
                System.out.println("Sexo inválido.");
                continue;
            }

            System.out.println("Código: " + cod);
            System.out.println("Salário Bruto: " + sal_b);
            System.out.println("Salário Líquido: " + sal_l);

            System.out.print("Digite o código (99999 para encerrar): ");
            cod = sc.nextInt();
        }

        if (cont_m == 0) {
            System.out.println("Nenhum professor do sexo masculino.");
        } else {
            media_m = media_m / cont_m;
            System.out.println("Média salarial dos professores masculinos: " + media_m);
        }

        if (cont_f == 0) {
            System.out.println("Nenhum professor do sexo feminino.");
        } else {
            media_f = media_f / cont_f;
            System.out.println("Média salarial das professoras femininas: " + media_f);
        }
		

	}

}
