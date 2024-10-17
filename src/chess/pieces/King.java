package chess.pieces;

import boardGame.Board;
import chess.ChessPiece;
import chess.enums.Color;

public class King extends ChessPiece {
    public King(Board board, Color color){
        super(board, color);
    }

    @Override
    public String toString(){
        return "K";
    }
}
