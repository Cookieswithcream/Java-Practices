package javapractgui;
import java.awt.*;  
import java.awt.event.*;  
import javax.swing.*;  

public class JavaPractGUI extends JFrame implements ActionListener {  
    // Step 1: Declare Components  
    JLabel label, Cookie;  
    JTextField textField;  
    JButton button;  
    JLabel outputLabel;  

    // Constructor  
    JavaPractGUI() {  
        // Step 2: Configure Frame  
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        setSize(500, 350);  
        setTitle("My First GUI");  
        setLayout(new FlowLayout());  
        setVisible(true);  

        // Step 4: Configure Components  
        label = new JLabel("Enter your name:");  
        textField = new JTextField(20);  
        button = new JButton("Submit");  
        outputLabel = new JLabel(""); 
        Cookie = new JLabel("Welcome to Cookie's World");

        button.addActionListener(this); // (a) Add Listener  

        // Step 5: Add Components to Frame  
        add(label);  
        add(textField);  
        add(button);  
        add(outputLabel); 
        add(Cookie);
    }  

    // Step 6: Code Logic (Create Event Handling)  
    @Override  
    public void actionPerformed(ActionEvent e) {  
        String name = textField.getText();  
        outputLabel.setText("Hello, " + name + "!");  
    }  

    // Step 7: Instantiate GUI  
    public static void main(String[] args) {  
        new JavaPractGUI();  
    }  
}  