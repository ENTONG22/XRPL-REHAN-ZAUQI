import java.util.Scanner;

public class tugas13 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Berikut ini manakah yang termasuk jenis operator di dalam pemrograman Java?");
    System.out.println("A) Operator Indosat");
    System.out.println("B) Operator Aritmatika");
    System.out.println("C) Operator Telkomsel");
    System.out.println("D) Operator Assignment");

    System.out.print("Masukkan Jawaban Anda (A, B, C, Atau D): ");
    String answer = scanner.next();

    String jawaban1 = "B";
    String jawaban2 = "D";

    if (answer.equals(jawaban1) || answer.equals(jawaban2)) {
      System.out.println("Benar! Anda menjawab salah satu dari pilihan jawaban yang benar.");
    } else {
      System.out.println("Salah. Jawaban yang benar adalah Operator Aritmatika atau Operator Assignment.");
    }
  }
}