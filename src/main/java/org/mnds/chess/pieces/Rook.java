package org.mnds.chess.pieces;

import org.mnds.boardgame.Board;
import org.mnds.chess.ChessPiece;
import org.mnds.chess.Color;

public class Rook extends ChessPiece {
    public Rook(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString(){
        return "R";
    }
}
