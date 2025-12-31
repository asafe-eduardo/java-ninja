public class PixProvider implements PagamentoProvider {
	public String nome() { 
		return "PIX";
	}
	
	public boolean suporta(String metodo) {
		return "pix".equalsIgnoreCase(metodo);
	}

}
