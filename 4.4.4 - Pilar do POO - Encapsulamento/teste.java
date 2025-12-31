class Conta {
	private double saldo;
	
	public void saque(double saque){
		if(saque <= 0){
			throw new IllegalStateException("Valor de saque não pode ser negativo");
		} else {
			this.saldo -= saque;
		}
		
	}
	
	public void deposito(double deposito){
		if(deposito <= 0){
			throw new IllegalStateException("Valor de deposito não pode ser negativo");
		} else {
			this.saldo += deposito;
		}
		
	}
	
	public double getSaldo(){
		return this.saldo;
	}
}


class teste {
	
	public static void main(String... args){
		Conta conta = new Conta();
		conta.deposito(1000);
		
		conta.saque(100);
		
		System.out.println(conta.getSaldo());
	}
}
		
