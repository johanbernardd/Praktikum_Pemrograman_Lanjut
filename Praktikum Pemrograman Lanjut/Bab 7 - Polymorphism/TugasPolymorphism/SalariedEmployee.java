package TugasPolymorphism;

import java.time.LocalDate;

public class SalariedEmployee extends Employee {
    private double weeklySalary; //gaji/minggu
public SalariedEmployee(String name, String noKTP, LocalDate tanggalLahir, double barangProduksi, double salary) {
    super(name, noKTP, tanggalLahir, barangProduksi);
    setWeeklySalary(salary);
}
public void setWeeklySalary(double salary) {
    weeklySalary = salary;
}
public double getWeeklySalary() {
    return weeklySalary;
}
public double earnings() {
    return getWeeklySalary();
}
public String toString() {
    return String.format("Salaried employee: " + super.toString() + "\nweekly salary:" + getWeeklySalary());
}
@Override
public double gajiUlangTahun(double bonus) {
    if (today.getMonth() == getTanggalLahir().getMonth()) {
        return earnings() + bonus;
    }
    return earnings();
}
@Override
public double gajiBasedProduction(double upahPerProduksi) {
    return earnings() + (getBarangProduksi() * upahPerProduksi);
}
}