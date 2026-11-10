import java.util.Scanner;

public class Tugas1Array23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan banyaknya nilai mahasiswa: ");
        int jumlah = input.nextInt();

        int[] nilaiMhs = new int[jumlah];
        int total = 0;

        System.out.println("Input Nilai Mahasiswa ");
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMhs[i] = input.nextInt();
            total += nilaiMhs[i];
        }

        double rata2 = (double) total / jumlah;

        int tertinggi = nilaiMhs[0];
        int terendah = nilaiMhs[0];

        for (int i = 1; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > tertinggi) {
                tertinggi = nilaiMhs[i];
            }
            if (nilaiMhs[i] < terendah) {
                terendah = nilaiMhs[i];
            }
        }

        int batasLulus = 60;

        System.out.println("      DAFTAR NILAI MAHASISWA      ");

        for (int i = 0; i < nilaiMhs.length; i++) {
            String status = (nilaiMhs[i] >= batasLulus) ? "LULUS" : "TIDAK LULUS";
            System.out.println("Mahasiswa ke-" + (i + 1) + " : " + nilaiMhs[i] + " (" + status + ")");
        }

        System.out.println("Banyaknya Mahasiswa : " + jumlah);
        System.out.println("Total Nilai         : " + total);
        System.out.println("Rata-rata Nilai     : " + String.format("%.2f", rata2));
        System.out.println("Nilai Tertinggi     : " + tertinggi);
        System.out.println("Nilai Terendah      : " + terendah);

        input.close();
    }
}