package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		

		
		        Scanner sc = new Scanner(System.in);
		        double a, b, c;
		        int i;

		        System.out.print("Digite um valor para A: ");
		        a = sc.nextDouble();

		        System.out.print("Digite um valor para B: ");
		        b = sc.nextDouble();

		        System.out.print("Digite um valor para C: ");
		        c = sc.nextDouble();

		        System.out.print("Digite um valor para I (1, 2 ou 3): ");
		        i = sc.nextInt();

		        if (i == 1) {
		            if (a < b && a < c) {
		                if (b < c) {
		                    System.out.println("A ordem crescente dos números é: " + a + " - " + b + " - " + c);
		                } else {
		                    System.out.println("A ordem crescente dos números é: " + a + " - " + c + " - " + b);
		                }
		            } else if (b < a && b < c) {
		                if (a < c) {
		                    System.out.println("A ordem crescente dos números é: " + b + " - " + a + " - " + c);
		                } else {
		                    System.out.println("A ordem crescente dos números é: " + b + " - " + c + " - " + a);
		                }
		            } else {
		                if (a < b) {
		                    System.out.println("A ordem crescente dos números é: " + c + " - " + a + " - " + b);
		                } else {
		                    System.out.println("A ordem crescente dos números é: " + c + " - " + b + " - " + a);
		                }
		            }
		        }

		        if (i == 2) {
		            if (a > b && a > c) {
		                if (b > c) {
		                    System.out.println("A ordem decrescente dos números é: " + a + " - " + b + " - " + c);
		                } else {
		                    System.out.println("A ordem decrescente dos números é: " + a + " - " + c + " - " + b);
		                }
		            } else if (b > a && b > c) {
		                if (a > c) {
		                    System.out.println("A ordem decrescente dos números é: " + b + " - " + a + " - " + c);
		                } else {
		                    System.out.println("A ordem decrescente dos números é: " + b + " - " + c + " - " + a);
		                }
		            } else {
		                if (a > b) {
		                    System.out.println("A ordem decrescente dos números é: " + c + " - " + a + " - " + b);
		                } else {
		                    System.out.println("A ordem decrescente dos números é: " + c + " - " + b + " - " + a);
		                }
		            }
		        }

		        if (i == 3) {
		            if (a > b && a > c) {
		                System.out.println("A ordem desejada é: " + b + " - " + a + " - " + c);
		            } else if (b > a && b > c) {
		                System.out.println("A ordem desejada é: " + a + " - " + b + " - " + c);
		            } else {
		                System.out.println("A ordem desejada é: " + a + " - " + c + " - " + b);
		            }
		        }
		    }


	}


