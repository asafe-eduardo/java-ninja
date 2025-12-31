class teste {
	public static void main(String... args){	
		int x = 10;
		int y = 2;
		int soma = x + y; // + = soma
		int subtracao = x - y; // - = subtracao
		int multiplicacao = x * y; // * - multiplicacao
		int divisao = x / y; // / = divisao
		int resto = x % y; // % = módulo ou resto
		
		System.out.println("Soma: " + soma);
		System.out.println("Subtracao: " + subtracao);
		System.out.println("Multiplicacao: " + multiplicacao);
		System.out.println("Divisao: " + divisao);
		System.out.println("Resto: " + resto);
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
