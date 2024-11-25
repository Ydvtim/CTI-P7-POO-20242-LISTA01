package br.edu.principal;

public class Principal {

	public static void main(String[] args) {
		double cont, codigo, nht, valor, sal_min, sal_inicial, aux, sal_final;
		String turno, categoria;
		nht = 0;
		valor = 0;
		codigo = 0;
		sal_min = 450;
		for (cont = 1; cont <= 10; cont++) {
			codigo = 105;
			nht = 10;
			turno = "M";
			categoria = "O";
			while (turno != "M" && turno != "V" && turno != "N") {
				turno = "M";
			}
			while (categoria != "G" && categoria != "O") {
				categoria = "G";
			}
			if (categoria == "G") {
				if (turno == "N") {
					valor = sal_min * 18/100;
				} else {
					valor = sal_min * 18/100;
				}
			} else {
				if (turno == "N") {
					valor = sal_min * 13/100;
				} else {
					valor = sal_min * 10/100;
				}
			}
			sal_inicial = nht * valor;
			if (sal_inicial <= 300) {
				aux = sal_inicial * 20/100;
			} else if (sal_inicial < 600) {
				aux = sal_inicial * 15/100;
			} else {
				aux = sal_inicial * 5/100;
			}
			sal_final = sal_inicial + aux;
			System.out.println(codigo);
			System.out.println(nht);
			System.out.println(valor);
			System.out.println(sal_inicial);
			System.out.println(aux);
			System.out.println(sal_final);
		}
	}

}