class teste {

	public static boolean recuperaSituacaoB(){
		System.out.println("Recuperando situacao B");
		return false;
	}
	
	public static boolean recuperaSituacaoA(){
		System.out.println("Recuperando situacao A");
		return false;
	}
	
	public static void main(String... args){	
		System.out.println(recuperaSituacaoA() ^ recuperaSituacaoB());

	}
}

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
