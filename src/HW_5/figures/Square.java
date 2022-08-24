package HW_5.figures;

public class Square implements GeometryInterface {
    private final double abcd;

    public Square(double abcd) {
        if (abcd <= 0) {
            throw new ArithmeticException("Радиус не может быть равен 0 или быть отрицательным!");
        }
        this.abcd = abcd;
    }

    @Override
    public double squareCalculator() {
        return abcd * abcd;
    }
}
