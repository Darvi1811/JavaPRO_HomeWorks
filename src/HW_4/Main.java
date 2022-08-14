package HW_4;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog("Бобик");
        dog.run(150);
        dog.swim(10);
        dog.run(501);
        dog.run(-501);
        dog.swim(20);
        dog.swim(-20);
        Animal cat = new Cat("Рыжик");
        cat.run(150);
        cat.swim(10);
        cat.run(201);
        cat.run(-201);

        System.out.println(Animal.getAnimalCount());
        System.out.println(Dog.getDogCount());
        System.out.println(Cat.getCatCount());
    }
}
