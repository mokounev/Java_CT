
public class Board {
	
	private Piece[][] board;
	
	public Board(int rows, int cols) {
		
		board = new Piece[rows][cols];
	}
	
	public Piece[][] getBoard() {
		return board;
	}
	
	/* public boolean isValidMove(int[] move) {
		
		try {
			
			if (board[move[0]][move[1]] == null) {
				
				return true;
				
			} else {
				
				return false;
				
			} catch (ArrayIndexOutOfBoundsException e) 	{
				
				throw new moveNotValid(e.getMessage());
			}
		} */
	
	
	public void updateBoard(int[] move, Piece piece) {
		
		board[move[0]][move[1]] = piece;
	}

}
