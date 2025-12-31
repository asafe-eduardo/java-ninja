
class teste {
	static final Object LOCK_A = new Object();
	static final Object LOCK_B = new Object();
	
	static void sleep(long ms){
		try {
			Thread.sleep(ms);
		} catch (InterruptedException e){
			
		}
	}
	
	public static void main(String... args) throws Exception { 
		Thread t1 = new Thread(() -> {
			synchronized (LOCK_A) {
				sleep(50);
				synchronized(LOCK_B) {
					System.out.println("Thread 1 fez lock no A e B com sucesso" );
				}
			}
		});
		
		Thread t2 = new Thread(() -> {
			synchronized (LOCK_B) {
				sleep(50);
				synchronized(LOCK_A) {
					System.out.println("Thread 2 fez lock no B e A com sucesso" );
				}
			}
		});
		
		t1.start();
		t2.start();
	}
}
		
