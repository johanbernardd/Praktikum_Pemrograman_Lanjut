public class Rasional {
    private int pembilang, penyebut;

    public Rasional(){
        pembilang=0;
        penyebut=0;
    }

    public Rasional(int pbl, int pyb){
        pembilang=pbl;
        penyebut=pyb;
    }

    //mengecek suatu bilangan adalah rasional atau bukan
    public boolean isRasional(){
        return (penyebut!= 0);
    }

    //menyederhanakan bilangan rasional
    public void sederhana() {
        int temp, A, B;
        if (this.penyebut == 0) {
            return;
        }

        A = (pembilang < penyebut) ? penyebut:pembilang;
        B = (pembilang < penyebut) ? pembilang:penyebut;

        // while (B != 0) {
        // temp = A % B;
        // A = B;
        // B = temp;
        // }

        for ( ; B != 0; temp = A % B, A = B, B = temp) {
        }

        this.pembilang /= A;
        this.penyebut /= A;

        if (this.penyebut < 0) {
            this.penyebut = -penyebut;
            this.pembilang = -pembilang;
        } 
        else if (this.pembilang == 0) {
            this.penyebut = 1;
        }
    }

    public double cast() {
        return (penyebut == 0.0) ? 0.0 : (double)pembilang /(double)penyebut;
    }

    //operator >
    public boolean moreThan (Rasional A){
        return (pembilang * A.penyebut > penyebut * A.pembilang);
    }

    public boolean lessThan (Rasional A) {
        return (pembilang * A.penyebut < penyebut * A.pembilang);
    }

    public boolean lessThanOrEqualTo (Rasional A) {
        return (pembilang * A.penyebut <= penyebut * A.pembilang);
    }

    public boolean greaterThanOrEqualTo (Rasional A) {
        return (pembilang * A.penyebut >= penyebut * A.pembilang);
    }

    //operator Unary- ---> A = -A
    public void negasi(){
        pembilang = - pembilang;
    }

    //operator unary += \
    public void unaryPlus(Rasional A){
        pembilang = pembilang * A.penyebut + penyebut * A.pembilang;
        penyebut *= A.penyebut;
    }
    public void unaryMinus(Rasional A){
        pembilang = pembilang * A.penyebut - penyebut * A.pembilang;
        penyebut *= A.penyebut;
    }
    public void unaryTimes(Rasional A){
        pembilang *= A.pembilang;
        penyebut *= A.penyebut;
    }
    public void unaryDivides(Rasional A){
        pembilang *=A.penyebut;
        penyebut *= A.pembilang;
    }
    
    public void cetak(){
        System.out.println(pembilang + "/" + penyebut);
    }
}