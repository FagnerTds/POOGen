package LojaGames;

public class TestaGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Produtos p1 = new Produtos("Jogo","GTA", 2565, 11, 182.50);
		Produtos p2 = new Produtos("console","Xbox Series s", 2565, 7, 1832.50);

		
		p1.visualizar();
		p2.visualizar();


	}

}
