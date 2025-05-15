import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Otras opciones:
        // LinkedHashMap - respeta orden de inserción
        // TreeMap - orden alfabético (por ser la key String)
        HashMap<String, Integer> usernameIds = new HashMap<>();
        usernameIds.put("ferclager", 11);
        usernameIds.put("siri", 15);
        usernameIds.put("casti", 17);
        System.out.println(usernameIds);

        System.out.println(usernameIds.get("ferclager"));
        System.out.println(usernameIds.containsKey("ferclager"));
        System.out.println(usernameIds.containsKey("ferclager11"));

        System.out.println(usernameIds.containsValue(11));
        System.out.println(usernameIds.containsValue(21));

        usernameIds.put("ferclager", 19);
        System.out.println(usernameIds);

        usernameIds.replace("ferclager", 21);
        System.out.println(usernameIds);

        usernameIds.replace("ferclager22", 90);
        System.out.println(usernameIds);

        usernameIds.putIfAbsent("ferclager22", 90);
        System.out.println(usernameIds);

        usernameIds.remove("ferclager22");
        System.out.println(usernameIds);

        System.out.println(usernameIds.size());
    }
}
