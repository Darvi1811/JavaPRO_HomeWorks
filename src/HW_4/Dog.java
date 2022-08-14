package HW_4;

public class Dog extends Animal {
    private static int DOG_COUNT;

    public Dog(String name) {
        super(name);
        DOG_COUNT++;
    }

    @Override
    protected void run(int len) {
        if (len<=500 & len>0) {
            System.out.println(name + " пробежал(а) " + len + " м.");
        } else {
            System.out.println(name + " не может столько пробежать.");
        }
    }

    @Override
    protected void swim(int len) {
        if (len<=10 & len>0) {
            System.out.println(name + " проплыл(а) " + len + " м.");
        } else {
            System.out.println(name + " не может столько проплыть.");
        }
    }

    public static int getDogCount() {
        return DOG_COUNT;
    }
}
