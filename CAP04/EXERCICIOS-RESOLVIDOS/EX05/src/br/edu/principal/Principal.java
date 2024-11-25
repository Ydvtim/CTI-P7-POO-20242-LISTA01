package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		        Scanner scanner = new Scanner(System.in);

		        double num1, num2, num3, num4;

		        System.out.print("Digite três números em ordem crescente: ");
		        num1 = scanner.nextDouble();
		        num2 = scanner.nextDouble();
		        num3 = scanner.nextDouble();

		        System.out.print("Digite um número (fora de ordem): ");
		        num4 = scanner.nextDouble();

		        if (num4 > num3) {
		            System.out.println("A ordem decrescente é: " + num4 + " - " + num3 + " - " + num2 + " - " + num1);
		        } else if (num4 > num2 && num4 < num3) {
		            System.out.println("A ordem decrescente é: " + num3 + " - " + num4 + " - " + num2 + " - " + num1);
		        } else if (num4 > num1 && num4 < num2) {
		            System.out.println("A ordem decrescente é: " + num3 + " - " + num2 + " - " + num4 + " - " + num1);
		        } else if (num4 < num1) {
		            System.out.println("A ordem decrescente é: " + num3 + " - " + num2 + " - " + num1 + " - " + num4);
		        }
		    }
		}


	


