//Link Hackerrank: https://www.hackerrank.com/contests/pertemuan-2-constructor-dan-instance-method/challenges/yuk-checkout-buah/problem

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

//import TugasInheritance.Manusia;

class Buah {
    String namaBuah;
    int stok;

    public Buah(String namaBuah, int stok) {
    this.namaBuah = namaBuah;
    this.stok = stok;
    }

    void getSisaBuah(int jumlahBeli) {
        if (stok == 0 || jumlahBeli == 0) {
            System.out.println("NA");
        }
        else if (jumlahBeli < stok) {
            stok -= jumlahBeli;
            System.out.println("Berhasil checkout buah");
            System.out.println("Sisa buah = " + stok);
        }
            else {
            System.out.println("Gagal checkout buah");
    }
    }
}

class Manusia {
    String namaManusia;
    int jumlahBeli;

    public Manusia(int jumlahBeli) {
    this.namaManusia = namaManusia;
    this.jumlahBeli = jumlahBeli;
    }
    
    void jumlahBeli(Buah buah) {
        buah.getSisaBuah(this.jumlahBeli);
    }
}

public class hackerrank6maret {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        String namaBuah = input.nextLine();
        int stok = input.nextInt();
        int jumlahBeli = input.nextInt();

        Manusia objek1 = new Manusia(jumlahBeli);
        Buah objek2 = new Buah(namaBuah, stok);
        objek1.jumlahBeli(objek2);
    }
}