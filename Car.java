public class Car {
    int noOfWheels;

    String colour;

    float maxSpeed;

    float currentFuelInLiters;

    int noOfSeats;

    public Car start() {
        if (currentFuelInLiters == 0) {
            System.out.println("Car is out of fuel , can not start");
        } else if (currentFuelInLiters < 5) {
            System.out.println("Car is in reserved mode , please refuel");
        } else {
            System.out.println("Car is started ... bruhhhh...");
            currentFuelInLiters--;

        }
        return this;

    }

    public void drive() {
        currentFuelInLiters--;
        System.out.println("Car is driving");
    }

        public void addFuel(float fuel) {
            currentFuelInLiters += fuel;
        }
        public float getCurrentFuelLevel() {
            return currentFuelInLiters;
        }
    }

