package LatihanPolymorphism;

public class Main {
    public static void main(String[] args) {
        Fighter fighter1 = new Fighter("Fly", "Dragon");
        fighter1.move();
        fighter1.move("Right");
        Witch witch1 = new Witch("Drift", "Witchers");
        witch1.move();
        witch1.move(50);
    }
}