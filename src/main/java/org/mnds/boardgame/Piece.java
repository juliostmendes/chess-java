package org.mnds.boardgame;

public class Piece {
    protected Position position;
    private Board board;

    public Piece(Board board) {
        this.board = board;
    }

    protected Position getPosition() {
        return position;
    }
}
