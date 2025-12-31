class Aviao {

}

class Automovel {
	public void dirigir(){
		System.out.println("Dirigindo automovel");
	}

}

class Carro extends Automovel {
	public void dirigirCarro(){
		System.out.println("Dirigindo carro");
	}
}

class Moto extends Automovel {
	public void dirigirMoto(){
		System.out.println("Dirigindo carro");
	}
}

class teste {

	public static void main(String... args){
	
		// ==== cast tipos primitivos ====
		// implicito
		byte meuByte = -128;
		int meuInt = 300;
		long meuLong = 10000;
		
		// explicito
		double meuDouble = 100000.58;
		long segundoLong = (long) meuDouble;
		
		// ==== cast objetos ====
		Aviao meuAviao = new Aviao();
		Automovel meuAutomovel = new Automovel();
		Carro meuCarro = new Carro();
		
		//cast implicito
		Automovel meuSegundoAviao = meuCarro;
		
		// cast explicito
		((Moto) meuSegundoAviao).dirigirMoto();
		
	}
}

		/**
			bitwise
		
		bit:   31 ................. 3  2  1  0
		valor: 2³¹ ................. 2³ 2² 2¹ 2⁰


		posição:  7  6  5  4  3  2  1  0
(byte)	bits:     0  0  0  0  0  1  0  1
		potência:128 64 32 16 8  4  2  1
		
		
		**/

/**
contexto de instancia
{

}

contexto estatico
static {

}

**/

/**

Estrutura de uma classe:

class -> palavra reservada para classes e objetos
teste --> nome da minha classe ou objeto
{ } --> abre e fecha chaves -- limite do código

Estrutura de um método:
public --> modificador de acesso
static --> opcional
void --> retorno do método
main --> nome do método
() --> parametros
{} --> abre e fechas chaves -- limite do código

Estrutura de uma váriavel:
public --> modificador de acesso
static --> modificador
byte --> tipo da váriavel
meuByte --> nome da váriavel

**/
