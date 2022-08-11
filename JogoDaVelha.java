package JogoDaVelha;
import java.util.Scanner;
public class JogoDaVelha extends JV{

	public static void main(String[] args) {
		JV JogoDaVelha = new JV();
		Scanner sc = new Scanner(System.in);
		String opcao;
		int jogador = 0, jogadas = 0;
		
		while(true) {
			do {//Jogador 1 ----------------------------------------------------------------------------------------------------
				JogoDaVelha.mostrar();
				System.out.println("Jogador 1, escolha sua jogada: ");
				opcao = sc.nextLine();
				while(!JogoDaVelha.verificar(opcao)) {
					System.out.println("Opção inválida, tente novamente! \n");
					System.out.println("Jogador 1, escolha sua jogada: ");
					opcao = sc.nextLine();
					jogador = 0;
				}
				
				JogoDaVelha.jogada(opcao, "X");
				jogador = 1;	
				
			}while (jogador == 0);//fim Jogador 1 -----------------------------------------------------------------------------
			
			jogadas++;
			if(!JogoDaVelha.vencedor(jogadas).equals("null")) {
				break;
			}
			
			do {//Jogador 2 ---------------------------------------------------------------------------------------------------
				JogoDaVelha.mostrar();
				System.out.println("Jogador 2, escolha sua jogada: ");
				opcao = sc.nextLine();
				while(!JogoDaVelha.verificar(opcao)) {
					System.out.println("Opção inválida, tente novamente! \n");
					System.out.println("Jogador 2, escolha sua jogada: ");
					opcao = sc.nextLine();
					jogador = 1;
				}
				
				JogoDaVelha.jogada(opcao, "O");
				jogador = 0;
			}while (jogador == 1);//fim jogador 2 ---------------------------------------------------------------------------
			
			jogadas++;
			if(!JogoDaVelha.vencedor(jogadas).equals("null")) {
				break;
			}
			
			
		}
		System.out.println(JogoDaVelha.vencedor(jogadas));
		
	}

}
