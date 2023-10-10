package matriz;
	import java.util.Scanner;
public class matriz {

	public static void main(String[] args) {
				
		int matriz [][] = new int [4][4];
		
		Scanner sc = new Scanner (System.in);

		
		for ( int linha = 0; linha < 4; linha++ ) {
			for ( int coluna = 0; coluna < 4; coluna++) {
				System.out.println("Digite o valor: ");
				matriz [linha][coluna] = sc.nextInt();
				
				if ( matriz [linha][coluna] < 0) {
					matriz[linha][coluna] = 0;
				}

			}
			
			
				}
		
		for ( int linhaFim = 0; linhaFim < 4; linhaFim++ ) {
			for ( int colunaFim = 0; colunaFim < 4; colunaFim++ ) {
				System.out.println(matriz [linhaFim][colunaFim]);
			}
			
		}
		
	}

}
