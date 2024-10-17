package boardGame;

public class Board {
    private int row;
    private int colums;
    private Piece[][] pieces;

    public Board() {
    }

    public Board(int row, int colums) {
        this.row = row;
        this.colums = colums;
        pieces = new Piece[row][colums];
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColums() {
        return colums;
    }

    public void setColums(int colums) {
        this.colums = colums;
    }

    public Piece piece (int row, int colum){
        return pieces[row][colum];
    }

    public Piece piece (Position position){
        return pieces[position.getRow()][position.getColum()];
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
