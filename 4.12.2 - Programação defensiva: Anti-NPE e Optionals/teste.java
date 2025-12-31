import java.util.*;

class Cidade {
	String nome;
}

class Endereco {
	Cidade cidade;
}

class Cliente {
	final Endereco endereco;
	
	public Cliente(Endereco endereco){
		if(endereco == null) throw new IllegalArgumentException("Endereço não pode ser nulo");
		this.endereco = endereco;
	}
	
}

/**
	OPTIONAL: 
		- utilizar em métodos de busca e retornos que podem ser nulos
		- metodos que podem ser vazios dentro das services
		
	NAO USAR OPTIONAL:
		- em entidades e dtos devido serializacao
		- não é uma bala de prata para pessimos design de classes

**/

class teste {	
	
	public static void main(String... args) { 
	
	/*
		Endereco endereco = new Endereco;
		Cidade cidade = new Cidade();
		
		cidade.nome = "Uberlandia";
		endereco.cidade = null;
		Cliente cliente = new Cliente(endereco);
		
		System.out.println(cliente.endereco.cidade.nome);
	*/
	
		Optional<String> nome = Optional.of("    edu       ");

		String out = nome
			.map(String::trim)
			.filter(s -> s.length() > 10)
			.map(String::toUpperCase)
			.orElse("SEM_NOME");
		
		System.out.println(out);

	}
}
		
