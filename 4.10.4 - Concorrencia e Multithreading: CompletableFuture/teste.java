import java.util.concurrent.*;

class teste {
	
	public static void main(String... args) { 
		CompletableFuture<Integer> numeroAsync = CompletableFuture
			.supplyAsync(() -> 10 / 0) // lança uma exeção em runtime
			.handle( (val, ex) -> ex != null ? -1 : val); // callback de erro
				
		System.out.println("resultado: " + numeroAsync.join());
		
	}
}
		
