import java.util.Scanner;

public class Tugas6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Kode Plat Nomor Kendaraan: ");
        String input = scanner.nextLine().toUpperCase();

        String kota;

        switch (input.charAt(0)) {
            case 'A':
                kota = "Aceh";
                break;
            case 'B':
                kota = "Banten";
                break;
            case 'C':
                kota = "Jember, Banyuwangi, Bondowoso, Situbondo";
                break;
            case 'D':
                kota = "DKI Jakarta";
                break;
            case 'E':
                kota = "Jawa Timur";
                break;
            case 'G':
                kota = "Gorontalo";
                break;
            case 'H':
                kota = "Jawa Barat";
                break;
            case 'I':
                kota = "Irian Jaya";
                break;
            case 'J':
                kota = "Jambi";
                break;
            case 'K':
                kota = "Kalimantan";
                break;
            case 'L':
                kota = "Lampung";
                break;
            case 'M':
                kota = "Maluku";
                break;
            case 'N':
                kota = "Sumatra Utara";
                break;
            case 'P':
                kota = "Papua";
                break;
            case 'R':
                kota = "Riau";
                break;
            case 'S':
                kota = "Sumatra Selatan";
                break;
            case 'T':
                kota = "Jawa";
                break;
            case 'U':
                kota = "Nusa Tenggara Barat";
                break;
            case 'V':
                kota = "Yogyakarta";
                break;
            default:
                kota = "Tidak Terdeteksi Ada Anomali";
                break;
        }
            if (input.charAt(0) >= 'W'&& input.charAt(0) >= 'X' && input.charAt(0) >= 'Y' && input.charAt(0) <= 'Z') {
                System.out.println("Tidak Terdeteksi Anomali");

             }else{ System.out.println("Plat Kode Tersebut Untuk Daerah: " + kota);
            }
        }
    }
