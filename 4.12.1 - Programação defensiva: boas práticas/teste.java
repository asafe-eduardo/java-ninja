//imutabilidade
class Produto {
	private final String nome;
	
	public Produto(String nome){
		// adicionar validacoes de entrada
		this.nome = nome;
	}
	
	public String getNome(){
		return this.nome;
	}
}

//imutabilidade
enum Status {
	ATIVO, BLOQUEADO, INATIVO
}


class teste {	
	
	// principio do fail fast
	// se anteve a algum estado inesperado 
	static void criarPedido(String clientId, int quantidade){
		// validacao de entrada
		if(clientId != null && clientId.length() <= 0){
			throw new IllegalArgumentException("O id não pode ser nulo ou vazio");
		} 
		if(quantidade <= 0){
						throw new IllegalArgumentException("A quantidade não pode ser 0");
		}
		
		Integer idCliente = Integer.parseInt(clientId);
		// segue fluxo normal do método
	}
	
	public static void main(String... args) { 
		criarPedido("10", 10);
		
		Produto p = new Produto("Shampoo");
		
		System.out.println(Status.ATIVO);
		
		
	}
}
		
