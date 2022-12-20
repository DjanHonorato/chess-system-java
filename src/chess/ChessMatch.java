package chess;

import boardgame.Board;
import boardgame.Position;
import chess.pieces.Rook;
import chess.pieces.king;

public class ChessMatch {
	
	private Board board;
	
	public ChessMatch() {
		
		board = new Board(8,8);
		initialSetup();
	}
	
	public ChessPiece[][] getPieces(){
		
		ChessPiece[][] mat = new ChessPiece[board.getRow()][board.getColumns()];
		for (int i=0; i<board.getRow();i++) {
			for (int j=0;j<board.getColumns();j++) {
				mat[i][j] = (ChessPiece) board.piece(i,j);
			}
		}
		return mat;
	}
	
	private void initialSetup() {
		board.placePiece(new Rook(board,Color.white),new Position(2,1));
		board.placePiece(new king(board, Color.black), new Position(0,4));
		board.placePiece(new king(board, Color.white), new Position(7,4));
	}

}
