package prueba1;

public class PlayerPiece {
	private BoardSquare currentPosition;

	public BoardSquare getCurrentPosition() {
		return currentPosition;
	}

	public void setCurrentPosition(BoardSquare currentPosition) {
		this.currentPosition = currentPosition;
	}
	public void moveTo(BoardSquare bs) {
		System.out.println("playerpiece");
	}
	
	

}
