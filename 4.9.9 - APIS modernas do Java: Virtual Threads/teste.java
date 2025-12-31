import java.util.concurrent.*;

class teste {
	
	public static void main(String... args) throws Exception { 
	
		// virtual threads
		try(ExecutorService exec = Executors.newVirtualThreadPerTaskExecutor()) {
			for(int i = 0; i < 10_000; i++){
				int id = i;
				exec.submit(
					() -> {
						Thread.sleep(10);
						if(id == 9999) System.out.println("última tarefa");
						return null;
					});
			}
		}
		System.out.println("fim");
		
		// threads "classicas"
		int poolSize = Runtime.getRuntime().availableProcessors();
		ExecutorService exec = Executors.newFixedThreadPool(poolSize);
		System.out.println(poolSize);
		try{
			for(int i = 0; i < 10_000; i++){
				int id = i;
				exec.submit(()->{
					Thread.sleep(10);
					
					if(id == 9999) {
						System.out.println("última tarefa");
					}
					return null;
				});
			}
		
		} finally {
			exec.shutdown();
			exec.awaitTermination(1, TimeUnit.MINUTES);
		}
		System.out.println("fim");
	}
}
		
