import java.util.*;

class teste {
	
	public static void main(String... args){
	
		// fila
		Queue<String> fila = new ArrayDeque<>();
		
		fila.offer("A");
		fila.offer("B");
		fila.offer("C");
		
		System.out.println(fila.poll());
		
		// pilha 
		Deque<String> pilha = new ArrayDeque<>();
		
		pilha.push("A");
		pilha.push("B");
		pilha.push("C");
		
		System.out.println(pilha.pop());
		
	}
}

		
