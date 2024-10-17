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
}
