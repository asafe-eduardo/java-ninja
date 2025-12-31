import java.util.*;

class Produto implements Comparable<Produto>{
	public String nome;
	public double preco;
	
	Produto(String nome, double preco){
		this.nome = nome;
		this.preco = preco;
	}
	
	public double getPreco(){
		return this.preco;
	}
	
	@Override
	public String toString(){
		return this.nome + " - " + this.preco;
	}
	
	@Override
	public int compareTo(Produto p){
		return this.nome.compareTo(p.nome);
	}
	
}

class teste {
	
	public static void main(String... args){
		List<Produto> produtos = new ArrayList<>();
		produtos.add(new Produto("Notebook", 3.500));
		produtos.add(new Produto("Televisao", 1.800));
		produtos.add(new Produto("Geladeira", 5000));
		
		System.out.println(produtos);
		
		Collections.sort(produtos);
		
		System.out.println(produtos);
		
		produtos.sort(Comparator.comparing(Produto::getPreco).reversed());
		System.out.println(produtos);
		
		Set<String> nomes = new TreeSet(Comparator.reverseOrder());
		nomes.add("Eduardo");
		nomes.add("Thais");
		nomes.add("Carlos");
		
		System.out.println(nomes);
		
	}
}

		
