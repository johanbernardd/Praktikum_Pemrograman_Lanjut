import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.io.FileWriter;

class MainTugasPrak6Mar23 {
    private String kategori;
    private String penulis;
    private String judul;
    private String bahasa;
    private String penerbitan;
    private String edisi;
    private int halaman;
    private String[] penulisbanyak = new String[0];
    private String sinopsis;
    
    public MainTugasPrak6Mar23() {
    }

    public MainTugasPrak6Mar23(String judul, String kategori, String penulis, String penerbitan, String bahasa, 
        String edisi, int halaman, String[] penulisbanyak, String sinopsis) {
            this.kategori = kategori;
            this.penulis = penulis;
            this.judul = judul;
            this.bahasa = bahasa;
            this.penerbitan = penerbitan;
            this.edisi = edisi;
            this.halaman = halaman;
            this.sinopsis = sinopsis;
    }

    public MainTugasPrak6Mar23(String judul, String kategori, String[] penulisbanyak, String penerbitan, String bahasa, 
        String edisi, int halaman, String sinopsis) {
            this.kategori = kategori;
            this.penulisbanyak = penulisbanyak;
            this.judul = judul;
            this.bahasa = bahasa;
            this.penerbitan = penerbitan;
            this.edisi = edisi;
            this.halaman = halaman;
            this.sinopsis = sinopsis;
    }

    public String[] getpenulisbanyak() {
        return penulisbanyak;
    }

    public void setPenulisbanyak(String[] s) {
        this.penulisbanyak = s;
    }

    public void setKategori(String s) {
        kategori = s;
    }

    public void setPenulis(String s) {
        penulis = s;
    }

    public void setJudul(String s) {
        judul = s;
    }

    public void setPenerbitan(String s) {
        penerbitan = s;
    }

    public void setEdisi(String i) {
        edisi = i;
    }

    public void setHalaman(int i) {
        halaman = i;
    }

    public void setBahasa(String s) {
        bahasa = s;
    }

    public void setSinopsis(String s) {
        if (s.split("\\s+").length < 10) {
            System.out.println("Sinopsis Error: Minimum sinopsis yakni 10 kata");
        } else {
            this.sinopsis = s;
        }
    }

    public int jumlahKataSinopsis() {
        if (this.sinopsis == null) {
            return 0;
        } else {
            String[] kataSinopsis = this.sinopsis.split("\\s+");
            return kataSinopsis.length;
        }
    }

    public int cekKesamaan(MainTugasPrak6Mar23 lainnya) {
        int start = 0;
        int totalAtribut = 8;
        if (this.kategori.equals(lainnya.kategori)) {
            start++;
        }
        if (this.penulis.equals(lainnya.penulis)) {
            start++;
        }
        if (this.judul.equals(lainnya.judul)) {
            start++;
        }
        if (this.bahasa.equals(lainnya.bahasa)) {
            start++;
        }
        if (this.penerbitan.equals(lainnya.penerbitan)) {
            start++;
        }
        if (this.edisi.equals(lainnya.edisi)) {
            start++;
        }
        if (this.halaman == lainnya.halaman) {
            start++;
        }
        if (Arrays.equals(this.penulisbanyak, lainnya.penulisbanyak)) {
            start++;
        }
        if (this.sinopsis.equals(lainnya.sinopsis)) {
            start++;
        }
        return (int) (((double) start / totalAtribut) * 100);
    }

    public MainTugasPrak6Mar23 copy() {
        MainTugasPrak6Mar23 copy = new MainTugasPrak6Mar23(this.judul, this.kategori, this.penulisbanyak, this.penerbitan, this.bahasa, this.edisi, this.halaman, this.sinopsis);
        return copy;
    }
    
    public void bacaFile(String pathFile) {
        try {
            BufferedReader bacaan = new BufferedReader(new FileReader(pathFile));
            String isiFile = bacaan.readLine();
            while (isiFile != null) {
                String[] value = isiFile.split("; ");
            if (value.length == 2) {
                this.setJudul(value[0]);
                this.setPenulis(value[1]);
            } else if (value.length > 2) {
                this.setJudul(value[0]);
                this.setPenulisbanyak(Arrays.copyOfRange(value, 1, value.length));
            }
            isiFile = bacaan.readLine();
            } bacaan.close();
        } 
        catch (IOException c) {
            c.printStackTrace();
        }
    }

    public void simpanFile(String namaFile) {
        try {
            FileWriter writer = new FileWriter(namaFile);
            writer.write("Kategori: " + kategori + "\n");
            writer.write("Penulis: " + penulis + "\n");
            writer.write("Judul: " + judul + "\n");
            writer.write("Bahasa: " + bahasa + "\n");
            writer.write("Penerbitan: " + penerbitan + "\n");
            writer.write("Edisi: " + edisi + "\n");
            writer.write("Halaman: " + halaman + "\n");
            writer.write("Sinopsis: " + sinopsis + "\n");
            writer.write("Penulis Banyak: ");
            for (String penulis : penulisbanyak) {
                writer.write(penulis + "; ");
            }
            writer.write("\n");
            writer.close();
            System.out.println("Data berhasil disimpan ke dalam file.");
        } catch (IOException exception) {
            System.out.println("Terjadi kesalahan saat ingin menyimpan data ke dalam file.");
            exception.printStackTrace();
        }
    }

    //mengasumsikan bahwa penjualan semua buku sama nilainya yakni 500 buku
    double penjualan = 500.0;
    public double hitungRoyalti(double hargaBuku) {
        double result = penjualan * hargaBuku * 0.1;
            return result;
    }

    public double hitungRoyalti2 (double hargaBuku2, double persen) {
        double result2 = penjualan * hargaBuku2 * (persen/100);
            return result2;
    }

    public void displayMessage() {
        System.out.println(judul);
        System.out.println("Informasi Buku: ");
        System.out.println("Kategori : " + kategori);
        if (this.penulisbanyak == null) {
            System.out.println("Penulis : " + penulis);
        } else {
            System.out.println("Penulis : " + Arrays.toString(penulisbanyak).replace("[", "").replace("]",
                    ""));
        }
        System.out.println("Penerbitan : " + penerbitan);
        System.out.println("Bahasa : " + bahasa);
        System.out.println("Edisi : " + edisi);
        System.out.println("Jumlah Halaman : " + halaman);
        System.out.println("Sinopsis : " + sinopsis);
        System.out.println("Jumlah kata sinopsis : " + jumlahKataSinopsis());
    }
}