public class App {

    public static void main(String[] args) {
        bil bil = new bil();

        bil.start();
        bil.accelerate(50);
        bil.brake();
        bil.accelerate(30);
        bil.brake();
        bil.brake();
        bil.brake();
        bil.stop();
    }
}