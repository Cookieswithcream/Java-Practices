package JavaPract12;
import java.util.*;

public class JavaPract12 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double num[] = new double[5];

        System.out.println("Please enter 5 numbers to be stored: ");
        for(int i=0; i<num.length; i++){
            while(true){
                if (scan.hasNextDouble()) {
                    num[i] = scan.nextDouble();
                    break;
                } 
                else {
                    System.out.println("Please enter a number!!!");
                    scan.next();
                }
            }
        }
        
        //print normal
        System.out.print("Array: ");
        for(int i=0; i<num.length; i++){
            System.out.print(num[i] + " ");
        }

        
        //print reverse
        System.out.println(" ");
        System.out.print("Array in Reverse Order: ");
        for(int i=num.length - 1; i >= 0; i--) {
            System.out.print(num[i] + " ");
        }
        System.out.println(" ");
        
        double sum = 0;
        for(int i = 0; i<num.length; i++){
            sum += num[i];
        }
                
        double avg = sum/num.length;
        
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + avg);
    }
    
}
