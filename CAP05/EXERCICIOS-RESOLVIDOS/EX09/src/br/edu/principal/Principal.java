package br.edu.principal;

public class Principal {

	public static void main(String[] args) {
		double cont, n1, n2, media, ta, te, tr, media_classe, total_classe;
		total_classe = 0;
		tr = 0;
		te = 0;
		ta = 0;
		for (cont = 1; cont <= 6; cont++) {
			n1 = 10;
			n2 = 10;
			media = (n1 + n2) / 2;
			System.out.println(media);
			if (media <= 3) {
				tr = tr + 1;
				System.out.println("Reprovado");
			}
			if (media > 3 && media < 7) {
				te = te + 1;
				System.out.println("Exame");
			}
			if (media >= 7) {
				ta = ta + 1;
				System.out.println("Aprovado");
			}
			total_classe = total_classe + media;
		}
		System.out.println(tr);
		System.out.println(te);
		System.out.println(ta);
		media_classe = total_classe / 6;
		System.out.println(media_classe);
	}

}