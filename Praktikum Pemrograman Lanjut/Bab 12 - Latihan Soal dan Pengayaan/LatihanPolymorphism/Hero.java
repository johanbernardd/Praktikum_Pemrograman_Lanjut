package LatihanPolymorphism;

public class Hero extends Character{
    String name;
    //String direction;
    public Hero(String caraGerak, String name) {
        super(caraGerak, name);
    }
    @Override
    public void move() {
        super.move();
    }
    public void move(String direction) {
        System.out.println("Bergerak ke arah " + direction + "\n");
    }
}