interface Playable { void play(); }
class Guitar implements Playable { public void play() { System.out.println("Guitar"); } }
public class InterfaceDemo {
    public static void main(String[] args) {
        new Guitar().play();
    }
}
