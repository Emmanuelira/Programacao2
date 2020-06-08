package questao2;

public class Main {

	public static void main(String[] args) {
		
		Imovel caso1 = new Imovel("Imobiliaria Falcão", 3,
				1, 2, 120, false, true, false);
		
		Imovel caso2 = new Imovel("Imobiliaria Falcão", 16, 
				8, 3, 2, 3, 82, true, false, false);
		
		Imovel caso3 = new Imovel("Imobiliária Altaman", 4, 2,
				3, 240, true, true, true);
		
		Imovel caso4 = new Imovel("Imobiliária Leblon", 6, 3, 
				5, 540, true, true, true);
		
		Imovel caso5 = new Imovel("Imobiliária Alto Branco", 4,
				2, 2, 1, 2, 60, false, false, false);
		
		System.out.println(caso1 + "\n");
		System.out.println(caso2 + "\n");
		System.out.println(caso3 + "\n");
		System.out.println(caso4 + "\n");
		System.out.println(caso5);
		
	}

}
