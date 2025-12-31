import java.util.Optional;

class teste {
	
	static Optional<String> buscarEmail(boolean existe){
		return existe ? Optional.of("a@b.com") : Optional.empty();
	}
	
	static String buscarEmailSemOp(boolean existe){
		return existe ? "a@b.com" : null;
	}

	
	public static void main(String... args) { 
		// com OP
		String email = buscarEmail(false)
				.map(String::toUpperCase)
				.orElse("SEM_EMAIL");
		
		// sem OP
		String emailSemOp = buscarEmailSemOp(false).toUpperCase();
				
		System.out.println(emailSemOp);
		
	}
}
		
