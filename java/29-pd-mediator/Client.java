public class Client {
    public static void main(String[] args) {
        ChatRoom chatRoom = new ChatRoom();
        User fer = new ChatUser(chatRoom, "Fer");
        User casti = new ChatUser(chatRoom, "Casti");
        User iris = new ChatUser(chatRoom, "Iris");

        chatRoom.addUser(fer).addUser(iris).addUser(casti);

        iris.send("Hola!");
    }
}
