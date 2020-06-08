import java.util.*;

public class Gmail {
	
	private Email[] emails;
	private int tamanho;
	
	public Gmail () {
		emails = new Email[10];
		tamanho = 0;
	}
	
	public void enviarEmail(Email e) {
		
		if (tamanho >= emails.length) {
			Email[] temp = new Email[tamanho*2];
			for (int i = 0; i < emails.length; i++) {
				temp[i] = emails[i];
			}
			emails = temp;
		}
		emails[tamanho] = e;
		tamanho++;
	}

	public void enviarEmail(String conteudo, String remetente,
			String destinatario, Data envio) {
		Email e = new Email(conteudo, remetente, destinatario, envio);
		enviarEmail(e);
	}

	public int getQuantidadeEmails() {
		return tamanho;
	}
	
	public List<Email> getEmailsRemetente(String remetente) {
		List<Email> resultado = new ArrayList();
		
		for (int i = 0; i < tamanho; i++) {
			if (emails[i].getRemetente().equals(remetente)) {
				resultado.add(emails[i]);
			}	
		}
		
		return resultado;
	}

	public List<Email> getEmailsComPalavra(String palavra) {
		List<Email> resultado = new ArrayList();
		
		for (int i = 0; i < tamanho; i++) {
			if (emails[i].getConteudo().contains(palavra)) {
				resultado.add(emails[i]);
			}	
		}
		return resultado;
	}

	public Email removeEmailMaisAntigo(String remetente) {

		int quant = 0;
		
		for (int i = 0; i < tamanho; i++) {
			if (emails[i].getRemetente() == remetente) {
				quant++;
			}
		}
		
		if (quant == 0) {
			return null;
		} else {
			
			Email[] temp = new Email[quant];
			int ref = 0;
			
			for (int i = 0; i < tamanho; i++) {
				if (emails[i].getRemetente() == remetente) {
					temp[ref] = emails[i];
					ref++;
				}
			}
			
			Email resultado = temp[0]; 
			
			for (int i = 1; i < temp.length; i++) {
				if (temp[i].getEnvio().getAno() < resultado.getEnvio().getAno()) {
					resultado = temp[i];
				} else if (temp[i].getEnvio().getAno() == resultado.getEnvio().getAno()) {
					if (temp[i].getEnvio().getMes() < resultado.getEnvio().getMes()) {
						resultado = temp[i];
					} else if (temp[i].getEnvio().getMes() == resultado.getEnvio().getMes()) {
						if (temp[i].getEnvio().getDia() < resultado.getEnvio().getDia()) {
							resultado = temp[i];
						} else if (temp[i].getEnvio().getDia() == resultado.getEnvio().getDia()) {
							if (temp[i].getEnvio().getHora() < resultado.getEnvio().getHora()) {
								resultado = temp[i];
							}
						}
					}
				}
			}
			
			for (int i = 0; i < tamanho; i++) {
				if (emails[i].equals(resultado)) {
					for (int j = i; j < tamanho - 1; j++) {
						emails[j] = emails[j+1];
						
				}
			}
				
		}
			tamanho--;
			return resultado;
	}








}
}

