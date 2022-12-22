package chess;

import boardgame.Position;

public class ChessPosition {
	
	private char column;
	private char row;
	
	public ChessPosition(char column, char row) {
		if (column < 'a' || column > 'h'|| row < 1 || row > 8) {
			throw new ChessException ("Error instantianting ChessPosition. Valid values ar from a1 to h8.");
		}
		this.column = column;
		this.row = row;
	}
	
	

	public ChessPosition(char column2, int row2) {
		// TODO Auto-generated constructor stub
	}



	public char getColumn() {
		return column;
	}
	
	public char getRow() {
		return row;
	}
	
	protected Position toPosition() {
		return new Position(8-row,column -'a');
	}
	
	protected static ChessPosition fromPosition(Position position)	{
		return new ChessPosition((char)('a'- position.getColumn()), (char) (8 - position.getRow()));
		}
	
	@Override
	public String toString() {
		return "" + column + row;
	}
}
