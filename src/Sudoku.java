import java.util.Scanner;



public class Sudoku {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int contJogada = 0;
		int quantidade;
		int tabuleiro[][] = new int[9][9];
		boolean erro = false;
		int somaLinha1 = 0, somaLinha2 = 0, somaLinha3 = 0, somaLinha4 = 0, somaLinha5 = 0, somaLinha6 = 0,
				somaLinha7 = 0, somaLinha8 = 0, somaLinha9 = 0;
		int somaColuna1 = 0, somaColuna2 = 0, somaColuna3 = 0, somaColuna4 = 0, somaColuna5 = 0, somaColuna6 = 0,
				somaColuna7 = 0, somaColuna8 = 0, somaColuna9 = 0;
		int somaJogo = 0;
		boolean certo = false;
		int cont1 = 0, cont2 = 0, cont3 = 0, cont4 = 0, cont5 = 0, cont6 = 0, cont7 = 0, cont8 = 0, cont9 = 0;
		
		do {
			System.out.println("Digite a quantidade de jogadores que irao jogar Sudoku");
			quantidade = sc.nextInt();
			
			if(quantidade < 0 || quantidade > 9) {
				System.out.println("Há jogadores de mais, repita o valor.");
			}
		} while (quantidade < 0 || quantidade > 9);

		String jogadores[] = new String[quantidade];

		for (int cont = 0; cont < quantidade; cont++) {
			System.out.println("Digite o nome do jogador " + (cont + 1));
			jogadores[cont] = sc.next();
		}

		for (int jogadas = 0; jogadas < quantidade; jogadas++) {
			certo = false;
			erro = false;
			
			somaColuna1 = 0; somaColuna2 = 0; somaColuna3 = 0; somaColuna4 = 0;somaColuna5 = 0;somaColuna6 = 0;somaColuna7 = 0;somaColuna8 = 0;somaColuna9 = 0;
			somaLinha1 = 0; somaLinha2 = 0; somaLinha3 = 0; somaLinha4 = 0; somaLinha5 = 0; somaLinha6 = 0; somaLinha7 = 0; somaLinha8 = 0; somaLinha9 = 0;
			somaJogo = 0;
			cont1 = 0; 	cont2 = 0; 	cont3 = 0; 	cont4 = 0;	cont5 = 0;	cont6 = 0;	cont7 = 0; 	cont8 = 0;	cont9 = 0; 
			
			for (int linha = 0; linha < 9; linha++) {
				for (int coluna = 0; coluna < 9; coluna++) {
					tabuleiro[linha][coluna] = 0;
				}
				}
			
			System.out.println("Jogador " + jogadores[jogadas] + ", preencha o seu Sudoku");
			for (int linha = 0; linha < 9; linha++) {
				for (int coluna = 0; coluna < 9; coluna++) {
					tabuleiro[linha][coluna] = sc.nextInt();
					
					if(tabuleiro[linha][coluna] == 1 ) {
						cont1++;
					}
					if(tabuleiro[linha][coluna] == 2 ) {
						cont2++;
					}
					if(tabuleiro[linha][coluna] == 3 ) {
						cont3++;
					}
					if(tabuleiro[linha][coluna] == 4 ) {
						cont4++;
					}
					if(tabuleiro[linha][coluna] == 5 ) {
						cont5++;
					}
					if(tabuleiro[linha][coluna] == 6 ) {
						cont6++;
					}
					if(tabuleiro[linha][coluna] == 7 ) {
						cont7++;
					}
					if(tabuleiro[linha][coluna] == 8 ) {
						cont8++;
					}
					if(tabuleiro[linha][coluna] == 9 ) {
						cont9++;
					}

					if (tabuleiro[linha][coluna] < 0 || tabuleiro[linha][coluna] > 9) {
						coluna--;
						System.out.println("incorreto, repita com o valor adequado");
					}

				}
			}
			for (int linha = 0; linha < 9; linha++) {
				for (int coluna = 0; coluna < 9; coluna++) {
					somaJogo += tabuleiro[linha][coluna];
					if (coluna == 0) {
						somaColuna1 += tabuleiro[linha][coluna];
					}
					if (coluna == 1) {
						somaColuna2 += tabuleiro[linha][coluna];
					}
					if (coluna == 2) {
						somaColuna3 += tabuleiro[linha][coluna];
					}
					if (coluna == 3) {
						somaColuna4 += tabuleiro[linha][coluna];
					}
					if (coluna == 4) {
						somaColuna5 += tabuleiro[linha][coluna];
					}
					if (coluna == 5) {
						somaColuna6 += tabuleiro[linha][coluna];
					}
					if (coluna == 6) {
						somaColuna7 += tabuleiro[linha][coluna];
					}
					if (coluna == 7) {
						somaColuna8 += tabuleiro[linha][coluna];
					}
					if (coluna == 8) {
						somaColuna9 += tabuleiro[linha][coluna];
					}
					if (linha == 0) {
						somaLinha1 += tabuleiro[linha][coluna];
					}
					if (linha == 1) {
						somaLinha2 += tabuleiro[linha][coluna];
					}
					if (linha == 2) {
						somaLinha3 += tabuleiro[linha][coluna];
					}
					if (linha == 3) {
						somaLinha4 += tabuleiro[linha][coluna];
					}
					if (linha == 4) {
						somaLinha5 += tabuleiro[linha][coluna];
					}
					if (linha == 5) {
						somaLinha6 += tabuleiro[linha][coluna];
					}
					if (linha == 6) {
						somaLinha7 += tabuleiro[linha][coluna];
					}
					if (linha == 7) {
						somaLinha8 += tabuleiro[linha][coluna];
					}
					if (linha == 8) {
						somaLinha9 += tabuleiro[linha][coluna];
					}

				}
			}
			if(somaColuna1 == 45 && somaColuna2 == 45 && somaColuna3 == 45 && somaColuna4 == 45 && somaColuna5 == 45 && somaColuna6 == 45 && somaColuna7 == 45 && somaColuna8 == 45 && somaColuna9 == 45 && somaLinha1 == 45 &&
					somaLinha2 == 45 && somaLinha3 == 45 && somaLinha4 == 45 && somaLinha5 == 45 && somaLinha6 == 45 && somaLinha7 == 45 && somaLinha8 == 45 && somaLinha9 == 45 && somaJogo == 405 && 
					cont1 == 9 && cont2 == 9 && cont3 == 9 && cont4 == 9 && cont5 == 9 && cont6 == 9 &&cont7 == 9 && cont8 == 9 && cont9 == 9)  {
				certo = true;
			}

			
	

			System.out.println("Sudoku "+ (jogadas + 1) + ": " +jogadores[jogadas]);
			if( certo == true) {
				System.out.println("SIM");
			}
			else {
				System.out.println("NÃO");
			}
			for (int linha = 0; linha < 9; linha++) {
				for (int coluna = 0; coluna < 9; coluna++) {
					System.out.print(tabuleiro[linha][coluna] + " ");
					if( coluna == 2 || coluna == 5 || coluna == 8 ) {
						System.out.print("|");
					}
				}
				System.out.println("\n");
				if (linha == 2  || linha == 5 || linha == 8) {
					System.out.print("_____________________"+ "\n" + "\n");
				}
				}
			
	
	}

	}
}

