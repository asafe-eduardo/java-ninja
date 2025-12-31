public class InterfaceSegregationPrinciple {

	// anti-pattern
	interface Multifuncional {
		void imprimir();
		void escanear();
		void fax();
	}

	class ImpressoraSimples implements Multifuncional {
		public void imprimir() { /* ok */ }
		public void escanear() { throw new UnsupportedOperationException(); }
		public void fax() { throw new UnsupportedOperationException(); }
	}
	
	// recomendado
	interface Impressora {
    void imprimir();
	}

	interface Scanner {
		void escanear();
	}

	interface Fax {
		void fax();
	}

	class ImpressoraSimples implements Impressora {
		public void imprimir() { /* ... */ }
	}

	class ImpressoraCompleta implements Impressora, Scanner, Fax {
		public void imprimir() { /* ... */ }
		public void escanear() { /* ... */ }
		public void fax() { /* ... */ }
	}



}
