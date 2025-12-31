sealed interface Pagamento permits Pix, Cartao{}

record Pix(String chave) implements Pagamento{}
record Cartao(String numero) implements Pagamento{}

class teste {
	
	public static void main(String... args) { 

		
	}
}
		
