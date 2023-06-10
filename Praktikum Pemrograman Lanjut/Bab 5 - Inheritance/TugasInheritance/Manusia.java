package TugasInheritance;

public class Manusia {
        private String nama;
        private boolean jenisKelamin;
        private String nik;
        private boolean menikah;
        
        public Manusia(String nama, boolean jenisKelamin, String nik, boolean menikah) {
            this.nama = nama;
            this.jenisKelamin = jenisKelamin;
            this.nik = nik;
            this.menikah = menikah;
        }
        public String getNama() {
            return nama;
        }
        public void setNama(String nama) {
            this.nama = nama;
        }
        public boolean getJenisKelamin() {
            return jenisKelamin;
        }
        public void setJenisKelamin(boolean jenisKelamin) {
            this.jenisKelamin = jenisKelamin;
        }
        public String getNik() {
            return nik;
        }
        public void setNik(String nik) {
            this.nik = nik;
        }
        public boolean getMenikah() {
            return menikah;
        }
        public void setMenikah(boolean menikah) {
            this.menikah = menikah;
        }
        public double getTunjangan() {
            if(this.menikah) {
                if(this.jenisKelamin) {
                    return 25;
                } else {
                    return 20;
                }
            } else {
                return 15;
            }
        }
        public double getPendapatan() {
            return getTunjangan();
        }
        public String toString() {
            String jenisKelamin;
            if(this.jenisKelamin) {
                jenisKelamin = "Laki-laki";
            } else {
                jenisKelamin = "Perempuan";
            }
            return "Nama : " + this.nama + "\nNIK : " + this.nik + "\nJenis Kelamin : " + jenisKelamin + "\nJumlah Pendapatan : " + getPendapatan() + "\n";
        }
}