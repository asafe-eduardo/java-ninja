// não checadas
class SaldoInsuficienteException extends RuntimeException {
	public SaldoInsuficienteException(String message){
		super(message);
	}
}

class IntegracaoIndisponivelException extends Exception {
	public IntegracaoIndisponivelException(String message, Throwable cause){
		super(message, cause);
	}
}

class Conta {
	private double saldo = 100.0;
	
	void sacar(double valor){
		if(valor > saldo){
			throw new SaldoInsuficienteException("Saldo insuficiente. Saldo=" + saldo);
		}
		saldo = saldo - valor;
	}
	
	void sacarInvestimento() throws IntegracaoIndisponivelException {
		//
		//...
		throw new IntegracaoIndisponivelException("Falhou na integração", new Exception());
	}	
}

class teste {	


	public static void main(String... args) throws IntegracaoIndisponivelException { 
		new Conta().sacar(50.0);
		new Conta().sacarInvestimento();
	}
}
		
