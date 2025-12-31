class Produto {
	// atributos (propriedades)
	
	// construtores (criação do objeto)
	
	// métodos (comportamentos)
	
}

class Pessoa {
	String corDeOlho;
	int altura;
	int peso;
	
	public Pessoa(){
	}
	
	public Pessoa(String corDeOlho){
		super();
		System.out.println(corDeOlho);
		System.out.println(corDeOlho);
		corDeOlho = corDeOlho;
		System.out.println(corDeOlho);
		System.out.println(corDeOlho);
	}
	
	void andar(){
		System.out.println("Andar default");
	}
	
	
	void andar(String velocidade){
		if("rapido".equalsIgnoreCase(velocidade)){
			System.out.println("Andar rápido");
		} else {
			System.out.println("Andar");
		}
	}
	
	void descansar(){
		System.out.println("Andar");
	}
}

class teste {
	
	public static void main(String... args){
		Pessoa pessoa = new Pessoa();
		Pessoa pessoa2 = new Pessoa("azul");
		System.out.println(pessoa2.corDeOlho);
	
		
		
	}
}

		
