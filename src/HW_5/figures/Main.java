package HW_5.figures;

public class Main {
    public static void main(String[] args) {
        GeometryInterface[] geometryInterfaces = new GeometryInterface[10];
        geometryInterfaces[0] = new Square(20);
        geometryInterfaces[1] = new Square(30);
        geometryInterfaces[2] = new Square(40);
        geometryInterfaces[3] = new Square(50);
        geometryInterfaces[4] = new Circle(10);
        geometryInterfaces[5] = new Circle(20);
        geometryInterfaces[6] = new Circle(30);
        geometryInterfaces[7] = new Triangle(10, 10, 10);
        geometryInterfaces[8] = new Triangle(20, 30, 40);
        geometryInterfaces[9] = new Triangle(30, 40, 50);

        sumGeometryInterfaces(geometryInterfaces);

    }
    public static void sumGeometryInterfaces(GeometryInterface[] array) {
        double sum = 0;
        for (GeometryInterface geometryInterfaces : array) {
            if (geometryInterfaces == null) {
                break;
            }
            sum += geometryInterfaces.squareCalculator();
        }
        System.out.println("Сумма площадей всех фигур " +  sum + " мм²");
    }
}
