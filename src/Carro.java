
public class Carro {
	
	String placa;
	int ano;
	String modelo;
	String marca;
	double valor;
	int km = 0;
	
	double consumo = .0;
	
	public void rodar () {
		contaKm(1);
	} 
	
	public void frear () {
		System.out.println("A KM do Fuscão é: " + km);
	}
	
	public void ligar () {
	}

	public void contaKm (int qnt) {
		km = km + qnt;
	}	
	
	public double consumoAtual () {
		return km / consumo;
	}
	
	public double gastoTotal (double valorGasolina) {
		return consumoAtual() * valorGasolina;
	}

	
}
