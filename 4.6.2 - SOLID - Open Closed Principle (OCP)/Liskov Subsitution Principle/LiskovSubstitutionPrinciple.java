public class LiskovSubstitutionPrinciple {

	// anti-pattern
	class Retangulo {
		protected int largura;
		protected int altura;

		public void setLargura(int largura) { this.largura = largura; }
		public void setAltura(int altura) { this.altura = altura; }

		public int area() { return largura * altura; }
	}

	class Quadrado extends Retangulo {
		@Override
		public void setLargura(int largura) {
		    this.largura = largura;
		    this.altura = largura;
		}

		@Override
		public void setAltura(int altura) {
		    this.altura = altura;
		    this.largura = altura;
		}
	}

	static void testarArea(Retangulo r) {
		r.setLargura(5);
		r.setAltura(2);
		System.out.println(r.area()); // esperado 10
	}

	public static void main(String[] args) {
	
		testarArea(new Quadrado()); // imprime 4 ou 25 dependendo da ordem: quebra expectativa
	}
	
	//Design Pattern
	interface Forma {
		int area();
	}

	class Retangulo implements Forma {
	
		int largura;
		int altura;
	
		public Retangulo(int largura, int altura){
			this.largura = largura;
			this.altura = altura;
		}
	
		public int area() { return largura * altura; }
	}

	class Quadrado implements Forma {
	
		int lado;
		public Quadrado(int lado){
			this.lado = lado;
		}
	
		public int area() { return lado * lado; }
	}



}
