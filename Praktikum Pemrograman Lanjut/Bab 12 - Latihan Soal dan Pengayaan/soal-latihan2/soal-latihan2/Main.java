public class Main {
  public static void main(String[] args) {
      
    Anggota a1 = new Anggota("Rendy", "123456");
    Anggota a2 = new Anggota("Rihana", "3459035");

    Buku b1 = new Buku("Algoritma Pemrograman", "Susan", 2013);
    Buku b2 = new Buku("Sistem Jaringan Komputer", "Budi", 2020);

    Perpustakaan p = new Perpustakaan();
    p.pinjamBuku(b1, a1);
    p.pinjamBuku(b2, a2);
    p.pinjamBuku(b2, a1);
    p.kembalikanBuku(b1, a1);
    p.kembalikanBuku(b1, a2);
  }
}