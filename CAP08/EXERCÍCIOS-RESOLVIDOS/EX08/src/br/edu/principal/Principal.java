package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hora_i, min_i, hora_f, min_f, minutos;
		
		System.out.println("digite a hora de inicio: ");
		hora_i = sc.nextInt();
		System.out.println("digite os minutos  de inicio: ");
		min_i = sc.nextInt();
		System.out.println("digite a hora final: ");
		hora_f = sc.nextInt();
		System.out.println("digite os minutos finais: ");
		min_f = sc.nextInt();
		
		minutos = calculo(hora_i, min_i, hora_f, min_f);
		System.out.println("a duracao de tempo em minutos é de: " + minutos+" Minutos");
		
	}
   public static int calculo(int h_i, int m_i, int h_f, int m_f) {
	   int tot_h, tot_m, total;
	   
	   if (m_f < m_i) {
		   m_f = m_f + 60;
		   h_f = h_f - 1;
	   }else if (h_f < h_i) {
		   h_f = h_f + 24;
	   }
	   
	   tot_m = m_f - m_i;
	   tot_h = h_f - h_i;
	   total = tot_h * 60 + tot_m;
	   
	   return total;
   }


}

