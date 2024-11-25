package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cod_est, cod_carga;
		double peso_toneladas, peso_quilos, pre_carga =0, imposto =0, valor_total;
		
		System.out.print("Digite o código do estado:");
		cod_est = sc.nextInt();
		System.out.print("Digite o peso em toneladas:");
		peso_toneladas = sc.nextDouble();
		System.out.print("Digite o código de carga:");
		cod_carga = sc.nextInt();
		
		peso_quilos = peso_toneladas * 1000;
		System.out.println("O peso em quilos é :" + peso_quilos);
		
		if (cod_carga >= 10 && cod_carga <= 20) {
			pre_carga = 100 * peso_quilos;
		}
		if (cod_carga >= 21 && cod_carga <= 30) {
			pre_carga = 250 * peso_quilos;
		}
		if (cod_carga >= 31 && cod_carga <= 40) {
			pre_carga = 340 * peso_quilos;
		}
		System.out.println("O preço da carga é:" + pre_carga);
		
		if (cod_est == 1) {
			imposto = 35.0/100 * pre_carga;
		}
		if (cod_est == 2) {
			imposto = 25.0/100 * pre_carga;
		}
		if (cod_est == 3) {
			imposto = 15.0/100 * pre_carga;
		}
		if (cod_est == 4) {
			imposto = 5.0/100 * pre_carga;
		}
		if (cod_est == 5) {
			imposto = 0;
		}
		System.out.println("Imposto :" + imposto);
		valor_total = pre_carga + imposto;
		System.out.println("Valor total é :" + valor_total);
	}
}
