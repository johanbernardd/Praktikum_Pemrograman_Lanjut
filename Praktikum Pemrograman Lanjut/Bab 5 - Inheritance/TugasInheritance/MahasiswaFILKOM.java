package TugasInheritance;

public class MahasiswaFILKOM extends Manusia {
    private String nim;
    private double ipk;
    public MahasiswaFILKOM(String nama, boolean jenisKelamin, String nik, boolean menikah, String nim, double ipk) {
        super(nama, jenisKelamin, nik, menikah);
        this.nim = nim;
        this.ipk = ipk;
    }
    public String getNim() {
        return nim;
    }
    public void setNim(String nim) {
        this.nim = nim;
    }
    public double getIpk() {
        return ipk;
    }
    public void setIpk(double ipk) {
        this.ipk = ipk;
    }
    public double getBeasiswa() {
        double beasiswa = 0;
        if (ipk > 3.0 && ipk <= 3.5) {
            beasiswa = 50;
        } else if (ipk > 3.5 && ipk <= 4.0) {
            beasiswa = 75;
        } else {
            beasiswa = 0;
        }
        return beasiswa;
    }
    public String getStatus() {
        String status = "";
        String angkatan = "";
        String prodi = "";
        String digitAngkatan = nim.substring(0, 2);
        String digitProdi = nim.substring(6, 7);

        switch (digitProdi) {
            case "2":
                prodi = "Teknik Informatika";
                break;
            case "3":
                prodi = "Teknik Komputer";
                break;
            case "4":
                prodi = "Sistem Informasi";
                break;
            case "6":
                prodi = "Pendidikan Teknologi Informasi";
                break;
            case "7":
                prodi = "Teknologi Informasi";
                break;
            default: prodi = "Prodi tidak diketahui";
        }

        angkatan = "20" + digitAngkatan;
        status = prodi + " " + angkatan;
        
        return status;
    }
    @Override
    public String toString() {
        return  super.toString() + "NIM : " + nim + "\nIPK : " + ipk + "\nStatus : " + getStatus() + "\n";
    }
}