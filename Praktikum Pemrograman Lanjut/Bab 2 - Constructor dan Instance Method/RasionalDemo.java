public class RasionalDemo {
    public static void main(String[] args){
        Rasional R1 = new Rasional(4,5);
        Rasional R2 = new Rasional(10,16);
        
        System.out.println("R1.isRasional: " + R1.isRasional());
        System.out.println("R2.isRasional: " + R1.isRasional());
        System.out.println();
        
        // System.out.println("R1 > R2 : " + R1.moreThan(R2));
        if (R1.moreThan(R2)) {
            System.out.println("R1 > R2 : " + R1.moreThan(R2));
        } else if (R1.lessThan(R2)) {
            System.out.println("R1 < R2 : " + R1.lessThan(R2));
        } else if (R1.lessThanOrEqualTo(R2)) {
            System.out.println("R1 <= R2 : " + R1.lessThanOrEqualTo(R2));
        } else {
            System.out.println("R1 >= R2 : " + R1.greaterThanOrEqualTo(R2));
        }
        System.out.println();
        
        System.out.print("R1 : ");
        R1.cetak();
        System.out.print("R2 : ");
        R2.cetak();
        System.out.println();
        
        System.out.println("Menyederhanakan bilangan :");
        R1.sederhana();
        R2.sederhana();
        
        System.out.print("R1 : ");
        R1.cetak();
        System.out.print("R2 : ");
        R2.cetak();
        System.out.println();
        
        System.out.println("Setelah dilakukan Cast ke double menjadi : " );
        System.out.println("R1 : " + R1.cast());
        System.out.println("R2 : " + R2.cast());
        System.out.println();

        R1.negasi();
        System.out.print("Unary- dari R1 : ");
        R1.cetak();
        System.out.println();

        R1.unaryPlus(R2);
        System.out.print("Nilai dari 'R1 += R2' : ");
        R1.cetak();

        R1.unaryMinus(R2);
        System.out.print("Nilai dari 'R1 -= R2' : ");
        R1.cetak();

        R1.unaryTimes(R2);
        System.out.print("Nilai dari 'R1 *= R2' : ");
        R1.cetak();

        R1.unaryDivides(R2);
        System.out.print("Nilai dari 'R1 /= R2' : ");
        R1.cetak();

        System.out.println();
    }
}