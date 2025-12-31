class teste {
	public static void main(String... args){	
		byte meuByte = 0; //range: -128 a 127
		short meuShort = 32767; //range: -32.768 a 32.767
		int meuInt = 2;
		long meuLong = 3_314_748_3647L;
		float meuFloat = 1.5F;
        double meuDouble = 250.5565;
        char meuChar = 'a';
        boolean meuBoolean = true;
		System.out.println(meuBoolean);
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
