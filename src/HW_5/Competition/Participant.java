package HW_5.Competition;

public abstract class Participant {
        protected String name;
        protected int maxRun;
        protected int maxJump;
        public boolean isOvercome;

        public Participant(String name, int maxRun, int maxJump) {
                this.name = name;
                this.maxRun = maxRun;
                this.maxJump = maxJump;
        }

        public void jump() {
                System.out.println(name + " прыгает");
        }

        public void run() {
                System.out.println(name + " бежит");
        }

        void overcome(Obstacle obstacle) {
                if (obstacle instanceof Wall) {
                        String obstacleName = "Wall";
                        if (((Wall) obstacle).height>maxJump) {
                                isOvercome = false;
                                System.out.println("Участник " + name + " не прошел препятствие " + obstacleName + " на дистанции " + ((Wall) obstacle).height + " м! Пройдено " + maxJump + " м.");
                        } else if (((Wall) obstacle).height <= maxJump) {
                                isOvercome = true;
                                System.out.println("Участник " + name + " прошел препятствие " + obstacleName + " на дистанции " + ((Wall) obstacle).height + " м!");
                        }
                } else if (obstacle instanceof Treadmill) {
                        String obstacleName = "Treadmill";
                        if (((Treadmill) obstacle).length>maxRun) {
                                isOvercome = false;
                                System.out.println(("Участник " + name + " не прошел препятствие " + obstacleName + " на дистанции " + ((Treadmill) obstacle).length + " м! Пройдено " + maxRun + " м."));
                        } else if (((Treadmill) obstacle).length <= maxRun) {
                                isOvercome = true;
                                System.out.println("Участник " + name + " прошел препятствие " + obstacleName + " на дистанции " + ((Treadmill) obstacle).length + " м!");
                        }
                }
        }
}
