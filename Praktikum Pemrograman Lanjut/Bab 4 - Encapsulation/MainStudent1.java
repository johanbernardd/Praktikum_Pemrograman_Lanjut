public class MainStudent1 {
    public static void main(String [] args) {
        Student1 s1 = new Student1();
        s1.setName("Enkapsulasi");
        s1.setMark(90);
        System.out.println("s1Name is " + s1.getName());
        System.out.println("s1Mark is " + s1.getMark());
        System.out.println("name dan mark "+ s1.getName() +" " + s1.getMark());
    }
}