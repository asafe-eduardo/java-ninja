import meuPacote.Protegida;

class teste {

	// private - apenas o objeto ou a classe tem acesso
	// - atributos e metodos
	
	// protected - acesso via herança ou no mesmo pacote - 
	// - atributos e metodos
	
	// default ou sem nada - acesso dentro do pacote default 
	// ou também chamado de package-private
	// - classes, atributos e metodos

	// public - acesso geral - classes, atributos e metodos
	
	public static void main(String... args){
		System.out.println(new Protegida().nomeProtegido);
	}
}

		
