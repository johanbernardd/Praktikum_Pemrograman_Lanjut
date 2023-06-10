package TugasInheritance;
import java.time.LocalDate;

public class Pekerja extends Manusia {
    private double gaji;
    private LocalDate tahunMasuk;
    private int jumlahAnak;
    public Pekerja(String nama, boolean jenisKelamin, String nik, boolean menikah, double gaji, LocalDate tahunMasuk, int jumlahAnak) {
        super(nama, jenisKelamin, nik, menikah);
        this.gaji = gaji;
        this.tahunMasuk = tahunMasuk;
        this.jumlahAnak = jumlahAnak;
    }
    public double getGaji() {
        return gaji;
    }
    public void setGaji(double gaji) {
        this.gaji = gaji;
    }
    public LocalDate getTahunMasuk() {
        return tahunMasuk;
    }
    public void setTahunMasuk(LocalDate tahunMasuk) {
        this.tahunMasuk = tahunMasuk;
    }
    public int getJumlahAnak() {
        return jumlahAnak;
    }
    public void setJumlahAnak(int jumlahAnak) {
        this.jumlahAnak = jumlahAnak;
    }
    public double getBonus() {
        LocalDate now = LocalDate.now();
        int lamaBekerja = now.getYear() - tahunMasuk.getYear();
        if (lamaBekerja <= 5) {
            return 0.05 * gaji;
        } else if (lamaBekerja > 5 && lamaBekerja <= 10) {
            return 0.1 * gaji;
        } else {
            return 0.15 * gaji;
        }
    }
    public double getTunjanganAnak() {
        return jumlahAnak * 20;
    }
    public double getGajiTotal() {
        return gaji + getBonus() + getTunjanganAnak();
    }
    @Override
    public String toString() {
        return super.toString() + "Tahun Masuk : " + tahunMasuk + "\nJumlah Anak : " + 
        jumlahAnak + "\nGaji : " + getGajiTotal() + "\n";
    }
}