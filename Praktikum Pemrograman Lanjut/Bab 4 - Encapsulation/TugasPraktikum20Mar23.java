import java.util.Scanner;

public class TugasPraktikum20Mar23 {
    private double saldo;
    private String noPelanggan, nama;

    public TugasPraktikum20Mar23(double saldo, String noPelanggan, String nama) {
        this.saldo = saldo;
        this.noPelanggan = noPelanggan;
        this.nama = nama;
    } 
    public double getSaldo() {
        return saldo;
    }
    public String getNoPelanggan() {
        return noPelanggan;
    }
    public String getNama() {
        return nama;
    }

    private boolean checkAutentikasi(int pin) {
        Scanner input = new Scanner(System.in);
        int percobaan = 0;
        while(pin != 123456 && percobaan < 2) {
            System.out.println("PIN salah! Coba lagi");
            percobaan++;
            pin = input.nextInt();
        }
        return (pin == 123456);
    }

    // SILVER = 38;
    // GOLD = 56;
    // PLATINUM = 74;

    public boolean pembelian (double harga) {
       double cashback = 0;
       boolean berhasil = false;
        if (this.noPelanggan.substring(0,2).equals("38")) {
            if (harga > 1000000) {
                cashback = harga * 0.05;
            }
        } else if (this.noPelanggan.substring(0,2).equals("56")) {
            if (harga > 1000000) {
                cashback = (harga * 0.07);
            } else {
                cashback = harga * 0.02;
            }
        } else if (this.noPelanggan.substring(0,2).equals("74")) {
            if (harga > 1000000) {
                cashback = harga * 0.1;
            } else {
                cashback = harga * 0.05;
            }
        }
        double totalHarga = harga - cashback;
        if (totalHarga >= 10000 && this.saldo >= totalHarga) {
            this.saldo -= totalHarga;
            System.out.println(this.saldo);
            berhasil = true;
        }
        return berhasil;
    }

    public boolean topUp(double jumlahTopUp) {
        boolean berhasil = false;
        if (jumlahTopUp >= 0) {
            saldo += jumlahTopUp;
            System.out.println(this.saldo);
            berhasil = true;
        }
        return berhasil;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nama: ");
        String nama = input.nextLine();
        System.out.print("No.Pelanggan: ");
        String noPelanggan = input.nextLine();
        System.out.print("Saldo: ");
        double saldo = input.nextDouble();
        
        TugasPraktikum20Mar23 proses = new TugasPraktikum20Mar23(saldo, noPelanggan, nama);
        boolean autentikasiBerhasil = false;

        System.out.println("Verifikasi data");
        int batasKesalahanAutentikasi = 0;
        while(!autentikasiBerhasil && batasKesalahanAutentikasi < 2) {
            System.out.print("PIN: ");
            int pin = input.nextInt();
            autentikasiBerhasil = proses.checkAutentikasi(pin);

            if(!autentikasiBerhasil) {
                System.out.println("Gagal memasukkan pin yang benar sebanyak 3x. Akun diblokir");
                System.exit(0);
            }
        }

        boolean diulang = true;
        while (diulang) {
            System.out.println();
            System.out.println("Halo " + proses.getNama() + ", Menu:");
            System.out.println("1. Beli barang");
            System.out.println("2. Top-up");
            System.out.println("3. Keluar");

            System.out.print("Pilihan menu: ");
            int pilihanMenu = input.nextInt();
            
            switch (pilihanMenu) {
                case 1:
                    System.out.print("Total Harga: ");
                    double totalHarga = input.nextDouble();
                    proses.pembelian(totalHarga);
                    
                    if (proses.pembelian(totalHarga) == true) {
                        System.out.println("Saldo anda sekarang diatas!");
                        System.out.println("Transaksi berhasil!");
                    } else if (!proses.pembelian(totalHarga) == false) {
                        System.out.println("Transaksi gagal! Saldo tidak cukup.");
                    }
                    break;
                case 2:
                    System.out.print("Jumlah top up: ");
                    double jumlahTopUp = input.nextDouble();
                    proses.topUp(jumlahTopUp);
                    System.out.println("Top up sukses! Saldo Anda saat ini diatas!");
                    break;
                case 3:
                    diulang = false;
                    System.out.println("Terima kasih");
                    break;
                default:
                    System.out.println("Pilihan menu tidak valid");
            }
        }
    }
}