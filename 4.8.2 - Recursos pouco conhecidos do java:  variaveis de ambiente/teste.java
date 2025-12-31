class teste {
	
	public static void main(String... args) throws Exception{
	
		// Variaves de ambiente (externo e global)
		System.out.println(System.getenv("MINHA_VAR_ENV_EDU"));
		
		// Variaveis do sistema via argumentos da JVM (interno da aplicação)
		System.out.println(System.getProperty("java.version"));
	}
}
		
