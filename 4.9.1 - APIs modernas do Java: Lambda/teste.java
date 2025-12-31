import java.util.*;

class teste {

	/**
		lambdas
		() -> 
		() -> {
			...
		}

	**/
	
	public static void main(String... args) throws Exception{
		List<String> nomes = new ArrayList<>();
		nomes.add("Thais");
		nomes.add("Ana");
		nomes.add("Eduardo");

		// Java 7
		/*
		Collections.sort(nomes, new Comparator<String>(){
			@Override
			public int compare(String a, String b){
				return a.compareTo(b);
			}
		});
		*/
		
		//java 8
		//nomes.sort((a,b) -> a.compareTo(b));
		nomes.sort(String::compareToIgnoreCase);
		
		System.out.println(nomes);
	}
}
		
