package TugasPolymorphism;

import java.time.LocalDate;

public class BasePlusCommissionEmployee extends CommissionEmployee{
    private double baseSalary;//gaji pokok tiap minggu
public BasePlusCommissionEmployee(String name, String noKTP, LocalDate tanggalLahir, double barangProduksi, double sales, double rate, double salary) {
    super(name, noKTP, tanggalLahir, barangProduksi, sales, rate);
    setBaseSalary(salary);
}
public void setBaseSalary(double salary) {
    baseSalary = salary;
}
public double getBaseSalary() {
    return baseSalary;
}
public double earnings() {
    return getBaseSalary() + super.earnings();
}
public String toString() {
    return String.format("Base-Salaried " + super.toString() + "\nbase salary " + getBaseSalary());
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