package LatihanPolymorphism;

public class Character {
    String caraGerak;
    String name;
public Character(String caraGerak, String name) {
    this.caraGerak = caraGerak;
    this.name = name;
}
public void move() {
    System.out.printf("Cara Gerak %s adalah : %s\n", name, caraGerak);
}
}