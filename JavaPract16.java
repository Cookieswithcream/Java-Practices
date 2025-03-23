package javapract16;

class JavaPract16{
    public static void main(String[] args) {
        String brand;
        int amount = 0;
        
        Car car = new Car("Toyota", 10);
        car.accelerate(100);
        car.brake(10);
        car.displayInfo();
        
        System.out.println(car.toString());
        
        Car car1 = new Car("Lamborghini", 45);
        car1.accelerate(80);
        car1.brake(10);
        car1.displayInfo();
    }
}

class Car {
    private String brand;
    private int speed = 0, amount = 0;
    
    public Car(String brand, int speed){
        this.brand = brand;
        this.speed = speed;
    }
    
    public void accelerate(int amount){
        speed = speed + amount;
        System.out.println("Speed has increased by " + amount + " km/h");
    }
    
    public void brake(int amount){
        if (speed - amount < 0) {
            speed = 0;
        } else {
            speed -= amount;
        }
        System.out.println("Speed has decreased by " + amount + " km/h");
    }
    
    public void displayInfo() {
        System.out.println("Car Brand: " + brand);
        System.out.println("Current Speed: " + speed + " km/h");
    }
    
    @Override
    public String toString() {
        return "-------------- Car object 2 --------------";
    }
}