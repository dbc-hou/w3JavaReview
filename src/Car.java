public class Car extends Vehicle {
    int speed;
    private String modelName = "Mustang";

    public static void main(String[] args) {
        Car myCar = new Car(85);
        myCar.honk();
        System.out.println(myCar.brand + " " + myCar.modelName + " is going " + myCar.speed + " kph.");
    }
    public Car(int newSpeed) {
        speed = newSpeed;
    }
    public void fullThrottle() {
        System.out.println("The car is going as fast as it can!");
    }

    public void speed(int maxSpeed) {
        System.out.println("Max Speed is: " + maxSpeed + " kph.");
    }
}
