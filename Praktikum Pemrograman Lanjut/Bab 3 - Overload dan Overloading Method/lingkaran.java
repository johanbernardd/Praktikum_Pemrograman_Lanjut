public class lingkaran {
    int alas, tinggi;

    public lingkaran(int alas){ 
        this.alas = alas; 
    }
    public lingkaran(int alas, int tinggi){ 
        this.alas = alas; 
        this.tinggi = tinggi; 
    }
    public lingkaran(String stringAlas, String stringTinggi) {
        alas = Integer.parseInt(stringAlas);
        tinggi = Integer.parseInt(stringTinggi);
    }
    // public int getAlas() {
    //     return alas;
    // }
    public void setTinggi(int tinggi){ 
        this.tinggi = tinggi; 
    }
    public int getTinggi(){ 
        return tinggi; 
    }

    public int hitungLuas(){ 
        int hasil = (getTinggi() * alas) / 2; 
        return hasil; 
    }
    public void displayMessage(){ 
        System.out.println("Hitung Luas : " + hitungLuas()); 
    }
}