package tabuada;

import java.util.Scanner;

public class Estudar {
	
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o Pré-Texto: ");
		String preTexto = scanner.next();
		
		scanner.reset();
		
		System.out.println("Digite o número da Tabuada: ");
		int numero = scanner.nextInt();
		
		Tabuada tab = new Tabuada(numero);
		String[] tabuada = tab.resolver();
		
		for (int i = 1; i < tabuada.length; i++) {
			System.out.println(preTexto + " " + tabuada[i]);	
		}
		
		scanner.close();
	}

}
