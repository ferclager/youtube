import net.datafaker.Faker;
import net.datafaker.providers.base.AbstractProvider;

public class Email extends AbstractProvider<Faker> {
    protected Email(Faker faker) {
        super(faker);
    }

    public String format(String name, String lastName) {
        String domain = faker.domain().validDomain("mail");
        return String.format("%s.%s@%s", name.toLowerCase(), lastName.toLowerCase(), domain);
    }

}
