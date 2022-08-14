package HW_4;

public abstract class Animal {
    protected String name;
    private static int ANIMAL_COUNT;

    protected abstract void run(int len);
    protected abstract void swim(int len);

    public static int getAnimalCount() {
        return ANIMAL_COUNT;
    }

    public Animal(String name) {
        this.name = name;
        ANIMAL_COUNT++;
    }
}
