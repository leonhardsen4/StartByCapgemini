package poo_exercicio_01;

import java.text.ParseException;
import java.util.Scanner;
/*
 * Crie uma classe para representar uma Pessoa com os atributos privados 
 * de nome, data de nascimento e altura. Crie os métodos públicos necessários 
 * para getters e setters e também um método para imprimir todos dados de uma 
 * pessoa. Crie um método para calcular a idade da pessoa.
 */
public class Main {

	public static void main(String[] args) throws ParseException{
		
		Pessoa pessoa = new Pessoa(null, null, 0.0f);
		Scanner input = new Scanner(System.in);
		
		System.out.print("Nome: ");
		pessoa.setNome(input.nextLine());
		System.out.print("Data de Nascimento: ");
		pessoa.setDataNascimento(input.next());
		System.out.print("Altura: ");
		pessoa.setAltura(input.nextFloat());
		input.close();
		
		pessoa.imprimir();
	
		int idade = pessoa.calcularIdade(pessoa.formataData(pessoa.getDataNascimento()));
		System.out.println("Idade: " + idade + " anos");
	}

}
