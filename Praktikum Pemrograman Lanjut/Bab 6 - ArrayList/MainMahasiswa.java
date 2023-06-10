public class MainMahasiswa {
  public static void main(String[] args) {
    DataMahasiswa.tambahMahasiswa(new Mahasiswa("Denar Abidin", "Pendidikan Teknologi Informasi", false));
    DataMahasiswa.tambahMahasiswa(new Mahasiswa("Grenda Jamaludin", "Ilmu Komputer", true));
    // Lakukan modifikasi data tambah mahasiswa ...
    DataMahasiswa.tambahMahasiswa(new Mahasiswa("Rayhan Priambodo", "Teknik Informatika", false));
    
    // Method tampilSemuaData
    DataMahasiswa.tampilSemuaData();

    // Method cariMahasiswa (jika data ada)
    DataMahasiswa.cariMahasiswa("Grenda Jamaludin");
    // Method cariMahasiswa (jika data tidak ada)
    DataMahasiswa.cariMahasiswa("Grenda Jamaludi");

    // Method tampilMahasiswa (sebelum diupdate)
    DataMahasiswa.tampilMahasiswa();

    // Method tampilMahasiswa (setelah diupdate)
    DataMahasiswa.updateMahasiswa("Rayhan Priambodo", "Magister Ilmu Komputer", true);
  }
}