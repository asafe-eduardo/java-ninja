import java.util.*;
import java.util.stream.Collectors;


class Produto {
	String nome;
	double preco;
	String categoria;
	boolean ativo;
	
	public Produto(String nome, double preco, String categoria, boolean ativo){
		this.nome = nome;
		this.preco = preco;
		this.categoria = categoria;
		this.ativo = ativo;
	}
	
	void setNome(String nome){
		this.nome = nome;
	}
	
	String getNome(){
		return this.nome;
	}
	
    void setPreco(double preco){
		this.preco = preco;
	}
	
	double getPreco(){
		return this.preco;
	}
	
    void setCategoria(String categoria){
		this.categoria = categoria;
	}
	
	String getCategoria(){
		return this.categoria;
	}
	
	void setAtivo(boolean ativo){
		this.ativo = ativo;
	}
	
	boolean isAtivo(){
		return this.ativo;
	}
}

class teste {
	
	public static void main(String... args) { 
		List<Produto> lista = new ArrayList<>();
		lista.add(new Produto("Mouse", 120.0, "PERIFERICOS", true));
		lista.add(new Produto("Teclado", 220.0, "PERIFERICOS", true));
		lista.add(new Produto("Monitor", 900.0, "VIDEO", false));
		
		List<String> nomesAtivos = lista // source data
			.stream() // transforma sua List no Objeto de Stream
			.filter(Produto::isAtivo) // pipeline de filtragem
			.map(Produto::getNome)    // pipeline de transformação
			.collect(Collectors.toList()); // terminal ou collector
			
		System.out.println(nomesAtivos);
		
		Map<String, List<Produto>> porCategoria = lista
		.stream()
		.collect(Collectors.groupingBy(Produto::getCategoria));
		
		System.out.println(porCategoria);
		
	}
}
		
