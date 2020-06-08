package questao3;

public class CampeonatoFutebol {

	String[] times;
	
	public void adicionarTimes(String times) {
		
		this.times = times.split(" ");
		
	}
	
	public String[] criarCampeonato() {
		
		int quantJogos = (times.length*(times.length-1))/2;
		String[] jogos = new String[quantJogos];
		int indice = 0;
		for (int ref = 0; ref < times.length -1; ref++) {
			for(int seq = ref+1; seq < times.length; seq++) {
				jogos[indice] = times[ref] + " x " + times[seq];
				indice++;
			}
		}
		return jogos;
	}

}
