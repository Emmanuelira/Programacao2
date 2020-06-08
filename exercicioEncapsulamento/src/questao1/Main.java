package questao1;

import java.util.Arrays;
import java.util.*;

import questao1.Musica.Genero;

public class Main {

	public static void main(String[] args) {
		
		Musica m1 = new Musica ("maranata", "ministerio avivah", Musica.Genero.FOLK, 2015, 5, 0);
		Spotify s1 = new Spotify();
		Musica m2 = new Musica("pra sempre", "ministerio avivah", Musica.Genero.FOLK, 2015, 5, 0);
		
		
		s1.addMusica(m1);
		System.out.println(Arrays.toString(s1.getMusicas()));
		System.out.println(s1.posicao);
		
		s1.addMusica(m2);
		System.out.println(Arrays.toString(s1.getMusicas()));
		System.out.println(s1.posicao);
		
//		s1.removerMusica(m1.getNome());
//		System.out.println(Arrays.toString(s1.getMusicas()));
//		System.out.println(s1.posicao);
		
		System.out.println(s1.musGenero(Genero.FOLK));
		

		
	}

}
