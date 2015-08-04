package tabuada;

public class Tabuada {
	
	int numero;
	
	public Tabuada (int numero) {
		this.numero = numero;
	}
	
	public String[] resolver () {
		
		String[] tabuada = new String[11];
		
		for (int i = 1; i <= 10; i++) {
			double res = this.numero * i;
			tabuada[i]= this.numero + " x " + i + " = " + res;
		}
		
		return tabuada;
	} 

}
