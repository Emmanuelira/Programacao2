
public class Main {

	public static void main(String[] args) {
		
		Data d1 = new Data ((short) 10,(short) 10, (short) 2020, (short)5 );
		Data d2 = new Data ((short) 10,(short) 10, (short) 2020, (short)4 );
		Data d3 = new Data ((short) 12,(short) 8, (short) 2018, (short)9 );
	
		Email e1 = new Email ("ola, 123", "joao", "diego", d1);
		Email e2 = new Email ("ola, 456", "joao", "diego", d2);
		Email e3 = new Email ("ola, 789", "lucas", "diego", d3);
		
		Gmail g = new Gmail();
		
		g.enviarEmail(e1);
		g.enviarEmail(e2);
		g.enviarEmail(e3);
		
//		System.out.println(g.getQuantidadeEmails());
//		
//		System.out.println(g.getEmailsRemetente("joao"));
//		
//		System.out.println(g.getEmailsRemetente("lucas"));
//		
//		System.out.println(g.getEmailsComPalavra("456"));
//	
//		System.out.println(g.getEmailsComPalavra("ola"));
	
		g.removeEmailMaisAntigo("joao");
		System.out.println(g.getEmailsRemetente("joao"));
		System.out.println(g.getQuantidadeEmails());
	
	
	
	
	
	}

}
