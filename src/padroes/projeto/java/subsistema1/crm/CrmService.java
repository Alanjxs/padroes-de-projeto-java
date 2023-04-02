package padroes.projeto.java.subsistema1.crm;

public class CrmService {
	
	private CrmService() {
		super();
	}
	
	public static void gravarCliente(String nome, String cep, String cid, String est) {
		System.out.println("Cliente salvo no sistema de CRM");
		System.out.println(nome);
		System.out.println(cid);
		System.out.println(cep);
		System.out.println(est);
		
	}

}
