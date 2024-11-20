import java.util.Scanner;

public class tugas4 {

    public static void main(String[] args) {
        String merk;
        int ukuran;
        double harga;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Maukkan Brand Celana Anda (Gucci or Jeans): ");
        merk = scanner.nextLine();

        System.out.print("Ukuran Celana: (26-32 or 33-35): ");
        ukuran = scanner.nextInt();

        if (merk.equalsIgnoreCase("Gucci")) {
            if (ukuran >= 26 && ukuran <= 32) {
                harga = 190000;
            } else if (ukuran >= 33 && ukuran <= 35) {
                harga = 200000;
            } else {
                System.out.println("Ukuran Yang Anda Masukkan Sedang Kosong.");
                return;
            }
        } else if (merk.equalsIgnoreCase("Jeans")) {
            if (ukuran >= 26 && ukuran <= 32) {
                harga = 210000;
            } else if (ukuran >= 33 && ukuran <= 35) {
                harga = 220000;
            } else {
                System.out.println("Ukuran Yang Anda Masukkan Sedang Kosong.");
                return;
            }
        } else {
            System.out.println("Brand Yang Anda Masukkan Salah.");
            return;
        }

        System.out.println("Total Harga Adalah " + merk + " " + ukuran + " is Rp. " + harga);
    }
}