package questao3;

import java.util.Date;
import java.util.GregorianCalendar;

public class Data {
	public static final long MILISECONDS_PER_DAY = 60 * 60 * 24 * 1000;
	private int dia;
	private int mes;
	private int ano;

	public Data(int dia, int mes, int ano) throws DataInvalidaException{
		
		if (mes == 2) {
			if (isBissexto(ano)) {
				if (dia < 1 || dia > 29) {
					throw new DataInvalidaException();
				}
			} else if (dia < 1 || dia > 28) {
				throw new DataInvalidaException();
			}

		} else if ((temTrintaDias(mes) && (dia < 1 || dia > 30)) || 
				(!temTrintaDias(mes) && (dia < 1 || dia > 31))) {
			throw new DataInvalidaException();
		}
		
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	public long getQuantidadeDeDias() {
		Date data = new Date(new GregorianCalendar(ano, mes - 1, dia).getTimeInMillis());
		Date agora = new Date();
		return (data.getTime() - agora.getTime()) / MILISECONDS_PER_DAY;
	}

	private boolean isBissexto(int ano) {
		return (ano % 400 == 0) || ((ano % 4 == 0) && (ano % 100 != 0));
	}

	private boolean temTrintaDias(int mes) {
		return mes == 4 || mes == 6 || mes == 9 || mes == 11;
	}
}