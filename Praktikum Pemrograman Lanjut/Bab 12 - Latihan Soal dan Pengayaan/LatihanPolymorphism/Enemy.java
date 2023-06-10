package LatihanPolymorphism;

public class Enemy extends Character {
    String name;
    public Enemy(String caraGerak, String name) {
        super(caraGerak, name);
    }
    @Override
    public void move() {
        super.move();
    }
    public void move(int step) {
        System.out.printf("Bergerak dengan %d langkah ", step);
    }
}