package javapractgui2;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JavaPractGUI2 extends JFrame implements ActionListener{
    //Declaring components
    JLabel label;
    JTextField textField;
    JButton button, button2;
    JLabel outputLabel;
    
    //Constructor
    JavaPractGUI2(){
        //Configure Frame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,350);
        setTitle("Second GUI Practice");
        setLayout(new FlowLayout());
        setVisible(true);

        //Configure Components
        label = new JLabel("Enter your age: ");
        textField = new JTextField(20);
        button = new JButton("Check");
        outputLabel = new JLabel("");
        button2 = new JButton("Clear");
        
        button.addActionListener(this);
        button2.addActionListener(this);
        
        //Add Components into Frame
        add(label);
        add(textField);
        add(button);
        add(button2);
        add(outputLabel);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == button) { // If "Check Age" is clicked
            try {
                int age = Integer.parseInt(textField.getText()); // Convert text to int
                outputLabel.setText("Age: " + age);
            } catch (NumberFormatException ex) {
                outputLabel.setText("Invalid input! Please enter a number.");
            }
        } else if (e.getSource() == button2) { // If "Clear" is clicked
            textField.setText(""); // Clear text field
            outputLabel.setText(""); // Clear output label
        }
    }
    
    public static void main(String[] args){
        new JavaPractGUI2();
    }
}


