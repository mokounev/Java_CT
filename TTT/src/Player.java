
public class Player {
	
	private String name;
	private Score score;
	private Piece piece;
	
	public Player(String name, Piece piece) {
		
		this.name = name;
		this.piece = piece;
		score = new Score();
		
	}
	
	public String getName() {
		
		return name;
	}

	public Score getScore() {
		
		return score;
	}
	
	public Piece getPiece() {
		
		return piece;
	}
	
	public int[] doMove(int rowNumber, int colNumber) {
		
		int[] move = new int[] { rowNumber, colNumber };
		
		return move;
		
	}
	
	public boolean exitGame() {
		
		return false;
	}
	
	
}
