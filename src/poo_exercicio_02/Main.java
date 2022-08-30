package poo_exercicio_02;

import java.util.Scanner;

/*
 * Crie uma classe para implementar uma ContaCorrente. A classe deve 
 * possuir os seguintes atributos: número da conta, nome do correntista e saldo. 
 * Os métodos são os seguintes: alterarNome, depósito e saque; 
 * No construtor, saldo é opcional, com valor default zero e os demais atributos 
 * são obrigatórios.
 */

public class Main {

	public static void main(String[] args) {

		int opcao = 0;
		ContaCorrente contaCorrente = new ContaCorrente(null, null, 0.0f);
		Scanner input = new Scanner(System.in);
		
		System.out.println("BEM VINDO AO BANCO LÉO");
		
		do {
			System.out.println("\nOPÇÕES");
			System.out.println("1 - Alterar nome\n"
					+ "2 - Alterar conta\n"
					+ "3 - Depósito\n"
					+ "4 - Saque\n"
					+ "5 - Informações\n"
					+ "0 - Sair\n");
			try {
				System.out.print("Informe a opção desejada: ");
				opcao = input.nextInt();
				if (opcao == 1) {
					System.out.print("Digite o nome do cliente: ");
					contaCorrente.alterarNome(input.next());
				} else if (opcao == 2) {
					System.out.print("Digite o número da conta: ");
					contaCorrente.setConta(input.next());
				} else if (opcao == 3) {
					System.out.print("Digite o valor do depósito: ");
					contaCorrente.deposito(input.nextFloat());
				} else if (opcao == 4){
					System.out.print("Digite o valor do saque: ");
					contaCorrente.saque(input.nextFloat());
				} else if (opcao == 5) {
					contaCorrente.imprimirDados();
				}
			} catch (Exception e) {
				System.err.println(e);
			}
		} while (opcao != 0);
		System.out.println("Obrigado e até breve!");
		input.close();
	}
}
