package boardGame;

public class Piece {
    protected Position position;
    private Board board;

    public Piece() {
    }

    public Piece(Board board) {
        this.board = board;
        position = null;
    }

    protected Board getBoard() {
        return board;
    }
    // Starting to implement Board and Piece
// Checklist:
//  Classes Piece, Board [public]
    //  OOP Topics:
        // o Associations
        // o Encapsulation / Access Modifiers
    //  Data Structures Topics:
        // o Matrix


}
