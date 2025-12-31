import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;

class teste {
	//static AtomicInteger contador = new AtomicInteger(0);
	static final ReentrantLock A = new ReentrantLock();
	static final ReentrantLock B = new ReentrantLock();
	
	static void adquirir(ReentrantLock lock1, ReentrantLock lock2){
		try {
			if(lock1.tryLock(200, TimeUnit.MILLISECONDS)){
				try {
					if(lock2.tryLock(200, TimeUnit.MILLISECONDS)){
						try {
							System.out.println(Thread.currentThread().getName() + " Conseguiu travar nos 2 recursos ");
						} finally {
							lock2.unlock();
						}
					} else {
						System.out.println(Thread.currentThread().getName() + " falhou no 2 lock ");
					}
				} finally {
					lock1.unlock();
				}
			} else {
				System.out.println(Thread.currentThread().getName() + " falhou no 1 lock ");
			}
		} catch (InterruptedException e){
			Thread.currentThread().interrupt();
		}
	}	
	
	public static void main(String... args) throws Exception { 
	
		/*
			ACESSO CONCORRENTE CONTADOR
		ExecutorService exec = Executors.newFixedThreadPool(4);
		
		try {
			for(int i = 0; i < 100_000; i++){
				exec.submit(() -> {
					System.out.println("Minha thread " + Thread.currentThread().getName() + " incrementou " + contador.incrementAndGet());
					}
				);
			}
		} finally {
			exec.shutdown();
			exec.awaitTermination(1, TimeUnit.MINUTES); // gracefully stop
		}
		
		System.out.println("contador=" + contador.get());
		*/
		
		Thread t1 = new Thread(() -> adquirir(A, B));
		Thread t2 = new Thread(() -> adquirir(B, A));
		
		t1.start();
		t2.start();
		
	}
}
		
