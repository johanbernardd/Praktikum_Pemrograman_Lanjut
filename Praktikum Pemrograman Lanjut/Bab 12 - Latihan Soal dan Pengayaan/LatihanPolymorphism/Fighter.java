package LatihanPolymorphism;

public class Fighter extends Hero{
    public Fighter(String caraGerak, String name) {
        super(caraGerak, name);
    }
    @Override
    public void move() {
        super.move();
    }
    @Override
    public void move(String direction) {
        super.move(direction);
    }
}