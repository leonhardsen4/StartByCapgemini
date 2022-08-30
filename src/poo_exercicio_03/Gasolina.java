package poo_exercicio_03;

public class Gasolina {
	
	private float valorLitro = 0.0f;
	private float qtdCombustivel = 0.0f;
	
	public Gasolina(float valorLitro, float qtdCombustivel) {
		this.valorLitro = valorLitro;
		this.qtdCombustivel = qtdCombustivel;
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
