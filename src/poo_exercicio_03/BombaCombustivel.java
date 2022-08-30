package poo_exercicio_03;

import java.util.Scanner;

public class BombaCombustivel {
	
	private int tipoCombustivel;
	private float valorLitro;
	private float qtdCombustivel;
	Gasolina gasolina = new Gasolina(4.50f, 100.0f);
	
	public BombaCombustivel(int tipoCombustivel, float valorLitro, float qtdCombustivel) {
		this.tipoCombustivel = tipoCombustivel;
		this.valorLitro = valorLitro;
		this.qtdCombustivel = qtdCombustivel;
	}
	
	public void abastecerPorValor(int tipo, float valor) {
		Scanner input = new Scanner(System.in);
		System.out.print("Tipo de combustível\n"
				+ "1 - Gasolina\n"
				+ "2 - Etanol\n"
				+ "3 - Diesel\n");
		System.out.print("Informe o tipo desejado: ");
		tipo = input.nextInt();
		System.out.print("Informe o valor que deseja abastecer: ");
		valor = input.nextFloat();
		switch (tipo) {
		case 1:
			this.setQtdCombustivel(valor / gasolina.getValorLitro());
			System.out.printf("Quantidade de Combustível Abastecido: %.2f", this.getQtdCombustivel());
			break;
		}
		
	}
	
	
	public float abastecerPorLitro() {
		return qtdCombustivel;	
	}
	
	public void alterarValor(float valor) {
		this.setValorLitro(valor);
	}
	
	public void alterarCombustivel(int tipo) {
		this.setTipoCombustivel(tipo);
	}
	
	public void alterarQuantidadeCombustivel(float qtd) {
		this.setQtdCombustivel(qtd);
	}
	
	public int getTipoCombustivel() {
		return tipoCombustivel;
	}
	
	public void setTipoCombustivel(int tipoCombustivel) {
		this.tipoCombustivel = tipoCombustivel;
	}

	public float getValorLitro() {
		return valorLitro;
	}

	public void setValorLitro(float valorLitro) {
		this.valorLitro = valorLitro;
	}

	public float getQtdCombustivel() {
		return qtdCombustivel;
	}

	public void setQtdCombustivel(float qtdCombustivel) {
		this.qtdCombustivel = qtdCombustivel;
	}
	
}
