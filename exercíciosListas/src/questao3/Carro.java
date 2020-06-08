package questao3;
import java.util.Random;

public class Carro {
	
	String nome, marca, cor;
	int id, portas;
	boolean vidroEletrico, arCondicionado,
	cambioAutomatico, direcaoEletrica, promocao;
	double precoBase;
	
	public Carro () {
		Random rand = new Random();
		id = rand.nextInt(999999999);
		nome = "Sem nome";
		marca = "Sem marca";
		cor = "Branco";
		portas = 2;
		vidroEletrico = false;
		arCondicionado = false;
		cambioAutomatico = false;
		direcaoEletrica = false;
		promocao = false;
		precoBase = 0;
	}
	
	public Carro (String nome, String marca, double precoBase) {
		this();
		this.nome = nome;
		this.marca = marca;
		this.precoBase = precoBase;
		
	}
	
	public Carro (String nome, String marca, String cor, int portas,
			boolean vidroEletrico, boolean arCondicionado,
			boolean cambioAutomatico, boolean direcaoEletrica, boolean promocao,
			double precoBase) {
		Random rand = new Random();
		id = rand.nextInt(999999999);
		this.nome = nome;
		this.marca = marca;
		this.cor = cor;
		this.portas = portas;
		this.vidroEletrico = vidroEletrico;
		this.arCondicionado = arCondicionado;
		this.cambioAutomatico = cambioAutomatico;
		this.direcaoEletrica = direcaoEletrica;
		this.promocao = promocao;
		this.precoBase = precoBase;
	}
	
	public double calculaPreco() {
		
		double precoFinal = precoBase;
		
		switch(cor) {
		case "Branco":
		case "Azul":
		case "Vermelho":
		case "Preto":
			break;
		default:
			precoFinal += 1000;			
		}
		
		if (vidroEletrico) {
			precoFinal += 1250;
		}
		
		if (arCondicionado) {
			precoFinal += 1250;
		}
		
		if (cambioAutomatico) {
			precoFinal += 1250;
		}
		
		if (direcaoEletrica) {
			precoFinal += 1250;
		}
		
		if (promocao == true) {
			precoFinal -= .15*precoFinal;
		}
		
		return precoFinal;
	}
	
	@Override
	public String toString(){
		
		String impressao = "";
		impressao += "Id: " + id;
		impressao += "\nNome: " + nome;
		impressao += "\nMarca: " + marca;
		impressao += "\nCor: " + cor;
		impressao += "\nPortas: " + portas;
		impressao += "\nVidro Eletrico: " + vidroEletrico;
		impressao += "\nAr Condicionado: " + arCondicionado;
		impressao += "\nCambio Automatico: " + cambioAutomatico;
		impressao += "\nDirecao Eletrica: " + direcaoEletrica;
		impressao += "\nPreço Base: " + precoBase;
		impressao += "\nPreço Final: " + calculaPreco();
		
		return impressao;
	}


}
