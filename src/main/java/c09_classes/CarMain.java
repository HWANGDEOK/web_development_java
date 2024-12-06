package c09_classes;

public class CarMain {
    public static void main(String[] args) {
        Car myCar = new Car();
        Car yourCar = new Car();

        myCar.color = "빨강";
        yourCar.color = "노랑";

        myCar.drive();
        yourCar.stop();
    }
}
