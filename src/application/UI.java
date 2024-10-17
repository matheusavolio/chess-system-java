package application;
import chess.ChessPiece;

public class UI {

    public static void printBoard(ChessPiece[][] pieces){
        for (int i=0; i<pieces.length;i++){
            System.out.print((8 - i) + " ");
            for (int j=0;j<pieces.length;j++){
                printPiece(pieces[i][j]);
            }
            System.out.println();
        }
        System.out.println("  a b c d e f g h ");
    }

    private static void printPiece(ChessPiece piece){
        if (piece == null){
            System.out.print("-");
        }
        else {
            System.out.print(piece);
        }
        System.out.print(" ");
    }

// Checklist:
    //  Methods:
        // Board.Piece(row, column) and Board.Piece(position)
    //  Enum Chess.Color
    //  Class Chess.ChessPiece [public]
    //  Class Chess.ChessMatch [public]
    //  Class ChessConsole.UI
    //  OOP Topics:
        // o Enumerations
        // o Encapsulation / Access Modifiers
        // o Inheritance
        // o Downcasting
        // o Static members
        // o Layers pattern
    //  Data Structures Topics:
        // o Matriz
}
