abstract class Automovel {
	abstract void som();
}

class Carro extends Automovel {
	
	void som(){
		System.out.println("VRUUUUUUUUU");
	}
}

class teste {
	
	public static void main(String... args){
		Automovel automovel = new Carro();
		automovel.som();
	}
}

/**

final
static
abstract
synchronized
volatile
transient
native
strictfp
sealed/non-sealed

**/
		
