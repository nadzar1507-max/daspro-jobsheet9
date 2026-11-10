import java.util.Scanner;

public class SearchNilai23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen array: ");
        int jumlah = input.nextInt();
        int[] nilai = new int[jumlah];

        System.out.println("Masukkan nilai-nilai elemen array:");
        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Nilai ke-" + (i + 1) + ": ");
            nilai[i] = input.nextInt();
        }

        System.out.print("\nMasukkan nilai yang ingin dicari (key): ");
        int key = input.nextInt();

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
            System.out.println("Nilai " + key + " ketemu! Ditemukan pada indeks ke-" + indeksHasil);
        } else {
            System.out.println("Nilai " + key + " tidak ditemukan.");
        }
        input.close();
    }
}