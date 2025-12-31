public class DependencyInversionPrinciple {

	// anti-pattern
	class MySqlPedidoRepository {
		public void salvar(Pedido pedido) { /* JDBC... */ }
	}

	class PedidoService {
		private final MySqlPedidoRepository repo = new MySqlPedidoRepository();

		public void finalizar(Pedido pedido) {
		    repo.salvar(pedido);
		}
	}


	// recomendado
	interface PedidoRepository {
		void salvar(Pedido pedido);
	}

	class MySqlPedidoRepository implements PedidoRepository {
		public void salvar(Pedido pedido) { /* JDBC... */ }
	}

	class InMemoryPedidoRepository implements PedidoRepository {
		public void salvar(Pedido pedido) { /* salva em lista */ }
	}

	class PedidoService {
		private final PedidoRepository repo;

		public PedidoService(PedidoRepository repo) {
		    this.repo = repo;
		}

		public void finalizar(Pedido pedido) {
		    repo.salvar(pedido);
		}
	}


	public static void main(String[] args) {
		PedidoRepository repoFake = new InMemoryPedidoRepository();
		PedidoService service = new PedidoService(repoFake);

		service.finalizar(new Pedido());
	}


}
