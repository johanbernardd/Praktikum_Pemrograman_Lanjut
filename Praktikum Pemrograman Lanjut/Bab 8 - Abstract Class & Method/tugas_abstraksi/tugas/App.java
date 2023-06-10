package tugas;

public class App {
  public static void main(String[] args) {
    Owner owner1 = new Owner("Arsyad");
    Owner owner2 = new Owner("Ardhan");
    Owner owner3 = new Owner("Budhi");
    Owner owner4 = new Owner("Galuh");

    Car[] cars = new Car[4];
    cars[0] = new Car(owner1, "Toyota GR Yaris", 2022, 6500);
    cars[1] = new Car(owner2, "Jeep Wrangler", 1972, 6000);
    cars[2] = new Car(owner3, "Mazda RX 87", 1967, 10500);
    cars[3] = new Car(owner4, "Mercedes Benz 220", 1958, 5500);
    for (Car instCar : cars) {
      instCar.carDetails();
      System.out.println();
    }
  }
}