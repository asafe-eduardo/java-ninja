interface Combustivel {
	double calcularPreco(double litros);
	
	default void log(String msg){
		System.out.println("LOG:" + msg);
	}
}

class Gasolina implements Combustivel {

	@Override
	public double calcularPreco(double litros){
		log("VAI CALCULAR GASOLINA");
		return litros * 6.5;
	}
	
	@Override
	public void log(String msg){
		System.out.prinln("novo Log");
	}
}

class Etanol implements Combustivel {
	@Override
	public double calcularPreco(double litros){
		log("VAI CALCULAR ETANOL");
		return litros * 4.8;
	}
}


class teste {
	
	public static void main(String... args){
		Combustivel gasolina = new Gasolina();
		Combustivel etanol = new Etanol();
		
		System.out.println(gasolina.calcularPreco(40));
		System.out.println(etanol.calcularPreco(40));
	
	}
}
		
