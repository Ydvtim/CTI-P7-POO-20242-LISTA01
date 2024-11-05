package br.edu.principal;

public class Principal {

	public static void main(String[] args) {
		double a_degrau, a_usuario;
		int qtd_degraus;
		a_degrau = 0.50;
		a_usuario = 1.72;
		qtd_degraus = (int) (a_usuario / a_degrau);
		System.out.println("Deverá Subir: "+qtd_degraus+" degraus");
	}

}
