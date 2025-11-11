import net.datafaker.Faker;

public class CustomFaker extends Faker {
    public Email email;

    public CustomFaker() {
        super();
        email = new Email(this);
    }
}
