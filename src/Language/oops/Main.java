package Language.oops;

public class Main {
    public static void main(String[] args) {
        Room room1 = new Room();
       // System.out.println(room1.bed); can't access bed is private
        System.out.println(room1.window);
        System.out.println(room1.almirah);
    }
}
