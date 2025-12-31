class teste {	

	// -Xss = altera tamanho stack frame (último caso)
	
	// recursão direta
	static int fatorial(int n ){
		if(n ==0) return 1;
		return n * fatorial(n -1);
	}
	
	// recursão indireta
	static boolean ehPar(int n ){
		if (n == 0) return true;
		return ehImpar(n - 1);
	}
	
	static boolean ehImpar(int n ){
		if (n == 0) return false;
		return ehPar(n - 1);
	}
	
	// stackoverflow
	static void loop(){
		loop();
	}
	
	public static void main(String... args) { 
		fatorial(100_000); // refatorar algoritmo e otimiar
	}
}
		
