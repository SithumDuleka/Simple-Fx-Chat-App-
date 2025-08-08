import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.Flow;

public class ChatWindow  extends JFrame {
    private JTextField textField1;
    private JLabel chatClient;
    private JTextArea messageTextArea;
    private ChatWindow chatWindow;
    private ChatController chatController;
    ChatWindow(String name,ChatController chatController){
        this.chatController=chatController;
        setTitle("ChatAPP by SDK");
        setSize(500,400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        chatClient=new JLabel(name);
        textField1=new JTextField();
        textField1.requestFocus();
        textField1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                String massege=textField1.getText();
//               messageTextArea.append("Me :"+massege+"\n");
//                setMeassage(massege);
                chatController.sendMessage(chatClient.getText(),massege);
                textField1.setText("");

            }
        });

        messageTextArea=new JTextArea();
        messageTextArea.setEditable(false);

        JPanel p1=new JPanel(new FlowLayout(FlowLayout.CENTER));
        p1.add(chatClient);
        add("North",p1);
        add("Center",messageTextArea);
        add("South",textField1);

    }
    public void setMeassage(String name,String massege){
        //chatController.sendMessage(chatClient.getText()+massege);
        messageTextArea.append(name+": "+massege+"\n");
    }

    public void setChatWindow(ChatWindow chatWindow) {
        this.chatWindow = chatWindow;
    }
    public String getWindowName(){
        return chatClient.getText();
    }
}
