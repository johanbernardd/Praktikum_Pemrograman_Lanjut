public class Buku {
  private String judul;
  private String penulis;
  private int tahunTerbit;
  private boolean dipinjam;
  private Anggota peminjam = null;

  public Buku() {
    dipinjam = false;
  }
  public Buku(String judul, String penulis, int tahunTerbit) {
    this.judul = judul;
    this.penulis = penulis;
    this.tahunTerbit = tahunTerbit;
    dipinjam = false;
  }
  public void setJudul(String judul) {
      this.judul = judul;
  }
  public String getJudul() {
      return judul;
  }
  public void setPenulis(String penulis) {
      this.penulis = penulis;
  }
  public String getPenulis() {
      return penulis;
  }
  public void setTahunTerbit(int tahunTerbit) {
      this.tahunTerbit = tahunTerbit;
  }
  public int getTahunTerbit() {
      return tahunTerbit;
  }
  public void setPeminjam(Anggota peminjam) {
      this.peminjam = peminjam;
  }
  public Anggota getPeminjam() {
    return peminjam;
  }
  public void setDipinjam(boolean dipinjam) {
      this.dipinjam = dipinjam;
  }
  public boolean isDipinjam() {
    return dipinjam;
  }
}