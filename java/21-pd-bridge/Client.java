public class Client {
    public static void main(String[] args) {
       Color green = new Green();
       Color blue = new Blue();

       Shape greenCircle = new Circle(green);
       Shape greenSquare = new Square(green);
       Shape blueCircle = new Circle(blue);

       greenCircle.draw();
       greenSquare.draw();
       blueCircle.draw();
    }
}
