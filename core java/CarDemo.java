class Car {
    String m;
    public Car(String m) { this.m=m; }
    public void display() { System.out.println(m); }
}
public class CarDemo {
    public static void main(String[] args) {
        new Car("Toyota").display();
    }
}
