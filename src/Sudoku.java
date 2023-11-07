import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

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

		do {
			System.out.println("Digite a quantidade de jogadores que irao jogar Sudoku");
			quantidade = sc.nextInt();
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
			
			for (int linha = 0; linha < 9; linha++) {
				for (int coluna = 0; coluna < 9; coluna++) {
					tabuleiro[linha][coluna] = 0;
				}
				}
			
			System.out.println("Jogador " + jogadores[jogadas] + "preencha o seu Sudoku");
			for (int linha = 0; linha < 9; linha++) {
				for (int coluna = 0; coluna < 9; coluna++) {
					tabuleiro[linha][coluna] = sc.nextInt();

					if (tabuleiro[linha][coluna] < 0 || tabuleiro[linha][coluna] > 9) {
						coluna--;
					}
					for (int linha1 = 0; linha1 < 9; linha1++) {
						for (int coluna1 = 0; coluna1 < 9; coluna1++) {
							System.out.print("[" + tabuleiro[linha1][coluna1] + "] ");
						}
						System.out.println("\n");
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
					somaLinha2 == 45 && somaLinha3 == 45 && somaLinha4 == 45 && somaLinha5 == 45 && somaLinha6 == 45 && somaLinha7 == 45 && somaLinha8 == 45 && somaLinha9 == 45 && somaJogo == 405)  {
				certo = true;
			}

			for (int linha = 0; linha < 9; linha++) {
				for (int coluna = 0; coluna < 9; coluna++) {
					if (linha < 8) {
						if (tabuleiro[linha][0] == tabuleiro[linha + 1][0]) {
							erro = true;
						}
					}
				}
			}
			if (erro == true) {
				System.out.println("erro");
			}
			if( certo == true && erro == false) {
				System.out.println("Acertou");
			}
		}
	
	}

}