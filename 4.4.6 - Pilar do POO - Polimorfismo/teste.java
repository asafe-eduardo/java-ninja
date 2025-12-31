class Pagamento {
	void pagar(double valor) {
	
	}
}

class Pix extends Pagamento {
	public void pagar(double valor){
		System.out.println("Pagou com pix " + valor);
	}
}

class Cartao extends Pagamento {
	public void pagar(double valor){
		System.out.println("Pagou com cartao " + valor);
	}
}

class PagamentoService {
	void pagamento(Pagamento pagamento, double valor){
		pagamento.pagar(valor);
	}
}


class teste {
	
	public static void main(String... args){

	
	}
}
		
