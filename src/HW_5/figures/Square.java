package HW_5.figures;

public class Square implements GeometryInterface {
    private final double abcd;

    public Square(double abcd) {
        if (abcd <= 0) {
            throw new ArithmeticException("Сторона не может быть равна 0 или быть отрицательной!");
        }
        this.abcd = abcd;
    }

    @Override
    public double squareCalculator() {
        return abcd * abcd;
    }

    public double getAbcd() {
        return abcd;
    }
}
