package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		double alt, peso;
		System.out.print("Altura:");
		alt = sc.nextDouble();
		System.out.print("peso:");
		peso = sc.nextDouble();
		
		if (alt< 1.20) {
			 if ( peso <= 60) {
				System.out.println("Sua saída é : A");
			 }
			 if (peso > 60 && peso <= 90) {
				 System.out.println("Sua saída é : D");
			 }
			 if (peso > 90) {
				 System.out.println("Sua saída é : G");
			 }
		}
		if (alt>= 1.20 && alt <=1.70) {
			if ( peso <= 60) {
				System.out.println("Sua saída é : B");
			 }
			 if (peso > 60 && peso <= 90) {
				 System.out.println("Sua saída é : E");
			 }
			 if (peso > 90) {
				 System.out.println("Sua saída é : H");
			 }
		}
		if (alt > 1.70) {
			if (peso <= 60) {
				System.out.println("Sua saída é : C");
			}
			if (peso> 60 &&  peso <=90) {
				System.out.println("Sua saída é : F");
			}
			if (peso> 90) {
				System.out.println("Sua saída é : I");
			}
		}
		
	}

}
