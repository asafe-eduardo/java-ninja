import java.util.*;

public class GrafoTest {
		static class Graph {
		    private final Map<Integer, List<Integer>> adj = new HashMap<>();

		    public void addEdgeDirected(int from, int to) {
		        adj.computeIfAbsent(from, k -> new ArrayList<>()).add(to);
		        // garante que o "to" exista na estrutura (mesmo sem outgoing edges)
		        adj.computeIfAbsent(to, k -> new ArrayList<>());
		    }

		    public void addEdgeUndirected(int a, int b) {
		        addEdgeDirected(a, b);
		        addEdgeDirected(b, a);
		    }

		    // DFS recursivo
		    // mais fundo o possivel
		    // Tempo: O(V + E) V = Vertices e E = Arestas
		    // Espaço: O(V)
		    // componente conectados e buscar caminhos
		    public List<Integer> dfs(int start) {
		        List<Integer> order = new ArrayList<>();
		        Set<Integer> visited = new HashSet<>();
		        dfs(start, visited, order);
		        return order;
		    }

		    private void dfs(int node, Set<Integer> visited, List<Integer> order) {
		        if (!visited.add(node)) return;
		        order.add(node);
		        for (int nei : adj.getOrDefault(node, List.of())) {
		            dfs(nei, visited, order);
		        }
		    }

		    // BFS
		    // mais abragente vai por camadas
		    // primeiro todos os vizinhos e depois vizinhos dos vizinhos
		    // Tempo: O(V+E)
		    // Espaço: O(V)
		    // menor caminho de grafo e distancia minima
		    public List<Integer> bfs(int start) {
		        List<Integer> order = new ArrayList<>();
		        Set<Integer> visited = new HashSet<>();
		        Queue<Integer> q = new ArrayDeque<>();

		        visited.add(start);
		        q.add(start);

		        while (!q.isEmpty()) {
		            int node = q.poll();
		            order.add(node);

		            for (int nei : adj.getOrDefault(node, List.of())) {
		                if (visited.add(nei)) {
		                    q.add(nei);
		                }
		            }
		        }
		        return order;
		    }
    }

	public static void main(String... args){
	    // Graph demo
        Graph g = new Graph();
        // grafo não-direcionado simples
        g.addEdgeUndirected(1, 2);
        g.addEdgeUndirected(1, 3);
        g.addEdgeUndirected(2, 4);
        g.addEdgeUndirected(3, 5);
        g.addEdgeUndirected(4, 5);
        
        /**
        	// por ser grafo nao direcional não existe "inicio"
        	1 -> [2, 3]
			2 -> [1, 4]
			3 -> [1, 5]
			4 -> [2, 5]
			5 -> [3, 4]
        
        	   2				1
			  / \			   / \
			 1   4     ou	  2   3
			  \ / \			  |   |
			   3---5	      4---5
				
        **/

        // Visita por vizinhos não explorados
        System.out.println("DFS a partir do 1: " + g.dfs(1));
        
        // Visita por camadas começando na camada 0 sendo o nó 1
        System.out.println("BFS a partir do 1: " + g.bfs(1));

	}

}


