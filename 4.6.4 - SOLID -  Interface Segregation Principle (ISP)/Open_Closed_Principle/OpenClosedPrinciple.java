public class OpenClosedPrinciple {

	//anti-pattern
	class CalculadoraFrete {
		public double calcular(String tipo, double pesoKg) {
		    if ("PAC".equals(tipo)) return pesoKg * 10;
		    if ("SEDEX".equals(tipo)) return pesoKg * 20;
		    if ("RETIRADA".equals(tipo)) return 0;

		    throw new IllegalArgumentException("Tipo inválido: " + tipo);
		}
	}

	// design pattern
	interface Frete {
		double calcular(double pesoKg);
	}

	class FretePac implements Frete {
		public double calcular(double pesoKg) { return pesoKg * 10; }
	}

	class FreteSedex implements Frete {
		public double calcular(double pesoKg) { return pesoKg * 20; }
	}

	class FreteRetirada implements Frete {
		public double calcular(double pesoKg) { return 0; }
	}

	class CalculadoraFrete {
		public double calcular(Frete frete, double pesoKg) {
		    return frete.calcular(pesoKg);
		}
	}

}
