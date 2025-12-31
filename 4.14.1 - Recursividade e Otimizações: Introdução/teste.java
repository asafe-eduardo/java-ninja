class teste {	

	// -Xss = altera tamanho stack frame
	
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
	
	public static void main(String... args) { 

	}
}
		
