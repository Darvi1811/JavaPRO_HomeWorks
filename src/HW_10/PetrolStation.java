package HW_10;

import java.util.concurrent.Semaphore;

public class PetrolStation {
    volatile Double amount = 10000.0;
    private static final Semaphore semaphore = new Semaphore(3, true);

    public void doRefuel(Double fuel) {
        Runnable task = () -> {
            try {
                semaphore.acquire();
                int time = (int) ((Math.random() * (10 - 3 + 1) + 3) * 1000);
                synchronized (amount) {
                    if (amount >= fuel) {
                        amount = amount - fuel;
                        System.out.println("Заправка прошла успешно. Количество топлива - " + amount + ".");
                    } else {
                        System.out.println("Недостаточно топлива, чтобы заправить.");
                    }
                }
                Thread.sleep(time);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } finally {
                semaphore.release();
            }
        };
        new Thread(task).start();
    }
}