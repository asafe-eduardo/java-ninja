class Cliente {
	private final String nome;
	private final String cpf;
	
	public Cliente(String nome, String cpf){
		this.nome = nome;
		this.cpf = cpf;
	}
	
	public nome(){
		return this.nome;
	}
	
	public cpf(){
		return this.cpf;
	}
}

class teste {

	public record Cliente(String nome, String cpf){
		public Cliente {
			if (nome == null || nome.isBlank()) throw new IllegalArgumentException("nome inválido");
		}
	}
	
	public static void main(String... args) { 
		Cliente c = new Cliente("Eduardo", "123");
		System.out.println(c.nome());
		
	}
}
		
