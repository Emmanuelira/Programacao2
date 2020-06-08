package questao7;

import java.util.Scanner;

public class DisparaAlarme {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite a hora do alarme: ");
		int hora = teclado.nextInt();
		System.out.print("Digite o minuto do alarme: ");
		int minuto = teclado.nextInt();
		Alarme alarme;
		
		try {
			try {
				alarme = new Alarme(hora, minuto);
				while (!alarme.isAgora()) {
					System.out.print(".");
					Thread.sleep(1000);
				}
				System.out.println();
				System.out.println("Alarme disparado");
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		} catch (HoraInvalidaException eh) {
			System.out.println(eh.getMessage());
		} catch (MinutoInvalidoException em) {
			System.out.println(em.getMessage());			
		} finally {
			teclado.close();
		}

	}
}

