import java.util.Scanner;

class Car{
    private int id;
    private String name;
    private String color;
    private static Car car;

    private Car(){
        System.out.println("Car Object is created");
    }

    public static Car createCar(){
        if(car == null){
            car = new Car();
        }
        return car;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setCar(int id, String name, String color) {
        this.id = id;
        this.name = name;
        this.color = color;
    }
    @Override
    public String toString() {
        return "Car Details = Id:" + id + ", Name:" + name +
         ", Color:" + color;
    }
}
public class CarSingle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Car car1 = Car.createCar();
        car1.setCar(101, "BMW", "Black");
        System.out.println(car1); 
        Car car2 = Car.createCar();
        System.out.println(car2); 
        car2.setCar(102, "Audi", "White");
        System.out.println(car1); 
    }
}