import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.List;

class teste {
	
	public static void main(String... args) throws Exception{
		Runtime rt = Runtime.getRuntime();
		
		System.out.println("CPUs:" + rt.availableProcessors());
		System.out.println("Heap total (bytes):" + rt.totalMemory());
		System.out.println("Heap Livre (bytes):" + rt.freeMemory());
		System.out.println("Heap Max(bytes):" + rt.maxMemory());


		List<String> bash = List.of("bash","-lc", "echo 'oi' && date");
		
		ProcessBuilder pb = new ProcessBuilder(bash);
		pb.redirectErrorStream(true);
		
		Process p = pb.start();
		
		try(BufferedReader br = new BufferedReader(
			new InputStreamReader(p.getInputStream(), StandardCharsets.UTF_8)
		)){
			br.lines().forEach(System.out::println);
		}
		
		int exit = p.waitFor();
		System.out.println("Exit code:" + exit);
		
	
	}
}
		
