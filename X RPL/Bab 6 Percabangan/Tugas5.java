import java.util.Scanner;

public class Tugas5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Angka Diantara 1 dan 7: ");
        int input = scanner.nextInt();

        String Hari = null;

        switch (input) {
            case 1:
                Hari = "Minggu";
                break;
            case 2:
                Hari = "Senin";
                break;
            case 3:
                Hari = "Selasa";
                break;
            case 4:
                Hari = "Rabu";
                break;
            case 5:
                Hari = "Kamis";
                break;
            case 6:
                Hari = "Jum'at";
                break;
            case 7:
                Hari = "Sabtu";
                break;
            default:
                break;

        }
            if (input >= 8) {
                System.out.println("Hari Yang Diinput Salah");
            } else {
                System.out.println("Hari yang sesuai dengan nomor masukan adalah " + Hari);
            }
    }
}
