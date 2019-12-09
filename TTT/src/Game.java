import java.util.Scanner;

public class Game {
	
	private Player[] players;
	private Player currentPlayer;
	private View view;
	private Board board;
	
	public Game() {
		players = new Player[2];
		view = new View();
		
	}
	
	public Player[] getPlayers() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Player 1, please enter your name.");
		String player1Name = scan.nextLine();
		System.out.println("Player 2, please enter your name.");
		String player2Name = scan.nextLine();
		
		Player player1 = new Player(player1Name, Piece.XPIECE);
		Player player2 = new Player(player2Name, Piece.OPIECE);
		
		players[0] = player1;
		players[1] = player2;
		
		return players;
	}
	
	public Player getCurrentPlayer() {
		
		currentPlayer = players[0];
		
		return currentPlayer;
	}
	
	public View getView() {
		
		return view;
	}
	
	public Board getBoard() {
		
		return board;
	}
	
	public void startGame() {
		
		getPlayers();
		
		System.out.println("\n" + players[0].getName() + ", you are X!");
		System.out.println(players[1].getName() + ", you are O!");
		System.out.println("Let's play Tic Tac Toe!!");
		
		
	}
	

}
