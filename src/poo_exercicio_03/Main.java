package poo_exercicio_03;

import java.util.Scanner;

/*
 * Crie uma classe para representar uma BombaCombustivel. 
 * A classe BombaCombustivel deve conter os seguintes atributos: 
 * tipo de combustível, valor por litro e quantidade de combustível. 
 * Além desses atributos a classe deve conter os seguintes métodos.
 * a. abastecerPorValor; //método onde é informado o valor a ser abastecido 
 * e mostra a quantidade de litros que foi colocada no veículo
 * b. abastecerPorLitro; // método onde é informado a quantidade em litros 
 * de combustível e mostra o valor a ser pago pelo cliente.
 * c. alterarValor; //altera o valor do litro do combustível.
 * d. alterarCombustivel; //altera o tipo do combustível.
 * e. alterarQuantidadeCombustivel; //altera a quantidade de combustível 
 * restante na bomba.
 * Crie uma classe que contenha um método main 
 * para testar sua classe BombaCombustível
 */

public class Main {

	public static void main(String[] args) {
		
		int opcao = 0;
		int tipo = 0;
		Scanner input = new Scanner(System.in);
		BombaCombustivel bomba = new BombaCombustivel(0, 0, 0);
		
		System.out.println("POSTO LÉO");
		do {
			System.out.println("\nO que deseja?\n"
					+ "1 - Carregar Bombas\n"
					+ "2 - Selecionar tipo de Combustível\n"
					+ "3 - Abastecer por Valor\n"
					+ "4 - Abastecer por Litro\n"
					+ "5 - Alterar Preço/Litro\n"
					+ "6 - Alterar Quantidade disponível\n"
					+ "0 - Sair");
			System.out.print("Informe a opção desejada: ");
			opcao = input.nextInt();
			tipo = bomba.alterarCombustivel();
			
			switch (opcao) {
			case 1:
				bomba.carregarBombas(input.nextInt());
				break;
			case 2:
				bomba.alterarCombustivel();
				break;
			case 3:
				bomba.abastecerPorValor(input.nextInt());
				break;
			case 4:
				bomba.abastecerPorLitro(input.nextInt());
				break;
			case 5:
				bomba.alterarValor(input.nextInt());
				break;
			case 6:
				bomba.alterarQuantidadeCombustivel(input.nextInt());
				break;
			case 0:
				System.out.println("Saindo...");
				break;
			default:
				System.out.println("Entrada inválida.");
				break;
			}
		} while (opcao != 0);
		input.close();
	}
}
