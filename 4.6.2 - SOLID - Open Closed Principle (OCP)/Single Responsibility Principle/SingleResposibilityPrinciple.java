public class SingleResposibilityPrinciple {

	class Pedido {
		
	}

	// anti-pattern
	class PedidoServiceAntiPattern {
		public void finalizarPedido(Pedido pedido) {
		    validar(pedido);
		    salvarNoBanco(pedido);
		    enviarEmailConfirmacao(pedido);
		    imprimirNota(pedido);
		}

		private void validar(Pedido pedido) { /* ... */ }
		private void salvarNoBanco(Pedido pedido) { /* JDBC... */ }
		private void enviarEmailConfirmacao(Pedido pedido) { /* SMTP... */ }
		private void imprimirNota(Pedido pedido) { /* PDF... */ }
	}

	
	// recomendavel
	class PedidoValidator {
    public void validar(Pedido pedido) { /* ... */ }
	}

	interface PedidoRepository {
		void salvar(Pedido pedido);
	}

	class EmailService {
		public void enviarConfirmacao(Pedido pedido) { /* ... */ }
	}

	class NotaFiscalService {
		public void imprimir(Pedido pedido) { /* ... */ }
	}

	class PedidoService {
		private final PedidoValidator validator;
		private final PedidoRepository repository;
		private final EmailService emailService;
		private final NotaFiscalService notaFiscalService;

		public PedidoService(PedidoValidator validator,
		                     PedidoRepository repository,
		                     EmailService emailService,
		                     NotaFiscalService notaFiscalService) {
		    this.validator = validator;
		    this.repository = repository;
		    this.emailService = emailService;
		    this.notaFiscalService = notaFiscalService;
		}

		public void finalizarPedido(Pedido pedido) {
		    validator.validar(pedido);
		    repository.salvar(pedido);
		    emailService.enviarConfirmacao(pedido);
		    notaFiscalService.imprimir(pedido);
		}
	}


}
