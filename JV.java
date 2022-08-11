package JogoDaVelha;

public class JV {
	private String[][] play = {{"1","2","3"},
					   		   {"4","5","6"},
					   		   {"7","8","9"}}; 
	
	void mostrar(){
		System.out.print("|======Jogo da Velha======|");
		for (int li = 0; li < 3; li++) {
			System.out.println("\n");
			for (int co = 0; co < 3; co++) {
				System.out.print("      " + play[li][co]);
			}
			System.out.println();
		}
	}
	
	void jogada(String posicao, String player) {
		if(posicao.equals("1")) {
			play[0][0] = player;
		} else if(posicao.equals("2")) {
			play[0][1] = player;
		}else if(posicao.equals("3")) {
			play[0][2] = player;
		}else if(posicao.equals("4")) {
			play[1][0] = player;
		}else if(posicao.equals("5")) {
			play[1][1] = player;
		}else if(posicao.equals("6")) {
			play[1][2] = player;
		}else if(posicao.equals("7")) {
			play[2][0] = player;
		}else if(posicao.equals("8")) {
			play[2][1] = player;
		}else if(posicao.equals("9")) {
			play[2][2] = player;
		}
	}
	
	boolean verificar(String posicao) {
		for (int li = 0; li < 3; li++) {
			for (int co = 0; co < 3; co++) {
				if(play[li][co].equals(posicao)) {					
					return true;
				}
			}
		}
		return false;
	}
	
	String vencedor(int jogadas){
		String vencedor = "null";
		if(jogadas == 9) {
			vencedor = "EMPATE";
		}
		String[] winner = new String[8];
		winner[0] = play[0][0] + play[0][1] + play[0][2];
		winner[1] = play[1][0] + play[1][1] + play[1][2];
		winner[2] = play[2][0] + play[2][1] + play[2][2];		
		winner[3] = play[0][0] + play[1][0] + play[2][0];
		winner[4] = play[0][1] + play[1][1] + play[2][1];
		winner[5] = play[0][2] + play[1][2] + play[2][2];
		winner[6] = play[0][0] + play[1][1] + play[2][2];
		winner[7] = play[0][2] + play[1][1] + play[2][0];
		
		for (int i = 0; i < winner.length; i++) {
			if (winner[i].equals("XXX")) {
				vencedor = "Jogador 1 é o vencedor!";
			} else if (winner[i].equals("OOO")) {
				vencedor = "Jogador 2 é o vencedor!";
			}
		}
		return vencedor;
	}
	
	
}


