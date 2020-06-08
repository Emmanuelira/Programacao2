package questao1;
import java.util.*;
import questao1.Musica.Genero;

public class Spotify {
	
	private Musica[] musicas;
	int posicao;
	
	public Spotify () {
		musicas = new Musica[10];
		posicao = 0;
	}
	
	public Musica[] getMusicas () {
		return musicas;
	}
	
	public Spotify (int tamanho) {
		musicas = new Musica[tamanho];
		posicao = 0;
	}
	
	public void addMusica (Musica musica) {
		musicas[posicao] = musica;
		posicao++;
	}
	
	public int quantMusicas () {
		return posicao;
	}
	
	public void removerMusica (String nome) {
		for (int i = 0; i < posicao; i++) {
			if (musicas[i].getNome() == nome) {
				for (int ref = i; ref < posicao - 1; ref++) {
					musicas[ref] = musicas[ref+1];
				}
			}
		}
		posicao--;
		musicas[posicao] = null;
	}
	
	public List musArtist(String artista) {
		List<Musica> resultado = new ArrayList<Musica>();
		for(int i = 0; i < posicao; i++) {
			if (musicas[i].getArtista() == artista) {
				resultado.add(musicas[i]);
			}
		}
		return resultado;
	}
	
	public List musGenero (Genero genero) {
		List<Musica> resultado = new ArrayList<Musica>();
		for(int i = 0; i < posicao; i++) {
			if (musicas[i].getGenero() == genero) {
				resultado.add(musicas[i]);
			}
		}
		return resultado;
	}
	
	
	
	
	
	
	
	
	
	

}
