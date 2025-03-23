package javapractgui3;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JavaPractGUI3 extends JFrame implements ActionListener{
    //Declaring components
    JLabel label;
    JTextField textField;
    JButton button, button2;
    JLabel outputLabel, outputLabel2;
    
    //Constructor
    JavaPractGUI3(){
        //Configure Frame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,350);
        setTitle("Second GUI Practice");
        setLayout(new GridLayout(3,2));
        setVisible(true);

        //Configure Components
        label = new JLabel("Enter your age: ");
        textField = new JTextField(20);
        button = new JButton("Check");
        outputLabel = new JLabel("");
        button2 = new JButton("Clear");
        outputLabel2 = new JLabel("");
        
        button.addActionListener(this);
        button2.addActionListener(this);
        
        //Add Components into Frame
        add(label);
        add(textField);
        add(button);
        add(button2);
        add(outputLabel);
        add(outputLabel2);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == button) { // If "Check Age" is clicked
            try {
                int age = Integer.parseInt(textField.getText()); // Convert text to int
                outputLabel.setText("Age: " + age);
                
                AgeChecker ageCheck = new AgeChecker(age);
                outputLabel2.setText(ageCheck.checkAge());
                
            } catch (NumberFormatException ex) {
                outputLabel.setText("Invalid input! Please enter a number.");
                outputLabel2.setText("");
            }
        } else if (e.getSource() == button2) { // If "Clear" is clicked
            textField.setText(""); // Clear text field
            outputLabel.setText(""); // Clear output label
            outputLabel2.setText(""); //Clear text field
        }
    }
    
    public static void main(String[] args){
        new JavaPractGUI3();
    }
}

class AgeChecker {
    private int age;
    
    public AgeChecker(int age){
        this.age = age;
    }
    //getter and setter
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    
    public String checkAge() {
        if (age >= 18) {
            return "You're an adult!";
        } else if (age > 0 && age < 18) {
            return "You're a minor!";
        } else { // User can still type negative values
            return "Please enter a valid age!";
        }
    }
}