package Main;

import Class.Artigo;
import Class.Autor;
import Class.ModeloBrasileiro;
import Class.ModeloInternacional;
import Exception.AnoInvalidoException;
import Interface.EstrategiaCitacao;

public class Main {

	public static void main(String[] args) throws IllegalArgumentException,
	AnoInvalidoException {
		
//		Autor autor = new Autor("Eduardo", "Lucena", "Falcão");
//		
//		try {
//			Artigo artigo = new Artigo(autor, 2020, "Programação Orientada a Objetos");
//			EstrategiaCitacao e1 = new ModeloInternacional();
//			EstrategiaCitacao e2 = new ModeloBrasileiro();	
//			System.out.println(e1.getCitacao(artigo));
//			System.out.println(e2.getCitacao(artigo));
//		} catch(AnoInvalidoException exc1) {
//			exc1.getMessage();
//		} catch(IllegalArgumentException exc2) {
//			exc2.printStackTrace();
//		}		
	
		Autor autor2 = new Autor("lucas", "LOPES", "LeAl");
		
		try {
			Artigo artigo1 = new Artigo(autor2, 2015, "Concreto armado e suas funcionalidades");
			EstrategiaCitacao e1 = new ModeloInternacional();
			EstrategiaCitacao e2 = new ModeloBrasileiro();	
//			System.out.println(e1.getCitacao(artigo1));
			System.out.println(e2.getCitacao(artigo1));
			
			System.out.println(e2.getCitacao(artigo1).equals("LUCAS L. LEAL, 2015, Concreto armado e suas funcionalidades."));
			
			
		} catch(AnoInvalidoException exc1) {
			exc1.getMessage();
		} catch(IllegalArgumentException exc2) {
			exc2.printStackTrace();
		}		
		
		
		
		
	}

}
