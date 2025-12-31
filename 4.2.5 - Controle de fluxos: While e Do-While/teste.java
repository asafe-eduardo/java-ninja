class teste {

	public static boolean fizNoWhile(int i){
		System.out.println("Entrei na validação While");
		return i < 5;
	}
	
	public static boolean fizNoDoWhile(int i){
		System.out.println("Entrei na validação Do-While");
		return i < 5;
	}
	
	public static void main(String... args){
		int[] nums = {0,1,2,3,4,5};
	
		int i = 0;
		int j = 0;
		
		System.out.println("Nao Entrei no While");
		while(fizNoWhile(i)){
			System.out.println("Entrei no While " + i);
			i++;
		}
		
		System.out.println("Nao Entrei no Do-While " + j);
		do{
			System.out.println("Entrei no Do-While " + j);
			j++;
		} while(fizNoDoWhile(j));
			
		
	}
}

		
