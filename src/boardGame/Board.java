package boardGame;

public class Board {

    private int row;
    private int colums;
    private Piece[][] pieces;


    public Board(int rows, int column) {
        if (rows < 1 || column <1){
            throw new BoardException("Error creating board: there must be at least 1 row and 1 column.");
        }
        this.row = rows;
        this.colums = column;
        pieces = new Piece[row][colums];
    }

    public int getRow() {
        return row;
    }

    public int getColum() {
        return colums;
    }

    public Piece piece(int rows, int column) {
        if (!positionExists(rows, column)){
            throw new BoardException("Position not on the board.");
        }
        return pieces[rows][column];
    }

    public Piece piece(Position position) {
        if (!positionExists(position)){
            throw new BoardException("Position not on the board.");
        }
        return pieces[position.getRow()][position.getColum()];
    }

    public void placePiece(Piece piece, Position position) {
        if (thereIsAPiece(position)){
            throw new BoardException("There is already a piece on position " +position);
        }
        pieces[position.getRow()][position.getColum()] = piece;
        piece.position = position;
    }

    private boolean positionExists(int rows, int column){
        return rows >= 0 && rows < row && column >= 0 && column < colums;
    }

    public boolean positionExists(Position position) {
        return positionExists(position.getRow(), position.getColum());
    }

    public boolean thereIsAPiece(Position position){
        if (!positionExists(position)){
            throw new BoardException("Position not on the board. ");
        }
        return piece(position) != null;
    }
}

