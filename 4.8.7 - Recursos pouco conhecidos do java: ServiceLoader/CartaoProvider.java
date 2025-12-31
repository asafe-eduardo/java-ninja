public class CartaoProvider implements PagamentoProvider {
	public String nome(){
		return "CARTAO";
	}
	
	public boolean suporta(String modelo){
		return "cartao".equalsIgnoreCase(modelo);
	}

}
