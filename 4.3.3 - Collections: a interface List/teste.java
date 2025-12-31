import java.util.*;

class teste {
	
	public static void main(String... args){
		List<Integer> arrayList = new ArrayList<>();
		Queue<Integer> linkedList = new LinkedList<>();
		
		// add
		arrayList.add(1);	
		arrayList.add(2);		
		arrayList.add(3);	
		
		linkedList.add(1);	
		linkedList.add(2);		
		linkedList.add(3);	
		
		
		for(Integer numero : arrayList){
			System.out.println(numero);
		}
		
		System.out.println(linkedList.poll());
		
		
	}
}

		
