import java.util.ArrayList;

class DataMahasiswa {
  private static ArrayList<Mahasiswa> mhs = new ArrayList<>();
  public static ArrayList<Mahasiswa> tambahMahasiswa(Mahasiswa mhsw) {
    mhs.add(mhsw);
    return mhs;
  }

  public static void tampilSemuaData() {
    for (int i = 0; i < mhs.size(); i++) {
      System.out.printf("=== Tampilan Data Mahasiswa %d Filkom UB ===\n", i+1);
        Mahasiswa mahasiswa1 = mhs.get(i);
        System.out.println("Nama Mahasiswa : " + mahasiswa1.getNama() + "\nJurusan : " + mahasiswa1.getJurusan() + "\nStatus : " + (mahasiswa1.getStatus() ? "Menikah" : "Lajang") + "\n");
    }
  }

  public static Mahasiswa cariMahasiswa(String nama) {
    for(Mahasiswa mahasiswa1 : mhs) {
        if(mahasiswa1.getNama().equals(nama)) {
            System.out.println("Data mahasiswa atas nama " + nama + " ditemukan");
            return mahasiswa1;
        }
    } System.out.println("Data mahasiswa atas nama " + nama + " tidak ditemukan\n");
    return null;
  }

  public static void tampilMahasiswa() {
    System.out.println("Data Mahasiswa sebelum dilakukan update:");
    for (int i = 2; i < mhs.size(); i++) {
        Mahasiswa mahasiswa1 = mhs.get(2);
        System.out.println("Nama: " + mahasiswa1.getNama() + "\nJurusan: " + mahasiswa1.getJurusan() + "\nStatus: " + (mahasiswa1.getStatus() ? "Menikah" : "Lajang"));
    }
  }
  
    public static void updateMahasiswa(String nama, String jurusan, boolean status) {
      for (int i = 2; i < mhs.size(); i++) {
        Mahasiswa mahasiswa1 = mhs.get(2);
        System.out.println("\nData mahasiswa setelah dilakukan update.");
          if (mahasiswa1.getNama().equals(nama)) {
              mahasiswa1.setNama("Rayhan Sitepu");
              mahasiswa1.setJurusan(jurusan);
              mahasiswa1.setStatus(status);
              System.out.println("Nama: " + mahasiswa1.getNama() + "\nJurusan: " + mahasiswa1.getJurusan() + "\nStatus: " + (mahasiswa1.getStatus() ? "Menikah" : "Lajang"));
          }
      }
    }
}