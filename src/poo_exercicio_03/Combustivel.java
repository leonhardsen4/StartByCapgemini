package poo_exercicio_03;

public class Combustivel {
	
	private int codigo;
	private float qtd;
	private float preco;
	
	public Combustivel(int codigo, float qtd, float preco) {
		this.codigo = codigo;
		this.qtd = qtd;
		this.preco = preco;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public float getQtd() {
		return qtd;
	}

	public void setQtd(float qtd) {
		this.qtd = qtd;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}
		
}
