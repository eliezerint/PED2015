package restaurante;

public class Produto {
	
	String nome;
	String marca;
	double valor;
	
	public Produto(String nome, double valor) {
		this.nome = nome;
		this.valor = valor;
	}

	public Produto(String nome, String marca, double valor) {
		this.nome = nome;
		this.marca = marca;
		this.valor = valor;
	}

}
