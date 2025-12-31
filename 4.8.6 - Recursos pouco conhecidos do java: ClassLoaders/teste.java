import java.io.InputStream;

class teste {
	
	public static void main(String... args) throws Exception{
		try(
		InputStream in = teste.class.getClassLoader().getResourceAsStream("messages.properties")
		){
			System.out.println("Encountrou?" + (in != null));
		}
	}
}
		
