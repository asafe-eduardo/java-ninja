class teste {	
	
	public static void main(String... args) { 
		try { // codigo que pode dar erro
			int x = Integer.parseInt("abc");
			System.out.println(x);
		} catch(NumberFormatException | IllegalStateException e ) { // tratamento de erro
			throw new RuntimeException("Erro de calculo", e);
		}  finally { //opcional - fechamento de conexões, execucoes pos try
			System.out.println("finally: sempre executa (limpeza, logs, fecha conexoes ou pools e etc...");
		}
	}
}
		
