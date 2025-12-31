class teste {
	
	static String describe(Object o){
		return switch(o) {
			case null -> "null";
			case String s -> "String(" + s.length() + ")";
			case Integer i -> "Int(" + (i *2) + ")";
			default -> "Outro";
		};
	}	
	
	public static void main(String... args) { 
		System.out.println(describe(Long.valueOf(10)));
	}
}
		
