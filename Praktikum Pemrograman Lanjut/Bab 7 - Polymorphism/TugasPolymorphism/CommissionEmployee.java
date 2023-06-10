package TugasPolymorphism;

import java.time.LocalDate;

public class CommissionEmployee extends Employee{
    private double grossSales;//penjualan per minggu
    private double commissionRate;//komisi
public CommissionEmployee(String name, String noKTP, LocalDate tanggalLahir, double barangProduksi, double sales, double rate){
    super(name, noKTP, tanggalLahir, barangProduksi);
    setGrossSales(sales);
    setCommissionRate(rate);
}
public void setGrossSales(double sales){
    grossSales = sales;
}
public double getGrossSales(){
    return grossSales;
}
public void setCommissionRate(double rate){
    commissionRate = rate;
}
public double getCommissionRate(){
    return commissionRate;
}
public double earnings(){
    return getCommissionRate()*getGrossSales();
}
public String toString(){
    return String.format("Commision employee: "+super.toString()+"\ngross sales: " + 
    getGrossSales()+"\ncommission rate: "+getCommissionRate());
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