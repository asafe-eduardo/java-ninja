import java.lang.management.*;

class teste {
	
	public static void main(String... args){
		RuntimeMXBean runtime = ManagementFactory.getRuntimeMXBean();
		MemoryMXBean memory = ManagementFactory.getMemoryMXBean();
		ThreadMXBean threads = ManagementFactory.getThreadMXBean();
		
		System.out.println("JVM name: " + runtime.getVmName());
		System.out.println("Uptime(ms): " + runtime.getUptime());
		
		MemoryUsage heap = memory.getHeapMemoryUsage();
		System.out.println("Heap used: " + heap.getUsed());
		System.out.println("heap max: " + heap.getMax());
		
		System.out.println("Thread count: " + threads.getThreadCount());
		System.out.println("Peak threads: " + threads.getPeakThreadCount());
		
	}
}
		
