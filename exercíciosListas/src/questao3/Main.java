package questao3;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		Carro carro1 = new Carro("Pálio", "Fiat", 35000);
		Carro carro2 = new Carro("Pálio", "Fiat", 35000);
		Carro carro3 = new Carro("Civic", "Honda", 110000);
		Carro carro4 = new Carro("Corolla", "Toyota", 110000);
		Carro carro5 = new Carro();
		
		carro2.cor = "Prateada";
		
		carro3.portas = 4;
		carro3.vidroEletrico = true;
		carro3.arCondicionado = true;
		carro3.cambioAutomatico = true;
		carro3.direcaoEletrica = true;
		
		carro4.vidroEletrico = true;
		carro4.direcaoEletrica = true;
		carro4.arCondicionado = true;
		
		carro5.nome = "Gol";
		carro5.marca = "Volkswagen";
		carro5.portas = 4;
		carro5.vidroEletrico = true;
		carro5.arCondicionado = true;
		carro5.cambioAutomatico = true;
		carro5.direcaoEletrica = true;
		carro5.precoBase = 55000;
		
		LojaDeCarros loja = new LojaDeCarros();
		loja.adicionarCarro(carro1);
		loja.adicionarCarro(carro2);
		loja.adicionarCarro(carro3);
		loja.adicionarCarro(carro4);
		loja.adicionarCarro(carro5);
		
//		System.out.println(carro3);
//		loja.adicionarPromocao(carro3.id);
//		System.out.println(carro3);
//		
//		loja.venderCarro(carro3.id);
//		loja.venderCarro(carro4.id);
//		System.out.println(loja.carrosVendidos);
//		System.out.println(carro3.calculaPreco());
//		System.out.println(carro4.calculaPreco());
//		loja.exibirCarrosDisponiveis();
//		
//		System.out.println(loja.computaApuradoDasVendas());
//		loja.limparVendidos();
//		System.out.println(loja.carrosVendidos);
		
	}

}
