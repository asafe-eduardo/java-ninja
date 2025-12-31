class Automovel {

	protected String estritamentePrivado;

	void acelerar(){
		System.out.println("Acelerou de 0 a 40km !!");
	}
}

class Veiculo {

}

class Carro extends Automovel {

	@Override
	void acelerar(){
		System.out.println("desacelerou!!");
	}

	void abrirPortaMalas(){
		estritamentePrivado = "";
		System.out.println("Abriu o porta malas!!!");
	}
}

class teste {
	
	public static void main(String... args){
		new Carro().acelerar();
		new Carro().abrirPortaMalas();
		System.out.println(new Carro().toString());
	}
}
		
