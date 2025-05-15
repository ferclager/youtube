import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Youtube {
    public static void main(String[] args) {
        // Otras opciones:
        // LinkedHashSet - respeta orden de inserción
        // TreeSet - orden alfabético (por ser la key String)
        Set<String> emails = new HashSet<>();

        emails.add("ferclager@mail.com");
        emails.add("siri@mail.com");
        emails.add("casti@mail.com");
        emails.add("casti@mail.com");
        emails.add("casti@mail.com");
        System.out.println(emails);

        System.out.println("Contains " + emails.contains("ferclager@mail.com"));
        System.out.println("Contains " + emails.contains("ferclager22@mail.com"));

        emails.remove("ferclager@mail.com");
        System.out.println(emails);
        System.out.println("Size " + emails.size());
        System.out.println("empty " + emails.isEmpty());

        emails.clear();
        System.out.println("Size " + emails.size());
        System.out.println("empty " + emails.isEmpty());

        //addAll
        List<Integer> nums = new ArrayList<>();
        nums.add(5);
        nums.add(15);
        nums.add(10);
        nums.add(10);
        nums.add(15);
        nums.add(15);
        System.out.println(nums);

        Set<Integer> setInt = new HashSet<>(nums);
        System.out.println(setInt);
    }
}
