import java.util.Scanner;

public class SearchNilai23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen array: ");
        int jumlah = sc.nextInt();
        int[] nilai = new int[jumlah];

        System.out.println("Masukkan nilai-nilai elemen array:");
        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Nilai ke-" + (i + 1) + ": ");
            nilai[i] = sc.nextInt();
        }

        System.out.print("\nMasukkan nilai yang ingin dicari (key): ");
        int key = sc.nextInt();

        boolean ditemukan = false;
        int indeksHasil = -1;

        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] == key) {
                ditemukan = true;
                indeksHasil = i;
                break;
            }
        }

        if (ditemukan) {
            System.out.println("\nNilai " + key + " ketahuan! Ditemukan pada indeks ke-" + indeksHasil + " (urutan ke-"
                    + (indeksHasil + 1) + ").");
        } else {
            System.out.println("\nMaaf, Nilai \"" + key + "\" tidak ditemukan di dalam array.");
        }

    }
}
