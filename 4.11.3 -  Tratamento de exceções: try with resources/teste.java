import java.io.*;

class teste {	
	public static void main(String... args) { 
	
		/**
			sem try-with-resources
		**/
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("arquivo.txt"));
			System.out.println(br.readLine());
		} catch (IOException e) {
			throw new RuntimeException(e);
		} finally {
			if(br != null){
				try {
					br.close();
				} catch(IOException ignored){
				
				}
			}
		}
		
		/*
			com try-with-resources
		*/
		try(BufferedReader brWithTryResources = new BufferedReader(new FileReader("arquivo.txt"))) {
			System.out.println(brWithTryResources.readLine());
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}
		
