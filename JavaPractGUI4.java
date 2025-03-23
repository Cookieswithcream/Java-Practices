package javapractgui4;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class JavaPractGUI4 extends JFrame implements ActionListener{
    //Declaring
    JLabel label;
    JTextField textField;
    JButton button;
    JButton clearButton;
    JLabel outputLabel;
    
    //Constructor
    JavaPractGUI4(){
        //Configure JFrame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600,450);
        setTitle("Temperature Converter");
        setLayout(new GridLayout(3,2));
        setVisible(true);
        
        //Configure Components
        label = new JLabel("Enter Temperature (Celcius): ");
        textField = new JTextField(20);
        button = new JButton("Convert");
        clearButton = new JButton("Clear");
        outputLabel = new JLabel("");
        
        button.addActionListener(this);
        clearButton.addActionListener(this);
        
        //Add Components
        add(label);
        add(textField);
        add(button);
        add(clearButton);
        add(outputLabel);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == button){
            try {
                double temp = Double.parseDouble(textField.getText());

                Converter convert = new Converter(temp);
                outputLabel.setText("Temperature in Fahrenheit: " + convert.convertTemp() + " F");
            } catch(NumberFormatException ex) {
                outputLabel.setText("Invalid Input!!");
            }
        }
        else if(e.getSource() == clearButton) {
            textField.setText("");
            outputLabel.setText("");
        }
    }
    
    public static void main(String[] args){
        new JavaPractGUI4();
    }
}

class Converter {
    private double temp;
    
    public Converter(double temp){
        this.temp = temp;
    }
    
    //setter and getter
    public double getTemp(){
        return temp;
    }
    public void setTemp(double temp){
        this.temp = temp;
    }
    
    public double convertTemp() {
        return (temp * 9/5) + 32;
    }
}