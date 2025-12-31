class teste {
	
	public static void main(String... args){
		int[][] nums = new int[3][4];
					// [][][][]
					// [][][][]
					// [][][][]
		
		int[][] matriz = new int[3][];
		matriz[0] = new int[2];
		matriz[1] = new int[4];
		matriz[2] = new int[1];
					// [][]
					// [][][][]
					// []
						
		for(int[] linha : matriz){
			for(int col : linha){
				System.out.println(" Linha: " + linha + " Col: " + col);
			}
		}
		
	}
}

		
