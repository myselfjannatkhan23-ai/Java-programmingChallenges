public class Driver {
    public static void main(String[] args) {
        Car swift = new Car();
        swift.addFuel(6);
        Car startedCar = swift.start();
        swift.drive();
    }
}
