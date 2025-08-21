public class Car extends Vehicle {
    private int doors;

    public Car(int wheels, float price, int doors) {
        this.price = price;
        this.wheels = wheels;
        this.doors = doors;
    }

    public Car(Car car) {
        super(car);
        if (car != null) {
            this.doors = car.doors;
        }
    }

    @Override
    public Vehicle clone() {
        return new Car(this);
    }

    @Override
    public void isCloneOf(Vehicle vehicle) {
        if (vehicle instanceof Car car) {
            if (wheels == car.wheels && price == car.price && doors == car.doors) {
                System.out.println(this + " y " + car + " son clones");
                return;
            }
        }
        System.out.println(this + " y " + vehicle + " NO son clones");
    }
}
