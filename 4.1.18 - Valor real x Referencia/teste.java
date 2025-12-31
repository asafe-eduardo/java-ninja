class Carro {
	public String modelo;
	
	public Carro(String modelo){
		this.modelo = modelo;
	}

}

class teste {
	
	public static void main(String... args){
		int x = 0;
		int y = x;
		Carro bmw = new Carro("Bmw");
		Carro meuCarro2 = bmw;
		
		System.out.println(x);
		System.out.println(y);
		
		y = 20;
		
		System.out.println(x);
		System.out.println(y);

		System.out.println(bmw);
		System.out.println(meuCarro2);
		System.out.println(bmw.modelo);
		
		meuCarro2.modelo = "Audi";
		System.out.println(bmw);
		System.out.println(meuCarro2);
		System.out.println(bmw.modelo);
		
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
