package javapract11;
import java.util.*;

public class JavaPract11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double marks[] = new double[3];
        
        for (int i=0; i<marks.length; i++){
            while(true) {
                System.out.println("Please enter subject " + (i + 1) + " :");
                if(scan.hasNextDouble()){
                    double marksInput = scan.nextDouble();
                    if(marksInput >= 0 && marksInput <= 100){
                        marks[i] = marksInput;
                        break;
                    }
                    else {
                        System.out.println("Please enter valid marks!!");
                    }
                }
                else {
                    System.out.println("Please enter numbers!!");
                    scan.next();
                }
            }
        }  
        
        System.out.println("Entered marks: ");
        for (int i=0; i<marks.length; i++){
            System.out.println("Subject " + (i + 1) + " = " + marks[i] + "%");
        }
        
        Grade studentGrade = new Grade(marks);
        studentGrade.displayGrade();
    }
}

// Class to determine the grade
class Grade {
    private double marks[];

    // Constructor
    public Grade(double marks[]) {
        this.marks = marks;  
    }

    public double calculateAverage() {
        double sum = 0;
        for (double mark : marks) {
            sum += mark;
        }
        return sum / marks.length;
    }

    public char determineGrade(double score) {
        if (score >= 90) return 'A';
        else if (score >= 80) return 'B';
        else if (score >= 65) return 'C';
        else if (score >= 50) return 'D';
        else return 'F';
    }
    
    public char determineFinalGrade() {
        return determineGrade(calculateAverage());
    }
    
    public void displayGrade() {
        System.out.println("\n--- Subject Grades ---");
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Subject " + (i + 1) + ": " + marks[i] + "% - Grade " + determineGrade(marks[i]));
        }
        
        double avg = calculateAverage();
        char grade = determineFinalGrade();
        System.out.println("\nAverage Marks: " + avg);
        System.out.println("Final Grade: " + grade);
    } 
}
