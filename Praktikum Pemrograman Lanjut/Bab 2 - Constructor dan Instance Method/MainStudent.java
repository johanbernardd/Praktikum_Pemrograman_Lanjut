import java.util.Scanner;

public class MainStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Jumlah siswa: ");
        int siswa = sc.nextInt();
        Student jumlahSiswa[] = new Student[siswa];

        for (int i = 0; i < jumlahSiswa.length; i++) {
            System.out.println("Jumlah siswa yang diinginkan user adalah: " + siswa);
            System.out.println("Data siswa-" + (i+1));

            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Address: ");
            String address = sc.next();
            System.out.print("Age: ");
            int age = sc.nextInt();
            System.out.print("Math Grade: ");
            int mathGrade = sc.nextInt();
            System.out.print("English Grade: ");
            int englishGrade = sc.nextInt();
            System.out.print("Science Grade: ");
            int scienceGrade = sc.nextInt();
            sc.nextLine();

            Student student = new Student(name, address, age, englishGrade, scienceGrade, scienceGrade);
            jumlahSiswa[i] = student;
        }

        System.out.println("----------------------------");

        for (int i = 0; i < jumlahSiswa.length; i++) {
            jumlahSiswa[i].displayMessage();
            System.out.println();
        }

        Student.jumlahObjek();
    }
}

    //     Student anna = new Student();
    //     anna.setName("Anna");
    //     anna.setAddress("Malang");
    //     anna.setAge(20);
    //     anna.setKumpulanNilai(100, 89, 80);
    //     anna.displayMessage();

    // //menggunakan constructor lain
    //     System.out.println("==================="); 
    //     // Student chris = new Student("Chris", "Kediri", 21);// -> tidak memerlukan parameter
    //     Student chris = new Student();
    //     chris.setName("Chris");
    //     chris.setAddress("Kediri");
    //     chris.setAge(21);
    //     chris.setKumpulanNilai(70, 60, 90);
    //     chris.displayMessage();

    // //siswa dengan nama anna dirubah informasi alamat dan umurnya melalui constructor
    //     System.out.println("===================");
    //     anna.setName("anna");
    //     anna.setAddress("Batu");
    //     anna.setAge(18);
    //     //anna = new Student("anna", "Batu", 18); -> tidak memerlukan parameter
    //     anna.displayMessage();

    //     //siswa dengan nama chris dirubah informasi alamat dan umurnya melalui method
    //     System.out.println("===================");
    //     chris.setAddress("Surabaya");
    //     chris.setAge(22);
    //     chris.displayMessage();
//     }
// }