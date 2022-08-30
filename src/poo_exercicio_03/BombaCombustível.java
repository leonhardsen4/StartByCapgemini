package poo_exercicio_03;

public class BombaCombustível {
	
	private String tipoCombustivel;
	private float valorLitro;
	private float qtdCombustivel;
	
	public BombaCombustível(String tipoCombustivel, float valorLitro, float qtdCombustivel) {
		this.tipoCombustivel = tipoCombustivel;
		this.valorLitro = valorLitro;
		this.qtdCombustivel = qtdCombustivel;
	}

	public String getTipoCombustivel() {
		return tipoCombustivel;
	}

	public void setTipoCombustivel(String tipoCombustivel) {
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
