package poo_exercicio_03;

import java.util.Scanner;

public class BombaCombustivel {

	private int tipoCombustivel;
	private float valorLitro;
	private float qtdCombustivel;
	Gasolina gasolina = new Gasolina(1, 0f, 0f);
	Etanol etanol = new Etanol(2, 0f, 0f);
	Diesel diesel = new Diesel(3, 0f, 0f);
	Scanner input = new Scanner(System.in);

	public BombaCombustivel(int tipoCombustivel, float valorLitro, float qtdCombustivel) {
		this.tipoCombustivel = tipoCombustivel;
		this.valorLitro = valorLitro;
		this.qtdCombustivel = qtdCombustivel;
	}

	public void carregarBombas(int tipo) {
			if (tipo == 1) {
				System.out.print("Quantidade: ");
				gasolina.setQtd(input.nextFloat());
				System.out.print("Preço/Litro: ");
				gasolina.setPreco(input.nextFloat());
			} else if (tipo ==2) {
				System.out.print("Quantidade: ");
				etanol.setQtd(input.nextFloat());
				System.out.print("Preço/Litro: ");
				etanol.setPreco(input.nextFloat());
			} else if (tipo == 3) {
				System.out.print("Quantidade: ");
				diesel.setQtd(input.nextFloat());
				System.out.print("Preço/Litro: ");
				diesel.setPreco(input.nextFloat());
			} else if (tipo == 0) {
				System.out.print("Saindo...");
			} else {
				System.out.print("Entrada inválida.");
			}
	}

	public void abastecerPorValor(int tipo) {
		System.out.print("Informe o valor que deseja abastecer: ");
		float valor = input.nextFloat();
		switch (tipo) {
		case 1:
			this.setQtdCombustivel(valor / gasolina.getPreco());
			if ((gasolina.getQtd() - this.getQtdCombustivel()) < 0) {
				System.out.println("Não é possível abastecer");
				System.out.println("Quantidade disponível: " + gasolina.getQtd() + "L");
			} else {
				gasolina.setQtd(gasolina.getQtd() - this.qtdCombustivel);
				System.out.printf("Quantidade de Combustível Abastecido: %.2f", this.getQtdCombustivel());
			}
			break;
		case 2:
			this.setQtdCombustivel(valor / etanol.getPreco());
			if ((etanol.getQtd() - this.getQtdCombustivel()) < 0) {
				System.out.println("Não é possível abastecer");
				System.out.println("Quantidade disponível: " + etanol.getQtd() + "L");
			} else {
				etanol.setQtd(etanol.getQtd() - this.qtdCombustivel);
				System.out.printf("Quantidade de Combustível Abastecido: %.2f", this.getQtdCombustivel());
			}
			break;
		case 3:
			this.setQtdCombustivel(valor / diesel.getPreco());
			if ((diesel.getQtd() - this.getQtdCombustivel()) < 0) {
				System.out.println("Não é possível abastecer");
				System.out.println("Quantidade disponível: " + diesel.getQtd() + "L");
			} else {
				diesel.setQtd(diesel.getQtd() - this.qtdCombustivel);
				System.out.printf("Quantidade de Combustível Abastecido: %.2f", this.getQtdCombustivel());
			}
			break;
		default:
			System.out.println("Entrada inválida.");
			break;
		}
	}

	public void abastecerPorLitro(int tipo) {
		System.out.print("Informe a quantidade que deseja abastecer: ");
		float qtd = input.nextFloat();
		switch (tipo) {
		case 1:
			this.setValorLitro(qtd * gasolina.getPreco());
			if (gasolina.getQtd() - qtd < 0) {
				System.out.println("Não é possível abastecer");
				System.out.println("Quantidade disponível: " + gasolina.getQtd() + "L");
			} else {
				gasolina.setQtd(gasolina.getQtd() - qtd);
				System.out.printf("Valor do Combustível Abastecido: %.2f", this.getValorLitro());
			}
			break;
		case 2:
			this.setValorLitro(qtd * etanol.getPreco());
			if (etanol.getQtd() - qtd < 0) {
				System.out.println("Não é possível abastecer");
				System.out.println("Quantidade disponível: " + etanol.getQtd() + "L");
			} else {
				etanol.setQtd(etanol.getQtd() - qtd);
				System.out.printf("Valor do Combustível Abastecido: %.2f", this.getValorLitro());
			}
			break;
		case 3:
			this.setValorLitro(qtd * diesel.getPreco());
			if (diesel.getQtd() - qtd < 0) {
				System.out.println("Não é possível abastecer");
				System.out.println("Quantidade disponível: " + diesel.getQtd() + "L");
			} else {
				diesel.setQtd(diesel.getQtd() - qtd);
				System.out.printf("Valor do Combustível Abastecido: %.2f", this.getValorLitro());
			}
			break;
		default:
			System.out.println("Entrada inválida.");
			break;
		}
	}

	public void alterarValor(int tipo) {
		switch (tipo) {
		case 1:
			System.out.printf("Valor atual: %.2f", gasolina.getPreco());
			System.out.print("Qual o novo valor? ");
			gasolina.setPreco(input.nextFloat());
			break;
		case 2:
			System.out.printf("Valor atual: %.2f", etanol.getPreco());
			System.out.print("Qual o novo valor? ");
			etanol.setPreco(input.nextFloat());
			break;
		case 3:
			System.out.printf("Valor atual: %.2f", diesel.getPreco());
			System.out.print("Qual o novo valor? ");
			diesel.setPreco(input.nextFloat());
			break;
		default:
			System.out.println("Entrada inválida.");
			break;
		}
	}

	public int alterarCombustivel() {
		System.out.print("\nTipo de combustível\n"
				+ "1 - Gasolina\n"
				+ "2 - Etanol\n"
				+ "3 - Diesel\n");
		System.out.print("Informe o tipo desejado ou zero para sair: ");
		this.setTipoCombustivel(input.nextInt());
		if (this.getTipoCombustivel() != 1 && 
				this.getTipoCombustivel() != 2 && 
				this.getTipoCombustivel() != 3 && 
				this.getTipoCombustivel() !=0) {
			System.out.println("Entrada inválida");
		} else if (this.getTipoCombustivel() == 0) {
			System.out.println("Saindo...");
			this.setTipoCombustivel(this.getTipoCombustivel()+1);
		} else if (this.getTipoCombustivel() == 1) {
			System.out.println("Combustível: Gasolina\n"
					+ "Quantidade: " + gasolina.getQtd() + "\n"
					+ "Preço/Litro: " + gasolina.getPreco() +"\n");
		} else if (this.getTipoCombustivel() == 2) {
			System.out.println("Combustível: Etanol\n"
					+ "Quantidade: " + etanol.getQtd() + "\n"
					+ "Preço/Litro: " + etanol.getPreco() +"\n");
		} else if (this.getTipoCombustivel() == 3) {
			System.out.println("Combustível: Diesel\n"
					+ "Quantidade: " + diesel.getQtd() + "\n"
					+ "Preço/Litro: " + diesel.getPreco() +"\n");
		}
		return this.getTipoCombustivel();
	}

	public void alterarQuantidadeCombustivel(int tipo) {
		switch (tipo) {
		case 1:
			System.out.printf("Quantidade atual: %.2f", gasolina.getQtd());
			System.out.print("Qual a nova quantidade? ");
			gasolina.setQtd(input.nextFloat());
			break;
		case 2:
			System.out.printf("Quantidade atual: %.2f", etanol.getQtd());
			System.out.print("Qual a nova quantidade? ");
			etanol.setQtd(input.nextFloat());
			break;
		case 3:
			System.out.printf("Quantidade atual: %.2f", diesel.getQtd());
			System.out.print("Qual a nova quantidade? ");
			diesel.setQtd(input.nextFloat());
			break;
		default:
			System.out.println("Entrada inválida.");
			break;
		}
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
