class Animal { void make() { System.out.println("Sound"); } }
class Dog extends Animal { void make() { System.out.println("Bark"); } }
public class InheritanceDemo {
    public static void main(String[] args) {
        new Dog().make();
    }
}
