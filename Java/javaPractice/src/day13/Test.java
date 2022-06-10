package day13;

public class Test {
    public static void main(String[] args) {
        User user1 = new User("Artur");
        User user2 = new User("Roma");
        User user3 = new User("Slava");
        user1.sendMessage(user2, "Hi!");
        user1.sendMessage(user2, "Hello!");
        user2.sendMessage(user1, "Hi!");
        user2.sendMessage(user1, "What have you been up to?");
        user2.sendMessage(user1, "Glad to hear from you");
        user3.sendMessage(user1,"hi");
        user3.sendMessage(user1,"how are you");
        user3.sendMessage(user1,"I miss you");
        user1.sendMessage(user3,"hello");
        user1.sendMessage(user3,"I m fine");
        user1.sendMessage(user3,"Either do I");
        user3.sendMessage(user1, "Hope to see you soon");

        MessageDatabase.showDialog(user1, user3);

        System.out.println(MessageDatabase.getMessages().get(0));


    }
}
