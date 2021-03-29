//QUANDO ACABA O FOR OS VALORES EXISTENTES NELE TAMBEM ACABAM 
public class MetodosMatriz {
	public static void main(String[] args) {
		Integer[][] matriz = new Integer[3][2];
		matriz[0][0] = 1;
		matriz[0][1] = 2;
		matriz[1][0] = 3;
		matriz[1][1] = 4;
		matriz[2][0] = 5;
		matriz[2][1] = 6;
				
		System.out.println(matriz.length);//linha
		System.out.println(matriz[0].length);//coluna usa o zero se matriz regular
		//numero pra achar
		int pesquisa = 1;
		for(int i =0; i<matriz.length;i++) {
			for(int j =0; j<matriz[0].length;j++) {
				if(matriz[i][j] == pesquisa) {
					try {
					if(matriz[i][j+1] != null) {
						System.out.println("Direita: "+matriz[i][j+1]);
					}
					}catch(ArrayIndexOutOfBoundsException exception) {
						
					}
					
					
					try {
					if(matriz[i][j-1] != null) {
						System.out.println("Esquerda: "+matriz[i][j-1]);
					}
					}catch(ArrayIndexOutOfBoundsException exception) {
						
					}
					
					
					try {
					if(matriz[i-1][j] != null) {
						System.out.println("Cima: "+matriz[i-1][j]);
					}}catch(ArrayIndexOutOfBoundsException exception) {
						
					}
					
					
					try {
					if(matriz[i+1][j] != null) {
						System.out.println("Baixo: "+matriz[i+1][j]);
					}
					}catch(ArrayIndexOutOfBoundsException exception) {
						
					}
					
				}
			}
		}	
  	}
}
