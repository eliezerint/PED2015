
public class FabricaDeCarros {

	public static void main (String[] args) {
		
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
		double consumoAteHoje = fusca.consumoAtual();
		
		System.out.println(consumoAteHoje);
		
		System.out.println("O Fuscão já gastou " + consumoAteHoje 
				+ " litros de gasolina (R$ " + fusca.gastoTotal(3.10) + ") =X");
	}
	
}
