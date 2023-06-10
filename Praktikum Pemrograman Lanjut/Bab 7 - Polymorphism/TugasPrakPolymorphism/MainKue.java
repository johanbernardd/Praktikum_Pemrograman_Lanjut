package TugasPrakPolymorphism;

public class MainKue {
    public static void main(String[] args) {
        Kue[] kue = new Kue[20];
        kue[0] = new KuePesanan("Kue Lapis", 8000.0, 2);
        kue[1] = new KuePesanan("Kue Klepon", 6000.0, 1);
        kue[2] = new KuePesanan("Kue Onde-onde", 5000.0, 2);
        kue[3] = new KuePesanan("Kue Lumpur", 7000.0, 1);
        kue[4] = new KuePesanan("Kue Ketan Hitam", 4000.0, 1);
        kue[5] = new KuePesanan("Kue Putu Ayu", 7000.0, 1);
        kue[6] = new KuePesanan("Kue Nagasari", 10000.0, 2);
        kue[7] = new KuePesanan("Kue Serabi", 10000.0, 1);
        kue[8] = new KuePesanan("Kue Ubi Ungu",7000.0, 1);
        kue[9] = new KuePesanan("Kue Lepet", 8000.0, 1);

        kue[10] = new KueJadi("Kue Talam", 3000.0, 2);
        kue[11] = new KueJadi("Kue Lupis", 4000.0, 1);
        kue[12] = new KueJadi("Kue Getuk", 3000.0, 1);
        kue[13] = new KueJadi("Kue Bingka Ubi", 6000.0, 2);
        kue[14] = new KueJadi("Kue Cucur", 4000.0, 3);
        kue[15] = new KueJadi("Kue Pancong", 7000.0, 3);
        kue[16] = new KueJadi("Kue Pukis", 8000.0, 2);
        kue[17] = new KueJadi("Kue Tape", 6000.0, 1);
        kue[18] = new KueJadi("Kue Dadar Gulung", 4000.0, 2);
        kue[19] = new KueJadi("Kue Mendut", 5000.0, 1);

        System.out.println("Daftar Kue:");
        for (Kue instKue : kue) {
            if (instKue != null) {
                if (instKue instanceof KuePesanan) {
                    System.out.println("Kue Pesanan -> " + instKue);
                }
                else if (instKue instanceof KueJadi) {
                    System.out.println("Kue Jadi -> " + instKue);
                }
            }
        }

        double totalHarga = 0;
        for (Kue instKue : kue) {
            if (instKue != null) {
                totalHarga += instKue.hitungHarga();
            }
        }
        System.out.println("Total Harga semua jenis kue adalah " + totalHarga);

        double totalHargaKuePesanan = 0;
        double totalBeratKuePesanan = 0;
        for (Kue instKue : kue) {
            if (instKue instanceof KuePesanan) {
                totalHargaKuePesanan += instKue.hitungHarga();
                totalBeratKuePesanan += ((KuePesanan) instKue).getBerat();
            }
        }
        System.out.println("Total Harga Kue Pesanan: " + totalHargaKuePesanan);
        System.out.println("Total Berat Kue Pesanan: " + totalBeratKuePesanan);

        double totalHargaKueJadi = 0;
        double totalJumlahKueJadi = 0;
        for (Kue instKue : kue) {
            if (instKue instanceof KueJadi) {
                totalHargaKueJadi += instKue.hitungHarga();
                totalJumlahKueJadi += ((KueJadi) instKue).getJumlah();
            }
        }
        System.out.println("Total Harga Kue Jadi: " + totalHargaKueJadi);
        System.out.println("Total Jumlah Kue Jadi: " + totalJumlahKueJadi);

        double hargaMax = 0;
        Kue kueTerbesar = null;
        for (Kue instKue : kue) {
            if (instKue != null && instKue.hitungHarga() > hargaMax) {
                hargaMax = instKue.hitungHarga();
                kueTerbesar = instKue;
            }
        }
        if (kueTerbesar != null) {
            System.out.println("Kue dengan harga terbesar: \n" + kueTerbesar);
        }
    }
}