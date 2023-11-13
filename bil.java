public class bil implements Fordon {

    private boolean isRunning;
    private int currentSpeed;

    public bil() {
        this.isRunning = false;
        this.currentSpeed = 0;
    }

    @Override
    public void start() {
        if (!isRunning) {
            isRunning = true;
            System.out.println("Bilen har startat.");
        } else {
            System.out.println("Bilen är redan igång.");
        }
    }

    @Override

    public void accelerate(int speed) {
        if (isRunning) {
            currentSpeed += speed;
            System.out
                    .println("Bilen accelererar med " + speed + " km/h. Aktuell hastighet: " + currentSpeed + " km/h.");
        } else {
            System.out.println("Bilen är inte igång. Kan inte accelerera.");
        }
    }

    @Override
    public void brake() {
        if (currentSpeed > 0) {
            currentSpeed -= 10;
            System.out.println("Bromsningen gick bra. Aktuell hastighet: " + currentSpeed + " km/h.");
        } else {
            System.out.println("Bilen står redan stilla. Kan inte bromsa mer.");
        }
    }

    @Override
    public void stop() {
        isRunning = false;
        currentSpeed = 0;
        System.out.println("Bilen har stoppat.");
    }
}
