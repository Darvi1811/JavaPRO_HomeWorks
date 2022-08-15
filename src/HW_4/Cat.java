package HW_4;

public class Cat extends Animal {
    private static int CAT_COUNT;

    public Cat(String name) {
        super(name);
        CAT_COUNT++;
    }

    @Override
    public void run(int len) {
        if (len<=200 & len>0) {
            System.out.println(name + " пробежал(а) " + len + " м.");
        } else {
            System.out.println(name + " не может столько пробежать.");
        }
    }

    @Override
    public void swim(int len) {
        System.out.println("Кошки и коты не умеют плавать.");
    }

    public static int getCatCount() {
        return CAT_COUNT;
    }
}
