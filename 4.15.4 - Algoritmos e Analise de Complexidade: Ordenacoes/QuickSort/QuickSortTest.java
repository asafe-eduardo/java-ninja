import java.util.Arrays;

public class QuickSortTest {

	// ordena recursivamente
	// Tempo: O(n log n) pode variar para O(n²)
	// Espaço: O(log n)
	
    public static void quickSort(int[] a) {
        quickSort(a, 0, a.length - 1);
    }

    private static void quickSort(int[] a, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(a, low, high);
            quickSort(a, low, pivotIndex - 1);
            quickSort(a, pivotIndex + 1, high);
        }
    }

    private static int partition(int[] a, int low, int high) {
        int pivot = a[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (a[j] <= pivot) {
                i++;
                swap(a, i, j);
            }
        }

        swap(a, i + 1, high);
        return i + 1;
    }

    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }



    
    static void print(int[] numerosNaoOrdenados){

    	for(int i = 0; i < numerosNaoOrdenados.length; i++){
    		System.out.print(numerosNaoOrdenados[i] + " ");
    	}
    }


	public static void main(String[] args){
		int[] numerosNaoOrdenados = {100, 28, 50, 1, 33, 22, 11, 05, 3};
		
		System.out.println("\n QUICK SORT PRE ORDENACAO");
		print(numerosNaoOrdenados);
		
		quickSort(numerosNaoOrdenados);
		
		System.out.println("\n QUICK SORT POS ORDENACAO");
		print(numerosNaoOrdenados);
		
		// TimSort - usado pelo Java (Recomendavel)
		// O(n log n) e variar O(n)
		// Arrays.sort()
		// Collections.sort()
		
	}

}
