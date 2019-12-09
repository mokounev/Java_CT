
public enum Piece {

	XPIECE("x"), OPIECE("o");

	public final String pieceName;

	private Piece(String pieceName) {
		this.pieceName = pieceName;

	}

	public String getPiece() {

		return pieceName;
	}

}
