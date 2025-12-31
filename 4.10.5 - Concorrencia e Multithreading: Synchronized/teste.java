import java.util.concurrent.*;

class teste {
	static int contador = 0; // acesso concorrente
	
	static synchronized void inc() {
		System.out.println("Nome da Thread " + Thread.currentThread().getName() + " incrementando " + contador);
		contador++; // acessando o recurso concorrente
	}
	
	public static void main(String... args) throws Exception { 
		ExecutorService exec = Executors.newFixedThreadPool(4); // pool de 4 threads
		
		try {
			for(int i = 0; i < 100_000; i++) {
				exec.submit(teste::inc);
			}
		} finally {
			exec.shutdown();
			exec.awaitTermination(1, TimeUnit.MINUTES); // gracefully stop
		}
		
		System.out.println("contador=" + contador);
	}
}
		
