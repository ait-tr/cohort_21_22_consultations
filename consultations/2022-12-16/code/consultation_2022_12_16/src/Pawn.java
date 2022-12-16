public class Pawn extends Figure {
    private Board board;

    public Pawn(String color, Board board) {
        super(color);
        this.board = board;
    }

    @Override
    public Boolean canGo(int x1, int x2, int y1, int y2) {
        // здесь будет проверка
        return true;
    }
}
