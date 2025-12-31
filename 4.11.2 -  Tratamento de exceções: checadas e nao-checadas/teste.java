import java.io.IOException;

class teste {	

	static void lerArquivo() throws IOException {
		throw new IOException("Falha ao ler arquivo");
	}
	
	static void validarId(int id){
		if(id <= 0) throw new IllegalArgumentException("id deve ser > 0");
	}
	
	public static void main(String... args) { 
	
	/*
		try {
			lerArquivo();
		} catch (IOException e) {
			System.out.println("Exceção tratada : " + e.getMessage());		
		}
	*/
	
	validarId(-1);
		
	}
}
		
