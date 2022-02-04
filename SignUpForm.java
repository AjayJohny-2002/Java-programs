/**************
 * Author   : Ajay Johny
 * Program  : Simple signUp Form
 ****************/

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignUpForm extends Frame implements  ActionListener{

    TextField Name = new TextField(20);
    TextField MailId = new TextField(20);
    TextField Password = new TextField(20);
    TextField mobileNo = new TextField(20);
    Button button;
    Label label1,label2,label3,label4;

    public SignUpForm(){
        
        //Title
        setTitle(" Sign Up Form ");
        setLayout(new FlowLayout());
        setVisible(true);
        setSize(200,400);

        button = new Button("submit");
        // for getting name
        label1 = new Label("Name");
        label1.setAlignment(Label.LEFT);
        add(label1);
        add(Name);
        
        
        // for mail id field
        label2 = new Label("Mail");
        label2.setAlignment(Label.LEFT);
        add(label2);
        add(MailId);
        
        
        // for password
        label3 = new Label("password");
        label3.setAlignment(Label.LEFT);
        add(label3);
        add(Password);
        
        
        // for mobile
        label4 = new Label("Mobie No ");
        label4.setAlignment(Label.LEFT);
        add(label4);
        add(mobileNo);
        
        
        // adding button
        add(button);

        button.addActionListener( this);
        
    }

    public void actionPerformed(ActionEvent e) {

        System.out.println("Name  : " +Name.getText());
        System.out.println("Mail Id   : " +MailId.getText());
        System.out.println("Password   : " +Password.getText());
        System.out.println("Mobile No  : " +mobileNo.getText());
       
    }
    public static void main(String args []){
        SignUpForm sf = new SignUpForm();
    }
}

