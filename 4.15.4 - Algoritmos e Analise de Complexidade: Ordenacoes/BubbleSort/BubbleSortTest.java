public class BubbleSortTest {

	// compara os elementos adjavantes enviando o maior para o final
    // Tempo: O(n²)
    // Espaço: O(1)
    public static void bubbleSort(int[] a) {
        int n = a.length;
        boolean trocou;

        for (int i = 0; i < n - 1; i++) {
            trocou = false;

            for (int j = 0; j < n - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    trocou = true;
                }
            }

            // Otimização: se não trocou, já está ordenado
            if (!trocou) break;
        }
    }
    
    static void print(int[] numerosNaoOrdenados){

    	for(int i = 0; i < numerosNaoOrdenados.length; i++){
    		System.out.print(numerosNaoOrdenados[i] + " ");
    	}
    }


	public static void main(String[] args){
		int[] numerosNaoOrdenados = {100, 28, 50, 1, 33, 22, 11, 05, 3};
		
		System.out.println("\n BUBBLE SORT PRE ORDENACAO");
		print(numerosNaoOrdenados);
		
		bubbleSort(numerosNaoOrdenados);
		
		System.out.println("\n BUBBLE SORT POS ORDENACAO");
		print(numerosNaoOrdenados);
	}

}
