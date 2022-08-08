package HW_3;

public class Car {
    void start() {
        startElectricity();
        startCommand();
        startFuelSystem();
    }

    private void startElectricity() {
        System.out.println("startElectricity");
    }

    private void startCommand() {
        System.out.println("startCommand");
    }

    private void startFuelSystem() {
        System.out.println("startFuelSystem");
    }
}
