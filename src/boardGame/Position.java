package boardGame;

public class Position {
    private int row;
    private int colum;

    public Position() {
    }

    public Position(int row, int colum) {
        this.row = row;
        this.colum = colum;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColum() {
        return colum;
    }

    public void setColum(int colum) {
        this.colum = colum;
    }

    @Override
    public String toString(){
        return row + ", " + colum;
    }
}

// First class: Position
// Checklist:
    //  Class Position [public]
//  OOP Topics:
// o Encapsulation
// o Constructors
// o ToString (Object / overriding)
