import java.util.ArrayList;

public class ChatController {
    private ArrayList<ChatWindow> windowsList;
    ChatController(){
        windowsList=new ArrayList<>();
    }
    public void addWindow(ChatWindow chatWindow){
        windowsList.add(chatWindow);
        chatWindow.setVisible(true);
    }
    public void sendMessage(String name,String message){
        for(ChatWindow w1:windowsList){
            if(w1.getWindowName().equals(name)){
                w1.setMeassage("Me",message);
            }else {
                w1.setMeassage(name, message);
            }
        }
    }
//    public String checkWindow(String name){
//        for(ChatWindow window:windowsList){
//            if()
//        }
//    }

}
