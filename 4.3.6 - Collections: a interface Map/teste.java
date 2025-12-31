import java.util.*;

class Carro implements Comparable<Carro>{
	private String modelo;
	public Carro(String modelo){
		this.modelo = modelo;
	}
	
	@Override
	public int compareTo(Carro o){
		return this.modelo.compareTo(o.modelo);
	}


}

class teste {
	
	public static void main(String... args){
	
		// map
		// chave, valor
		Map<String, String> usuarios = new HashMap<>();
		Map<String, String> usuariosOrdenados = new TreeMap<>();
		
		usuarios.put("Admin", "Eduardo");
		usuarios.put("Operador", "Carlos");
		usuarios.put("Financeiro", "Thais");
		
		usuariosOrdenados.put("Admin", "Eduardo");
		usuariosOrdenados.put("Operador", "Carlos");
		usuariosOrdenados.put("Financeiro", "Thais");
		
		System.out.println(usuarios);
		System.out.println(usuariosOrdenados);
		
		usuarios.remove("Admin");
		System.out.println(usuarios);
		
		
		
	}
}

		
