class BinarySearchTest {

	//Tempo: O(log n)
	//Espaço: O(1) 
	// versões recursivas O(log n)

	static int buscaBinaria(int[] a, int alvo) {
		int lo = 0, hi = a.length - 1;
		while (lo <= hi) {
		    int mid = lo + (hi - lo) / 2;
		    if (a[mid] == alvo) return mid;
		    if (a[mid] < alvo) lo = mid + 1;
		    else hi = mid - 1;
		}
		return -1;
	}
	
	
	public static void main(String... args){
		int[] numerosOrdenados = {0, 10, 15, 35, 40, 55, 75, 88, 100};
		int[] numerosNaoOrdenados = {100, 28, 50, 1, 33, 22, 11, 05, 3};
		
		// requer dados ordenados
		System.out.println(buscaBinaria(numerosOrdenados, 1));
	}

}
