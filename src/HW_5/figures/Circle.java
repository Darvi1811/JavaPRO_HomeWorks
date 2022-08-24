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
        double pi = 3.141592653589793;
        return r * r * pi;
    }
}
