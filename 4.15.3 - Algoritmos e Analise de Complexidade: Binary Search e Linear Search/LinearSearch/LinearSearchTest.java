class LinearSearchTest {
	/*
	
	Tempo: O(n)
	Espaço: O(1)
	ex: lista pequenas, dados não ordenados
	
	
	*/


	static int buscaLinear(int[] a, int alvo) {
		for (int i = 0; i < a.length; i++) {
		    if (a[i] == alvo) return i;
		}
		return -1;
	}
	
	
	public static void main(String... args){
		int[] numerosOrdenados = {0, 10, 15, 40, 50, 55, 75, 88, 100};
		int[] numerosNaoOrdenados = {100, 28, 1, 50, 33, 22, 11, 05, 3};
		
		// requer dados ordenados
		System.out.println(buscaLinear(numerosNaoOrdenados, 28));
	}

}
