import java.util.List;
import java.util.ArrayList;

class teste {
	
	public static void main(String... args){
		/*
		for(inicializacao;condição;atualização;){
			//bloco
		}
		for(inicializacao : lista ou array){
		
		}
		*/
		
		List<String> carros = new ArrayList<String>();
		carros.add("BMW");
		carros.add("Audi");
		carros.add("Gol");
		carros.add("camaro");
		
		String[] nums = {"Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sabado", "Domingo"};
		
		for(String c : carros){
			System.out.println(c);
		}
			
		
	}
}

		
