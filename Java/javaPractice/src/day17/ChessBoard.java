package day17;

public class ChessBoard {
    private ChessPiece[][] chessBoard;

    public ChessBoard(ChessPiece[][] chessBoard) {
        this.chessBoard = chessBoard;
    }

    public void print() {
        for (ChessPiece[] line: chessBoard) {
            for (ChessPiece piece: line) System.out.print(piece.getRepresentation());
            System.out.println();
        }
    }
}
