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
	
	//recursão ingenua
	static int recursaoIngenua(int n ){
		if(n == 0) return 1;
		return recursaoIngenua(n -1) + recursaoIngenua(n -2);
	}
	
	// iteração
	static long fatorialIterativo(long n){
		if(n <0) throw new IllegalArgumentException();
		long r = 1;
		for(int i = 2; i <=n; i++){
			r *= i;
			System.out.println(r);
		}
		return r;
	}
	
	// memoization ou cache
	static long fibMemo(int n, long[] memo) {
		if(n < 0) throw new IllegalArgumentException();
		if(n<=1) return n;
		if(memo[n] != -1) {
			return memo[n];
		}
		memo[n] = fibMemo(n - 1, memo) + fibMemo(n-2, memo);
		System.out.println(memo[n]);
		return memo[n];
	}
	
	static long fibMemo(int n){
		long[] memo = new long[n + 1];
		java.util.Arrays.fill(memo, -1);
		return fibMemo(n, memo);
	}
	
	public static void main(String... args) { 
		fibMemo(3);
	}
}
		
