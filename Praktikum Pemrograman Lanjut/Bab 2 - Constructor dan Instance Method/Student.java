import javax.naming.spi.DirStateFactory.Result;

public class Student {
    private String name;
    private String address;
    private int age;
    private double mathGrade;
    private double englishGrade;
    private double scienceGrade;
    private double average;
    private static int banyakObjek = 0;

    public Student(){
        name = "";
        address = "";
        age = 0;
        mathGrade = 0;
        englishGrade = 0;
        scienceGrade = 0;
        banyakObjek++;
    }

    public Student(String n, String a, int ag, int mG, int eG, int sG){
        name = n;
        address = a;
        age = ag;
        mathGrade = mG;
        englishGrade = eG;
        scienceGrade = sG;
        banyakObjek++;
    }

    public static void jumlahObjek() {
        System.out.println("Banyaknya objek yang dibuat: " + banyakObjek);
    }

    public void setName(String n){
        name = n;
    }

    public void setAddress(String a){
        address = a;
    }

    public void setAge(int ag){
        age = ag;
    }

    public void setKumpulanNilai (int mG, int eG, int sG) {
        mathGrade = mG;
        englishGrade = eG;
        scienceGrade = sG;
    }

    private double getAverage() {
        double result = 0;
        result = (mathGrade+scienceGrade+englishGrade)/3;
        return result;
    }

    private boolean getStatusAkhir() {
        return (getAverage() >= 61) ? true : false;
    }

    public void displayMessage(){
    System.out.println("Siswa dengan nama " + name);
    System.out.println("beramalat di " + address);
    System.out.println("berumur " + age);
    System.out.println("mempunyai nilai rata rata " + getAverage());
        if (getStatusAkhir()) {
            System.out.println("Lolos");
        } else {
            System.out.println("Remidi");
        }
    }
}