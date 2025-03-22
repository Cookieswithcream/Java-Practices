package javapract14;
import java.util.*;

public class JavaPract14 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int length;

        System.out.println("How many numbers will be used =");
        length = scan.nextInt();
       
        double num[] = new double[length];
        
        System.out.println("Please enter the numbers for array: ");
        while(true){
            for(int i=0; i<num.length; i++){
                if(scan.hasNextDouble()){
                    num[i] = scan.nextDouble();
                }
                else {
                    System.out.println("Please enter a number!!!");
                    scan.next();
                }
            }
            break;
        }
        
        NumberAnalyzer analyzer = new NumberAnalyzer(num); 
        analyzer.findMax();
        analyzer.findMin();
        analyzer.findSum();
        analyzer.findAverage();
        
        System.out.println("Max = " + analyzer.getMax());
        System.out.println("Min = " + analyzer.getMin());
        System.out.println("Sum = " + analyzer.getSum());
        System.out.println("Average = " + analyzer.getAverage());
        
    }
}

class NumberAnalyzer {
    private double num[];
    private double max, min, sum, avg;
    
    public NumberAnalyzer(double num[]){
        this.num = num;
        this.sum = 0;
        this.min = num[0];
        this.max = num[0];
        this.avg = 0;
    }
    
    // Getter methods for accessing results
    public double getMax() {
        return max;
    }

    public double getMin() {
        return min;
    }

    public double getSum() {
        return sum;
    }

    public double getAverage() {
        return avg;
    }
    
    //METHODS 🔥🔥
    public void findMax() {
        for(int i=0; i<num.length; i++){
            if(num[i]>max){
                max = num[i];
            }
        }
    }
    
    public void findMin() {
        for(int i=0; i<num.length; i++){
            if(num[i]<min){
                min = num[i];
            }
        }
    }
    public void findSum() {
        for(int i=0; i<num.length; i++){
            sum += num[i];
        }
    }
    
    public void findAverage() {
        findSum();
        avg = sum/num.length;
    }
}