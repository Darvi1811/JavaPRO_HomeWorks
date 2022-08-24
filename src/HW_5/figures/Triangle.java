package HW_5.figures;

public class Triangle implements GeometryInterface{
    private final double a;
    private final double h;

    public Triangle(double a, double h) {
        if (a <= 0 || h <= 0) {
            throw new ArithmeticException("Радиус не может быть равен 0 или быть отрицательным!");
        }
        this.a = a;
        this.h = h;
    }

    @Override
    public double squareCalculator() {
        return (a * h) / 2;
    }

}
