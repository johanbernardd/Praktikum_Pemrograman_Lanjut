package LatihanPolymorphism;

public class Witch extends Enemy {
    public Witch(String caraGerak, String name) {
        super(caraGerak, name);
    }
    @Override
    public void move() {
        super.move();
    }   
    @Override
    public void move(int step) {
        super.move(step);
    }
}