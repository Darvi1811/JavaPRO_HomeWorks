package HW_5.Competition;

public abstract class Participant {
        protected String name;
        protected int maxRun;
        protected int maxJump;
        private boolean isDisqualified;

        public Participant(String name, int maxRun, int maxJump) {
                this.name = name;
                this.maxRun = maxRun;
                this.maxJump = maxJump;
        }

        public void jump(Obstacle obstacle) {
                String obstacleName = "Treadmill";
                if (((Treadmill) obstacle).getLength()>maxRun) {
                        isDisqualified = false;
                        String message = String.format("Участник %s не прошел препятствие %s на дистанции %d м! Пройдено %d м.",
                                this.getName(), obstacleName, ((Treadmill) obstacle).getLength(), this.getMaxRun());
                        System.out.println(message);
                } else if (((Treadmill) obstacle).getLength() <= maxRun) {
                        isDisqualified = true;
                        String message = String.format("Участник %s прошел препятствие %s на дистанции %d м!",
                                this.getName(), obstacleName, ((Treadmill) obstacle).getLength());
                        System.out.println(message);
                }
        }

        public void run(Obstacle obstacle) {
                String obstacleName = "Wall";
                if (((Wall) obstacle).getHeight()>maxJump) {
                        isDisqualified = false;
                        String message = String.format("Участник %s не прошел препятствие %s на дистанции %d м! Пройдено %d м.",
                                this.getName(), obstacleName, ((Wall) obstacle).getHeight(), this.getMaxJump());
                        System.out.println(message);
                } else if (((Wall) obstacle).getHeight() <= maxJump) {
                        isDisqualified = true;
                        String message = String.format("Участник %s прошел препятствие %s на дистанции %d м!",
                                this.getName(), obstacleName, ((Wall) obstacle).getHeight());
                        System.out.println(message);
                }
        }

        boolean overcome(Obstacle obstacle) {
                if (obstacle instanceof Wall) {
                        this.run(obstacle);
                } else if (obstacle instanceof Treadmill) {
                        this.jump(obstacle);
                }
                return isDisqualified;
        }

        public String getName() {
                return name;
        }

        public int getMaxRun() {
                return maxRun;
        }

        public int getMaxJump() {
                return maxJump;
        }
}
