import java.util.concurrent.*;

class teste {
	
	public static void main(String... args) throws Exception { 
		ExecutorService executor = Executors.newFixedThreadPool(4);
		
		try {
			for(int i = 0; i< 10;i++){
				int id = i;
				executor.submit(() -> {
					System.out.println("Tarefa " + id + " em " + Thread.currentThread().getName());
				});
			}
		} finally {
			executor.shutdown(); // não aceita mais tarefas
			executor.awaitTermination(1, TimeUnit.MINUTES); // gracefully stop
		}
		
		System.out.println("Fim.");
	}
}
		
