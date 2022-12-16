public class Knight extends Figure { // фигура Конь -- разновидность Фигуры
    public Knight(String color) {
        super(color);
    }
    @Override
    public Boolean canGo(int x1, int x2, int y1, int y2) {
        // здесь будет проверка для хода буквой L
        return true;
    }
}
