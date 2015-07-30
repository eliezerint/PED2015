import java.util.Objects;


public class FabricaDeCarros {

	public static void main (String[] args) {
		
		//Tipo variável operador instanciação
		Carro fusca = new Carro();
		fusca.ano = 1976;
		fusca.km = 100000;
		fusca.marca = "VW";
		fusca.valor = 1500.0;
		fusca.placa = "BBB-0000";
		fusca.consumo = 9;

		fusca.ligar();
		fusca.frear();
		fusca.rodar();
		fusca.frear();
		
//		double consumoAteHoje = fusca.km / fusca.consumo;
		fusca.mostraConsumo();
		
		Carro camaro = null;
//		camaro.mostraConsumo();
		
		if (camaro != null) {
			System.out.println("");
		} else {
			System.out.println("Variável nula !");
		}
		
		Objects.requireNonNull(camaro);
		
		
	}
	
}
