package HW_10;

public class Main {
    public static void main(String[] args) {
        ThreadSafeList<Double> threadSafeList = new ThreadSafeList<>();
        new Thread(() -> threadSafeList.add(100.0)).start();
        new Thread(() -> threadSafeList.add(175.0)).start();
        new Thread(() -> threadSafeList.add(50.0)).start();
        new Thread(() -> threadSafeList.add(75.0)).start();
        System.out.println(threadSafeList);
        new Thread(() -> threadSafeList.remove(175.0)).start();
        new Thread(() -> threadSafeList.remove(50.0)).start();
        new Thread(() -> threadSafeList.get(1)).start();
        System.out.println(threadSafeList);
        Double a = threadSafeList.get(1);
        System.out.println(a);


        PetrolStation petrolStation = new PetrolStation();
        petrolStation.doRefuel(1000.0);
        petrolStation.doRefuel(2000.0);
        petrolStation.doRefuel(4000.0);
        petrolStation.doRefuel(1000.0);
        petrolStation.doRefuel(1000.0);
        petrolStation.doRefuel(1000.0);
        petrolStation.doRefuel(1000.0);
        petrolStation.doRefuel(1000.0);

    }
}
