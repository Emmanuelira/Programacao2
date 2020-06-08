package questao2;

public class Imovel {
	
	String tipo, imobiliaria;
	int pavimentos, pavimento, quartos, suites, banheiros, metrosQuadrados;
	boolean elevador, piscina, quadra;
	
	public Imovel(String imobiliaria, int quartos, int suites, int banheiros,
			int metrosQuadrados, boolean elevador, boolean piscina, boolean quadra) {
		
		this.imobiliaria = imobiliaria;
		this.quartos = quartos;
		this.suites = suites;
		this.banheiros = banheiros;
		this.metrosQuadrados = metrosQuadrados;
		this.elevador = elevador;
		this.piscina = piscina;
		this.quadra = quadra;
		this.tipo = "Casa";
	}
	
	public Imovel(String imobiliaria, int pavimentos, int pavimento,
			int quartos, int suites, int banheiros,
			int metrosQuadrados, boolean elevador, 
			boolean piscina, boolean quadra) {
		
		this(imobiliaria, quartos, suites, banheiros, metrosQuadrados, elevador, 
				piscina, quadra);
		
		this.pavimentos = pavimentos;
		this.pavimento = pavimento;
		this.tipo = "Apartamento";
	}

	public double calculaPreco() {
		
		double preco = 0;
		
		if (tipo == "Casa") {
			
			preco += 5000*metrosQuadrados;
			
		} else {
			
			preco = 5000*metrosQuadrados;
			int contador = 0;
			while(contador <= pavimento) {
				if(contador >= 6) {
					preco += 2000;
				}
				
				++contador;
			}
			
		}
		
		if(elevador) {
			preco += 2500;
		}
		
		if(piscina) {
			preco += 2500;
		}
		
		if(quadra) {
			preco += 2500;
		}
		
		return preco;
	}

	@Override
	public String toString() {
		
		String imprime = "";
		
		imprime += "Tipo: " + tipo;
		imprime += "\nImobiliária: " + imobiliaria;
		imprime += "\nNumero de quartos: " + quartos;
		imprime += "\nNumero de suites: " + suites;
		imprime += "\nNumero de banheiros: " + banheiros;
		imprime += "\nArea em metros quadrados: " + metrosQuadrados;
		imprime += "\nElevador: " + elevador;
		imprime += "\nPiscina: " + piscina;
		imprime += "\nQuadra: " + quadra;
		imprime += "\nPreço: " + calculaPreco();
		
		if(tipo == "Apartamento") {
			imprime += "\nNúmero de pavimentos: " + pavimentos;
			imprime += "\nPavimento: " + pavimento;			
		}
		
		return imprime;
		 
	}















}
