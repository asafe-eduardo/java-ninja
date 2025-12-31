import java.util.concurrent.Callable;

class teste {

	static Callable<Integer> soma(int a, int b){
		return () -> a + b;
	}
	
	public static void main(String... args) throws Exception { 
		// thread
		Thread t = new Thread(() -> {
				System.out.println("Rodando em " + Thread.currentThread().getName());
			}, "minha-thread-1");
			
		t.start(); // inicia a 2º thread
		t.join();  // espera terminar
		

		
		// runnable
		Runnable tarefa = () -> {
			System.out.println("Runnable lambda");
		};
		
		Thread t2 = new Thread(tarefa, "worker");
		t2.start();
		t2.join();
		
		Integer r = soma(10, 20).call();
		System.out.println(r);
		
		
		System.out.println("Main terminou.");
		
	}
}
		
