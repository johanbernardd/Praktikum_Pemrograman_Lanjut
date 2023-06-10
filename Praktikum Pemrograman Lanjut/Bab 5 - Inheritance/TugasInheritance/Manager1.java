package TugasInheritance;
import java.time.LocalDate;

public class Manager1 extends Pekerja {
    private String departemen;
    public Manager1(String nama, boolean jenisKelamin, String nik, boolean menikah, double gaji, LocalDate tahunMasuk, int jumlahAnak, String departemen) {
        super(nama, jenisKelamin, nik, menikah, gaji, tahunMasuk, jumlahAnak);
        this.departemen = departemen;
    }
    public String getDepartemen() {
        return departemen;
    }
    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }
    public double getTunjanganTotal() {
        return 0.1 * getGajiTotal();
    }
    @Override
    public String toString() {
        return super.toString() + "Departemen : " + getDepartemen() + "\n";
    }
}