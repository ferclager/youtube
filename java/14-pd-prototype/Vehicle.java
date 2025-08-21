public abstract class Vehicle {
    public int wheels;
    public float price;

    public Vehicle() {
    }

    public Vehicle(Vehicle vehicle) {
        if (vehicle != null) {
            this.wheels = vehicle.wheels;
            this.price = vehicle.price;
        }
    }

    public abstract Vehicle clone();

    public abstract void isCloneOf(Vehicle vehicle);
}
