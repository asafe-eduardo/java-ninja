public class InsertionSortTest {

	// mantem um prefixo ordenado
	// insere o proximo elemento na posição correta
	// tempo: O(n²) - não ordenados mas, ordenados O(n)
	// Espaço: O(1)
    public static void insertionSort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int chave = a[i];
            int j = i - 1;

            while (j >= 0 && a[j] > chave) {
                a[j + 1] = a[j];
                j--;
            }

            a[j + 1] = chave;
        }
	}

    
    static void print(int[] numerosNaoOrdenados){

    	for(int i = 0; i < numerosNaoOrdenados.length; i++){
    		System.out.print(numerosNaoOrdenados[i] + " ");
    	}
    }


	public static void main(String[] args){
		int[] numerosNaoOrdenados = {100, 28, 50, 1, 33, 22, 11, 05, 3};
		
		System.out.println("\n INSERTION SORT PRE ORDENACAO");
		print(numerosNaoOrdenados);
		
		insertionSort(numerosNaoOrdenados);
		
		System.out.println("\n INSERTION SORT POS ORDENACAO");
		print(numerosNaoOrdenados);
	}

}
