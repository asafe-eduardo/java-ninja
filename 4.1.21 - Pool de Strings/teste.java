class Carro {
	public String modelo;
	
	public Carro(String modelo){
		this.modelo = modelo;
	}
	
	@Override
	public boolean equals(Object o){
		if(this == o) return true;
		if(o instanceof Carro){
			return this.modelo == ((Carro)o).modelo;
		} else {
			return false;
		}
	}

}

class teste {
	
	public static void main(String... args){
		String hello = "Hello";
		
		System.out.println(hello);
		
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
