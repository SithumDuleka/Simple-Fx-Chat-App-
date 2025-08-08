public class main {
    public static void main(String[] args) {
        ChatController chatController=new ChatController();
        chatController.addWindow(new ChatWindow("you",chatController));
        chatController.addWindow(new ChatWindow("Test user",chatController));

    }
}
