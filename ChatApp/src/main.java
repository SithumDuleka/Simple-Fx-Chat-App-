public class main {
    public static void main(String[] args) {
        ChatController chatController=new ChatController();
        chatController.addWindow(new ChatWindow("you",chatController));
        chatController.addWindow(new ChatWindow("Test user",chatController));

    }
}
Screenshot 2025-08-08 at 7.40.13 PM.png