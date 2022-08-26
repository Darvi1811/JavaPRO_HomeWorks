package HW_5.figures;

public class Triangle implements GeometryInterface{
    private final double a;
    private final double b;
    private final double c;

    public Triangle(double a, double b, double c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new ArithmeticException("Сторона не может быть равна 0 или быть отрицательной!");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double squareCalculator() {
        double pHalf = (a+b+c)/2;
        return ((pHalf-a)*(pHalf-b)*(pHalf-c));
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }
}
