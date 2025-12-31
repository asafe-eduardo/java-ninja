import java.util.*;

class teste {
	
	public static void main(String... args){
		Set<String> treeSet = new TreeSet<>();
		Set<String> hashSet = new HashSet<>();
		
		// add
		treeSet.add("Eduardo");	
		treeSet.add("Eduardo");	
		treeSet.add("Thais");
		treeSet.add("Thais");				
		treeSet.add("Carlos");
		treeSet.add("Carlos");	
	
		hashSet.add("Eduardo");	
		hashSet.add("Eduardo");	
		hashSet.add("Thais");
		hashSet.add("Thais");				
		hashSet.add("Carlos");
		hashSet.add("Carlos");	
		hashSet.add(null);	
		hashSet.add(null);	
		
		System.out.println("TREESET:" );
		for(String texto : treeSet){
			System.out.println(texto);
		}
		
		System.out.println("SET:" );
		for(String texto : hashSet){
			System.out.println(texto);
		}
		
		treeSet.remove("Eduardo");
		hashSet.remove("Eduardo");
		
		
		System.out.println("TREESET:" );
		for(String texto : treeSet){
			System.out.println(texto);
		}
		
		System.out.println("SET:" );
		for(String texto : hashSet){
			System.out.println(texto);
		}
		
	}
}

		
