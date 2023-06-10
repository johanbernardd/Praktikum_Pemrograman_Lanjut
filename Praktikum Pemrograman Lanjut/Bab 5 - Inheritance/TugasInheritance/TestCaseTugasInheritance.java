package TugasInheritance;
import java.time.LocalDate;

public class TestCaseTugasInheritance {
    public static void main(String[] args) {
        //Manusia a)Laki-laki telah menikah
        Manusia manusia1 = new Manusia("Cristiano", true, "500100010119700001", true);
        System.out.println(manusia1.toString());
        //Manusia b)Perempuan telah menikah
        Manusia manusia2 = new Manusia("Jessica", false, "50010102021970", true);
        System.out.println(manusia2.toString());
        //Manusia c)Belum menikah
        Manusia manusia3 = new Manusia("Georgina", false, "50110003031970", false);
        System.out.println(manusia3.toString());

        //MahasiswaFILKOM a)Ipk < 3
        MahasiswaFILKOM mahasiswa1 = new MahasiswaFILKOM("Johanes", true, "5002002608040007", false, "225150407111090", 2.9);
        System.out.println(mahasiswa1.toString());
        //MahasiswaFILKOM b)Ipk 3 - 3.5
        MahasiswaFILKOM mahasiswa2 = new MahasiswaFILKOM("Johanes", true, "5002002608040007", false, "225150407111090", 3.4);
        System.out.println(mahasiswa2.toString());
        //MahasiswaFILKOM c)Ipk 3.5 - 4
        MahasiswaFILKOM mahasiswa3 = new MahasiswaFILKOM("Johanes", true, "5002002608040007", false, "225150407111090", 4.0);
        System.out.println(mahasiswa3.toString());

        //Pekerja a)Lama bekerja 2 tahun, anak 2
        Pekerja pekerja1 = new Pekerja("Kroos", true, "5003001010920008", true, 5000, LocalDate.of(2021, 4, 9), 2);
        System.out.println(pekerja1.toString());
        //Pekerja b)Lama bekerja 9 tahun
        Pekerja pekerja2 = new Pekerja("Alisha", false, "5003002010930006", false, 5000, LocalDate.of(2014, 4, 9), 0);
        System.out.println(pekerja2.toString());
        //Pekerja c)Lama bekerja 20 tahun, anak 10
        Pekerja pekerja3 = new Pekerja("Modric", true, "5003003010940001", true, 5000, LocalDate.of(2003, 4, 9), 10);
        System.out.println(pekerja3.toString());

        //Manager lama bekerja 15 tahun dengan gaji $7500
        Manager1 manager1 = new Manager1("Ancelotti", true, "5004002005680003", true, 7500, LocalDate.of(2008, 4, 9), 0, "Sports");
        System.out.println(manager1.toString());
    }
}