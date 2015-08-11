package restaurante;

import java.util.ArrayList;
import java.util.Scanner;

public class SistemaX {

	public static void main (String[] args) {
		
		ArrayList<Restaurante> variosRestaurantes = new ArrayList<Restaurante>();
		
		Restaurante r = new Restaurante("Chapa quente", 
				"contato@chapaquente.com.br", false);
		
		System.out.println("Olá, tudo bem ? ");
		System.out.println("Bem vindo ao SistemaX");

		System.out.println("O restaurante " + r.nome 
				+ " está " + ((r.aberto) ? "aberto" : "fechado"));
		System.out.println("Temos " + r.produtos.size() + " produtos.");
		
		//inicia o scanner
		Scanner scanner = new Scanner(System.in);
		
		String continuar = "s";
		
		while (continuar.equalsIgnoreCase("s")) {
			//recebe os valores do console
			System.out.println("Digite o nome do Produto :");	
			String nomeDoProduto = scanner.next();
			scanner.reset();
			System.out.println("Digite o valor do Produto :");
			double valorDoProduto = scanner.nextDouble();
			scanner.reset();
			
			Produto produto = new Produto(nomeDoProduto, valorDoProduto);
			r.produtos.add(produto);
			
			System.out.println("Digite 's' para continuar a incluir Produtos.");
			continuar = scanner.next();
			scanner.reset();
		}
		
		System.out.println("\n -------------------- ");
		System.out.println("  LISTA DE PRODUTOS ");
		System.out.println(" -------------------- ");
		for (Produto p : r.produtos) {
			System.out.println(p.nome + ": " + p.valor);
		}		
		System.out.println(" -------------------- \n");
				
		
	}
	
}
