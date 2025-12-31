import java.util.ServiceLoader;

class teste {
	
	public static void main(String... args) {
		ServiceLoader<PagamentoProvider> loader = ServiceLoader.load(PagamentoProvider.class);
		
		for(PagamentoProvider p : loader){
			System.out.println("Provider encontrado: " + p.nome());
		}

	}
}
		
