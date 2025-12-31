import java.util.Arrays;

public class MergeSortTest {

	// ideia é divide o array no meio e ordena cada metade
	// Tempo: O(n log n)
	// Espaço: O(n)
    public static void mergeSort(int[] a) {
        if (a.length <= 1) return;

        int mid = a.length / 2;
        int[] left = Arrays.copyOfRange(a, 0, mid);
        int[] right = Arrays.copyOfRange(a, mid, a.length);

        mergeSort(left);
        mergeSort(right);
        merge(a, left, right);
    }

    private static void merge(int[] a, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                a[k++] = left[i++];
            } else {
                a[k++] = right[j++];
            }
        }

        while (i < left.length) {
            a[k++] = left[i++];
        }

        while (j < right.length) {
            a[k++] = right[j++];
        }
    }


    
    static void print(int[] numerosNaoOrdenados){

    	for(int i = 0; i < numerosNaoOrdenados.length; i++){
    		System.out.print(numerosNaoOrdenados[i] + " ");
    	}
    }


	public static void main(String[] args){
		int[] numerosNaoOrdenados = {100, 28, 50, 1, 33, 22, 11, 05, 3};
		
		System.out.println("\n MERGE SORT PRE ORDENACAO");
		print(numerosNaoOrdenados);
		
		mergeSort(numerosNaoOrdenados);
		
		System.out.println("\n MERGE SORT POS ORDENACAO");
		print(numerosNaoOrdenados);
	}

}
