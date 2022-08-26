package HW_5.figures;

public class Circle implements GeometryInterface{
    private final double r;

    public Circle(int r) {
        if (r <= 0) {
            throw new ArithmeticException("Радиус не может быть равен 0 или быть отрицательным!");
        }
        this.r = r;
    }

    @Override
    public double squareCalculator() {
        return r * r * Math.PI;
    }

    public double getR() {
        return r;
    }
}
