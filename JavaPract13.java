package JavaPract13;
import java.util.*;

public class JavaPract13 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double num[] = new double[5];
        
        System.out.println("Please enter 5 number: ");
        while(true){
            for (int i=0; i<num.length; i++) {
                if(scan.hasNextDouble()){
                    num[i] = scan.nextDouble();
                }
                else {
                    System.out.println("Please enter a number!!!!");
                    scan.next();
                }
            }
            break;
        }
        
        System.out.print("Array: ");
        for(int i=0; i<num.length; i++){
            System.out.print(num[i] + " ");
        }
        System.out.println(" ");

        double max = num[0];
        for(int i=0; i<num.length; i++){
            if (num[i]>max){
                max = num[i];
            }    
        }       
        System.out.println("Maximum Number: " + max);

        double min = num[0];
        for(int i=0; i<num.length; i++){
            if (num[i]<min){
                min = num[i];
            }
        }
        System.out.println("Minimum Number: " + min);
    }
}