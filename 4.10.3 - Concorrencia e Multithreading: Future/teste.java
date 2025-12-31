import java.util.concurrent.*;

class teste {
	
	public static void main(String... args) throws Exception { 
		ExecutorService exec = Executors.newFixedThreadPool(2);
		
		try{
			Future<Integer> promise = exec.submit(() -> {
				Thread.sleep(5000);
				return 40 + 2;
			});
			System.out.println("Execução normal...realizando tarefas");
			System.out.println("A promesa finalizou??" + promise.isDone());
			Integer r = promise.get(); // espera terminar
			System.out.println("A promesa finalizou??" + promise.isDone());
			System.out.println("Resultado" + r);
			
		} finally {
			exec.shutdown();
			exec.awaitTermination(1, TimeUnit.MINUTES);
		}
	}
}
		
