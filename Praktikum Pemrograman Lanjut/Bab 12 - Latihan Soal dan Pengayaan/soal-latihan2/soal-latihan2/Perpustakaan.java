public class Perpustakaan implements Peminjaman {
  @Override
  public void pinjamBuku(Buku buku, Anggota anggota) {
      if (!buku.isDipinjam()) {
        buku.setDipinjam(true);
        buku.setPeminjam(anggota);
        anggota.setRiwayatPeminjaman(buku);
        System.out.println("Buku '" + buku.getJudul() + "' berhasil dipinjam oleh " 
        + anggota.getNama());
      }
      else {
        if (buku.isDipinjam() && buku.getPeminjam().equals(anggota)) {
          System.out.println("Buku '" + buku.getJudul() + "' sudah dipinjam oleh " 
        + anggota.getNama());
        }
      else {
        System.out.println("Buku '" + buku.getJudul() + "' sedang dipinjam oleh anggota lain");
      }
      }
  }

  @Override
  public void kembalikanBuku(Buku buku, Anggota anggota) {
      if (buku.isDipinjam() && buku.getPeminjam().equals(anggota)) {
        buku.setDipinjam(false);
        buku.setPeminjam(null);
        System.out.println("Buku '" + buku.getJudul() + "' berhasil dikembalikan oleh " 
        + anggota.getNama());
      }
      else {
        System.out.println("Buku '" + buku.getJudul() + "' tidak sedang dipinjam oleh anggota tersebut");
      }
  }
}