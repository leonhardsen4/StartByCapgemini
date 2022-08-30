package poo_exercicio_01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Pessoa {

	private String nome;
	private String dataNascimento;
	private float altura;
	
	public Pessoa(String nome, String dataNascimento, float altura) {
		this.setNome(nome);
		this.setDataNascimento(dataNascimento);
		this.setAltura(altura);
	}
	
	public void imprimir() {
		System.out.println("\nDADOS DA PESSOA");
		System.out.println("Nome: " + this.nome);
		System.out.println("Data de Nascimento: " + this.dataNascimento);
		System.out.println("Altura: " + this.altura + "m");
	}
	
	public int calcularIdade(Date dataNasc) {
		Calendar dataNascimento = Calendar.getInstance();
		Calendar hoje = Calendar.getInstance();
		dataNascimento.setTime(dataNasc);
		int idade = hoje.get(Calendar.YEAR) - dataNascimento.get(Calendar.YEAR);
		if (hoje.get(Calendar.MONTH) < dataNascimento.get(Calendar.MONTH)) {
			idade--;
		} else {
			if (hoje.get(Calendar.MONTH) == dataNascimento.get(Calendar.MONTH)) {
				idade--;
			}
		}
		return idade;
	}
	
	public Date formataData(String dataNascimento) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date data = sdf.parse(this.getDataNascimento());
		return data;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}
	
}
