package tugas;

public class Car extends Vehicle {
  Owner o;

  Car(Owner o, String nama, int tahun, double rpm) {
    this.o = o;
    this.nama = nama;
    this.tahun = tahun;
    this.rpm = rpm;
  }

  public void carDetails() {
    System.out.println("Car name\t: " + this.nama);
    System.out.println("Car owner\t: " + this.o.getName());
    System.out.println("Output year\t: " + this.tahun);
    System.out.println("RPM\t\t: " + this.rpm);
  }
}