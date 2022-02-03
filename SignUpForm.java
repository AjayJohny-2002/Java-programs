/**************
 * Author   : Ajay Johny
 * Program  : Simple signUp Form
 ***************/

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignUpForm extends Frame implements  ActionListener{

    TextField Name = new TextField(20);
    TextField MailId = new TextField(20);
    TextField Password = new TextField(20);
    Button button;
    Label label1,label2,label3;

    public SignUpForm(){
        
        setTitle(" Sign Up Form ");
        setLayout(new FlowLayout());
        setVisible(true);
        setSize(500,400);

        button = new Button("submit");

        label1 = new Label("Name");
        label1.setAlignment((int) LEFT_ALIGNMENT);
        add(label1);
        add(Name);
        Name.getText();

        label2 = new Label("Mail");
        label2.setAlignment((int) LEFT_ALIGNMENT);
        add(label2);
        add(MailId);
        MailId.getText();

        label3 = new Label("password");
        label3.setAlignment((int) LEFT_ALIGNMENT);
        add(label3);
        add(Password);
        Password.getText();


        add(button);

        button.addActionListener( this);
        
    }

    public void actionPerformed(ActionEvent e) {
        System.out.println("Name  : " +Name.getText());

        System.out.println("Mail Id   : " +MailId.getText());
        System.out.println("Password   : " +Password.getText());
       
    }
    public static void main(String args []){
        SignUpForm sf = new SignUpForm();
    }
}
