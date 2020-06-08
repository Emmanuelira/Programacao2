package questao1;

public class Musica {
	
	public enum Genero {SAMBA, PAGODE, FOLK, ROCK, FORRO, MPB}
	
	private String nome, artista;
	private Genero genero;
	private int ano, duracao, vezesRepetida;
	
	public Musica (String nome, String artista, Genero genero, int ano,
			int duracao, int vezesRepetida) {
		this.nome = nome;
		this.artista = artista;
		this.genero = genero;
		this.ano = ano;
		this.duracao = duracao;
		this.vezesRepetida = vezesRepetida;
	}
	
	public String getNome() {
		return nome;
	}

	public String getArtista() {
		return artista;
	}
	
	public Genero getGenero() {
		return genero;
	}
	
	public int getAno() {
		return ano;
	}

	public int getDuracao() {
		return duracao;
	}
	
	public int getVezesRepetida() {
		return vezesRepetida;
	}
	
	
	

}
