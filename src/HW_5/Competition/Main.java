package HW_5.Competition;


@SuppressWarnings("ALL")
public class Main {
    public static void main(String[] args) {
        Participant[] participants = new Participant[3];
        participants[0] = new Human("Артём", 1, 1);
        participants[1] = new Cat("Рыжик", 1, 0);
        participants[2] = new Robot("R10D10", 10, 10);

        Obstacle[] obstacles = new Obstacle[4];
        obstacles[0] = new Treadmill(1);
        obstacles[1] = new Wall(1);
        obstacles[2] = new Treadmill(2);
        obstacles[3] = new Wall(2);


        for (Participant participant:
             participants) {
            for (Obstacle obstacle :
                    obstacles) {
                if (participant.overcome(obstacle)) {
                } else {
                    break;
                }
            }
        }
    }
}
