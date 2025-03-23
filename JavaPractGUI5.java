package javapractgui5;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class JavaPractGUI5 extends JFrame implements ActionListener {
    //Declaring
    JLabel label1, label2;
    JTextField textField1, textField2;
    JButton button, clearButton;
    JLabel outputLabel1, outputLabel2;
    
    //Constructor
    JavaPractGUI5() {
        //Configure JFrame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 250);
        setTitle("BMI Calculator");
        setLayout(new GridLayout(4,2));
        setVisible(true);
        
        //Configure Components
        label1 = new JLabel("Weight (kg): ");
        label2 = new JLabel("Height (m): ");
        textField1 = new JTextField(20);
        textField2 = new JTextField(20);
        button = new JButton("Calculate");
        clearButton = new JButton("Clear");
        outputLabel1 = new JLabel("");
        outputLabel2 = new JLabel("");
        
        button.addActionListener(this);
        clearButton.addActionListener(this);
        
        //Add Components
        add(label1);
        add(textField1);
        add(label2);
        add(textField2);
        add(button);
        add(clearButton);
        add(outputLabel1);
        add(outputLabel2);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == button){
            try {     
                double weight = Double.parseDouble(textField1.getText());
                double height = Double.parseDouble(textField2.getText());
                
                BMIClass bmiclass = new BMIClass(weight, height);
                outputLabel1.setText(String.format("BMI = %.2f", bmiclass.BMIForm()));
                outputLabel2.setText("BMI class = " + bmiclass.displayBMI());
            }
            catch (NumberFormatException ex) {
                outputLabel1.setText("Invalid Input!!");
                outputLabel2.setText("Invalid Input!!");
            }
        }
        else if (e.getSource() == clearButton){
            outputLabel1.setText("");
            outputLabel2.setText("");
            textField1.setText("");
            textField2.setText("");
        }
    }
    
    public static void main(String[] args){
        new JavaPractGUI5();
    }
}

class BMIClass{
    private double weight, height, BMI;
    
    public BMIClass(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }
    
    //getter and setter
    public double getWeight (){
        return weight;
    }
    public void setWeight(double weight){
        this.weight = weight;
    }
    public double getHeight (){
        return height;
    }
    public void setHeight(double height){
        this.height = height;
    }
    //end setter and getter
    
    public double BMIForm(){
        return BMI = (weight/(height*height));
    }
    
    public String displayBMI(){
        double BMI = BMIForm();
        if (BMI <= 18.5){
            return "Underweight";
        }
        else if (BMI >18.5 && BMI <= 24.9){
            return "Normal";
        }
        else if (BMI > 24.9 && BMI <= 29.9){
            return "Overweight";
        }
        else {
            return "Obese";
        }
    }
    
}