package boardgame;

public class Board {
	
	private int row;
	private int columns;
	private Piece[][] pieces;
	public Board(int row, int columns) {
		if (row < 1 || columns <1) {
			throw new BoardException("Error creating board: ther must be at least 1 row and 1 column");
			
		}
		this.row = row;
		this.columns = columns;
		pieces = new Piece[row][columns];
	}
	public int getRow() {
		return row;
	}
	
	public int getColumns() {
		return columns;
	}
		
	public Piece piece(int row, int column) {
		
		if (!positionExists(row,column)) {
			throw new BoardException("Position not on the board");
		}
		return pieces[row][column];
		
	}
	
	public Piece piece(Position position) {
		
		if (!positionExists(position)) {
			throw new BoardException("Position not on the board");
		}
		return pieces[position.getRow()][position.getColumn()];
	}
	
	public void placePiece(Piece piece,Position position) {
		
		if (thereIsAPiece(position)) {
			throw new BoardException("There is already a piece on position " + position);
			
		}
		 
		pieces[position.getRow()][position.getColumn()] = piece;
		piece.position = position;
	}
	
	private boolean positionExists(int row,int column) {
		return row >= 0 && row < row && column >= 0 && column < columns; 
	}
	
	public boolean positionExists(Position position) {
		
		return positionExists(position.getRow(),position.getColumn());
		
	}
	
	public boolean thereIsAPiece(Position position) {
		if (!positionExists(position)) {
			throw new BoardException("Position not on the board");
		}
		return piece(position) != null;
	}
			
}
