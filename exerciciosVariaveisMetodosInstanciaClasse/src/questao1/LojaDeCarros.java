package questao1;

public class LojaDeCarros {

	public static void main(String[] args) {
		
		Carro.promocao = true;
		
		Carro caso1 = new Carro("Pálio", "Fiat", 35000);
		Carro caso2 = new Carro("Pálio", "Fiat", 35000);
		Carro caso3 = new Carro("Civic", "Honda", 110000);
		Carro caso4 = new Carro("Corolla", "Toyota", 110000);
		Carro caso5 = new Carro();
		
		caso1.calculaPreco();
		
		caso2.cor = "Prateada";
		
		caso3.portas = 4;
		caso3.vidroEletrico = true;
		caso3.arCondicionado = true;
		caso3.cambioAutomatico = true;
		caso3.direcaoEletrica = true;
		
		caso4.vidroEletrico = true;
		caso4.direcaoEletrica = true;
		caso4.arCondicionado = true;
		
		caso5.nome = "Gol";
		caso5.marca = "Volkswagen";
		caso5.portas = 4;
		caso5.vidroEletrico = true;
		caso5.arCondicionado = true;
		caso5.cambioAutomatico = true;
		caso5.direcaoEletrica = true;
		caso5.precoBase = 55000;
		
		System.out.println(caso1);
		System.out.println("\n" + caso2);
		System.out.println("\n" + caso3);
		System.out.println("\n" + caso4);
		System.out.println("\n" + caso5);
		
	}

}
