package restaurante;

import java.util.ArrayList;

public class Restaurante {

	String nome;
	String cnpj;
	String telefone;
	String email;
	String proprietario;	
	
	boolean aberto;
	
	ArrayList<Produto> produtos = new ArrayList<Produto>();

	public Restaurante(String nome, String email, 
			boolean aberto) {
		this.nome = nome;
		this.email = email;
		this.aberto = aberto;
	}
	
	
}
