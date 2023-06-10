package TugasPolymorphism;

import java.time.LocalDate;

public abstract class Employee {
    private String name;
    private String noKTP;
    private LocalDate tanggalLahir;
    private double barangProduksi;
public Employee(String name, String noKTP, LocalDate tanggalLahir, double barangProduksi){
    this.name = name;
    this.noKTP = noKTP;
    this.tanggalLahir = tanggalLahir;
    this.barangProduksi = barangProduksi;
}
public String getName(){
    return name;
}
public String getNoKTP(){
    return noKTP;
}
public void setTanggalLahir(LocalDate tanggalLahir) {
    this.tanggalLahir = tanggalLahir;
}
public LocalDate getTanggalLahir() {
    return tanggalLahir;
}
public double getBarangProduksi() {
    return barangProduksi;
}
public String toString(){
    return String.format(" "+getName()+"\nNo. KTP:"+getNoKTP());
}
public abstract double earnings();//pendapatan
LocalDate today = LocalDate.now();
public abstract double gajiUlangTahun(double bonus);
public abstract double gajiBasedProduction(double upahPerProduksi);
}