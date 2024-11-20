public class tugas7 {
    public static void main(String[] args) {
        boolean hasilperbandingan;
        int a = 10;
        int b = 15;

        System.out.println("Nilai a = " + a + "\nilai b = " + b + "\n");

        // membandingkan apakah a sama dengan b?
        hasilperbandingan = a == b;
                System.out.println("Apakah a sama dengan b? " + hasilperbandingan);

        // membandingkan apakah a tidak sama dengan b?  
        hasilperbandingan = a != b;
                        System.out.println("Apakah a tidak sama dengan b? " + hasilperbandingan);

        // apakah a lebih besar dari b?
        hasilperbandingan = a > b;
                                 System.out.println("Apakah a lebih besar dari b? " + hasilperbandingan);
        
        // membandingkan a lebih kecil dari b?
        hasilperbandingan = a < b;
                                     System.out.println("Apakah a lebih kecil dari b? " + hasilperbandingan);
        
        // membandingkan a lebih besar sama dengan b?
        hasilperbandingan = a >= b;
                                     System.out.println("Apakah a lebih besar sama dengan b? " + hasilperbandingan);
        
        // membandingkan a lebih kecil sama dengan b?
        hasilperbandingan = a <= b;
                                     System.out.println("Apakah a lebih kecil sama dengan b? " + hasilperbandingan);
    }
}
