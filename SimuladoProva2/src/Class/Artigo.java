package Class;

import Exception.AnoInvalidoException;

public class Artigo {
	
	private Autor autor;
	private int ano;
	private String titulo;
	
	public Artigo(Autor autor, int ano, String titulo) throws AnoInvalidoException,
	IllegalArgumentException{
		
		if(ano > 2020) {
			throw new AnoInvalidoException();
		} else if(titulo.equals("") || titulo.length() > 50) {
			throw new IllegalArgumentException();
		} else {
			this.autor = autor;
			this.ano = ano;
			this.titulo = titulo;
		}
	}

	public Autor getAutor() {
		return autor;
	}

	public int getAno() {
		return ano;
	}

	public String getTitulo() {
		return titulo;
	}	
	
}
