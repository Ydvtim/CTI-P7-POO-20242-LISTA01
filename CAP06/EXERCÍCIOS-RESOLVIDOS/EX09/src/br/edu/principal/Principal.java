package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		  	Scanner sr = new Scanner(System.in);
	        
	        int[] voo = new int[12];
	        String[] origem = new String[12];
	        String[] destino = new String[12];
	        int[] lugares = new int[12];
	        int op, op2, num_voo, i;
	        String local;
	        for (i = 0; i < 12; i++) {
	            System.out.println("Digite os dados do voo " + (i + 1) + ":");
	            System.out.print("Número do voo: ");
	            voo[i] = sr.nextInt();
	            System.out.print("Origem: ");
	            origem[i] = sr.nextLine();
	            System.out.print("Destino: ");
	            destino[i] = sr.nextLine();
	            System.out.print("Lugares disponíveis: ");
	            lugares[i] = sr.nextInt();
	        }
	        do {
	            System.out.println("1- Consultar");
	            System.out.println("2- Reservar");
	            System.out.println("3- Finalizar");
	            System.out.print("Digite sua opção: ");
	            op = sr.nextInt();

	            if (op == 1) {
	                System.out.println("1- Consulta por voo");
	                System.out.println("2- Consulta por origem");
	                System.out.println("3- Consulta por destino");
	                System.out.print("Digite sua opção: ");
	                op2 = sr.nextInt();

	                if (op2 == 1) {
	                    System.out.print("Digite o número de voo: ");
	                    num_voo = sr.nextInt();
	                    i = 0;
	                    while (i < 12 && voo[i] != num_voo) {
	                        i++;
	                    }

	                    if (i >= 12) {
	                        System.out.println("Voo inexistente.");
	                    } else {
	                        System.out.println("Número do voo: " + voo[i]);
	                        System.out.println("Local de origem: " + origem[i]);
	                        System.out.println("Local de destino: " + destino[i]);
	                        System.out.println("Lugares disponíveis: " + lugares[i]);
	                    }

	                } else if (op2 == 2) {
	                    System.out.print("Digite o local de origem: ");
	                    local = sr.nextLine();
	                    boolean encontrouOrigem = false;
	                    for (i = 0; i < 12; i++) {
	                        if (local.equals(origem[i])) {
	                            System.out.println("Número do voo: " + voo[i]);
	                            System.out.println("Local de origem: " + origem[i]);
	                            System.out.println("Local de destino: " + destino[i]);
	                            System.out.println("Lugares disponíveis: " + lugares[i]);
	                            encontrouOrigem = true;
	                        }
	                    }
	                    if (!encontrouOrigem) {
	                        System.out.println("Nenhum voo encontrado para a origem: " + local);
	                    }
	                } else if (op2 == 3) {
	                    System.out.print("Digite o local de destino: ");
	                    sr.nextLine();
	                    local = sr.nextLine();
	                    boolean encontrouDestino = false;
	                    for (i = 0; i < 12; i++) {
	                        if (local.equals(destino[i])) {
	                            System.out.println("Número do voo: " + voo[i]);
	                            System.out.println("Local de origem: " + origem[i]);
	                            System.out.println("Local de destino: " + destino[i]);
	                            System.out.println("Lugares disponíveis: " + lugares[i]);
	                            encontrouDestino = true;
	                        }
	                    }
	                    if (!encontrouDestino) {
	                        System.out.println("Nenhum voo encontrado para o destino: " + local);
	                    }
	                }
	            } else if (op == 2) {
	                System.out.print("Digite o número do voo desejado: ");
	                num_voo = sr.nextInt();
	                i = 0;
	                while (i < 12 && voo[i] != num_voo) {
	                    i++;
	                }
	                if (i >= 12) {
	                    System.out.println("Número de voo não encontrado.");
	                } else {
	                    if (lugares[i] == 0) {
	                        System.out.println("Voo lotado.");
	                    } else {
	                        lugares[i]--;
	                        System.out.println("Reserva confirmada!");
	                    }
	                }
	            }
	        } while (op != 3);
	        System.out.println("Sistema finalizado.");
	}
}

