public class Client {
    public static void main(String[] args) {
        AuthHandler auth = new AuthHandler("my-token");
        ContentTypeHandler type = new ContentTypeHandler("application/json");
        PayloadHandler payload = new PayloadHandler("{}");

        auth.setNext(type);
        type.setNext(payload);

        String authentication = auth.addHandler("- Authentication");
        System.out.println(authentication);

        String cType = type.addHandler("- Content Type");
        System.out.println(cType);

    }
}
