public class Bicyle extends Vehicle {
    private boolean mountainBike;

    public Bicyle(int wheels, float price, boolean mountainBike) {
        this.mountainBike = mountainBike;
        this.wheels = wheels;
        this.price = price;
    }

    public Bicyle(Bicyle bicyle) {
        super(bicyle);
        if (bicyle != null) {
            this.mountainBike = bicyle.mountainBike;
        }
    }

    @Override
    public Vehicle clone() {
        return new Bicyle(this);
    }

    @Override
    public void isCloneOf(Vehicle vehicle) {
        if (vehicle instanceof Bicyle bicyle) {
            if (wheels == bicyle.wheels && price == bicyle.price && mountainBike == bicyle.mountainBike) {
                System.out.println(this + " y " + bicyle + " son clones");
                return;
            }
        }
        System.out.println(this + " y " + vehicle + " NO son clones");
    }
}
