class teste {	
	
	public static void main(String... args) { 
		// o que é um algoritmo?
		// Um algoritmo é um conjunto finito de passos bem definidos
		// para transformar uma entrada em uma saida
		// * correto - produz uma respota certa para todas as entradas validas
		// * finito - chega a um fim
		// * Deterministico - previsibilidade ou a mesma entrada produz a mesma saida
		// * Eficiente - utilizar os recursos de maneira razoavel
	
		// Tempo e Espaço (Complexidade) - dentro do desenvolvimento
		
		// Tempo = Custo. dado uma entrada n o quanto o custo ou tempo aumenta?
		// não em millisegundos mas, a ordem de crescimento
		
		// Espaço = Memoria. extra além da entrada
		
		
		// Big O Notation
		// Big O descreve o comportamento assintótico do algortimo
		// o custo quando n(entrada ou parametros) é grande ou cresce
		
		// O(1): constante - não é rapido mas, constante em relação a n
		// ex: acessar um array
		// num[1]
		
		// O(log n): cresce devagar - tempo logaritmico 
		// o custo vai crescer muito lentamente conforme n cresce
		// ex: busca binaria
		
		// O(n): linear - o custo cresce proporcionalmente a entrada
		// ex: percorrer um array
		
		// O(n log n): ordenações eficientes
		// operação linear + uma operação logaritmica (dividir em subproblema)
		// ex: mergeSort, quick sort
		
		// O(n²): quadratico - utilização de loops alinhados
		// ex: bubbleSort e Insertion sort
		
		// O(2ⁿ): explosivo
		// o numero de operações dobra a cada incremento de n
		// ex: fibonnaci ingenuo
		/**
		static int fib(int n) {
			if (n <= 1) return n;
			return fib(n - 1) + fib(n - 2);
		}

		**/
		
	}
}
		
