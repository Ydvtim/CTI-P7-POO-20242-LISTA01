package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double idade, tot_f = 0, tot_m = 0, soma1 = 0, cont_m1 = 0, 
		cont_m2 = 0, tot = 0, cont_f1 = 0, media_idade, perc, menor_idade = 0;
		String sexo, exp;
		
	

		System.out.print("Digite a idade (0 para encerrar): ");
		idade = sc.nextDouble();
	
		while (idade != 0) {
			System.out.print("Digite o sexo (M para masculino, F para feminino): ");
			sexo = sc.next().toUpperCase();
	
			System.out.print("Tem experiência (S para sim, N para não): ");
			exp = sc.next().toUpperCase();
	
			if (sexo.equals("F") && exp.equals("S")) {
				if (tot == 0) {
					menor_idade = idade;
					tot = 1;
                } else if (idade < menor_idade) {
                    menor_idade = idade;
                }
            }else if (sexo.equals("M")) {
                tot_m++;
            }else if (sexo.equals("F")) {
                tot_f++;
            }else if (sexo.equals("F") && idade < 21 && exp.equals("S") ) {
                cont_f1++;
            }else if (sexo.equals("M") && idade > 45) {
            	cont_m1++;
            } else if (sexo.equals("M") && exp.equals("S")) {
            	soma1 = soma1 + idade;
            	cont_m2++;
            }

            System.out.print("Digite a idade (0 para encerrar): ");
            idade = sc.nextDouble();
		}
       
        System.out.println("Total de mulheres: " + tot_f);
        System.out.println("Total de homens: " + tot_m);

        if (cont_m2 == 0) {
            System.out.println("Nenhum homem com experiência.");
        } else {
            media_idade = soma1 / cont_m2;
            System.out.println("Média de idade dos homens com experiência: " + media_idade);
        }
        if (tot_m == 0) {
            System.out.println("Nenhum homem.");
        } else {
            perc = cont_m1 * 100 / tot_m;
            System.out.println("Percentual de homens com mais de 45 anos: " + perc );
        }

        System.out.println("Quantidade de mulheres com menos de 21 anos e com experiência: " + cont_f1);

        if (tot == 0) {
            System.out.println("Nenhuma mulher com experiência.");
        } else {
            System.out.println("Menor idade entre as mulheres com experiência: " + menor_idade);
        }
	}
}

