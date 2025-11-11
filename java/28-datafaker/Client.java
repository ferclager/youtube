import net.datafaker.Faker;

import java.util.Locale;

public class Client {
    public static void main(String[] args) {

        Faker f = new Faker(new Locale("es", "MX"));
        CustomFaker cf = new CustomFaker();

        Company company = new Company("my-company", "Ingeniero de SW", 90_000);
        Address address = new Address("Spain", "Madrid", "28900", "Calle Atocha, 5");
        User user = new User("Fer", "Clager", "UBEDA", "f@mail.com", address, company);

        System.out.println(user);

        for (int i = 0; i <5; i++) {
            Company company1 = new Company(f.company().name(), f.company().profession(), f.number().numberBetween(50, 100) * 1000);
            Address address1 = new Address(f.address().country(), f.address().city(), f.address().zipCode(), f.address().streetAddress());
            String name = f.name().firstName();
            String surname = f.name().lastName();
            String email = cf.email.format(name, surname);
            User user1 = new User(name, surname, f.country().capital().toUpperCase(), email, address1, company1);

            System.out.println(user1);
        }

    }
}
