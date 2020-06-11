package Tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import Class.Artigo;
import Class.Autor;
import Class.ModeloInternacional;
import Exception.AnoInvalidoException;
import Interface.EstrategiaCitacao;

public class TestModeloInternacional {
	
	Autor a;
	Autor b;
	Artigo art1;
	Artigo art2;
	EstrategiaCitacao e;
	
	@Before
	public void setUp() throws IllegalArgumentException, AnoInvalidoException {
		
		a = new Autor("lucas", "LOPES", "LeAl");
		b = new Autor("otavio", "pereira", "neto");
		art1 = new Artigo(a, 2015, "Concreto armado e suas funcionalidades");
		art2 = new Artigo(b, 2010, "POO para crianças e adolescentes");
		e = new ModeloInternacional();
	}

	@Test
	public void testGetCitacao() {
		
		Assert.assertEquals("LEAL, L.L., Concreto armado e suas funcionalidades, 2015.",
				e.getCitacao(art1));
		
		Assert.assertEquals("NETO, O.P., POO para crianças e adolescentes, 2010.",
				e.getCitacao(art2));
		
	}

}
