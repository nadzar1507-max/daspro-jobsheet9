import java.util.Scanner;

public class Tugas2Array23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Inisialisasi array menu dan harga kafe kampus
        String[] menu = { "Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappuccino",
                "Chocolate Ice" };
        int[] harga = { 15000, 13000, 10000, 12000, 8000, 18000, 20000 };

        System.out.println("   SELAMAT DATANG DI KAFE KAMPUS   ");
      
        System.out.println("Daftar Menu Tersedia:");
        for (int i = 0; i < menu.length; i++) {
            System.out.println("- " + menu[i] + " (Rp " + harga[i] + ")");
        }
       
        System.out.print("Masukkan nama makanan/minuman yang ingin dicari: ");
        String cariMenu = input.nextLine();

        boolean menuDitemukan = false;
        int indeksMenu = -1;

        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(cariMenu)) {
                menuDitemukan = true;
                indeksMenu = i;
                break;
            }
        }

        if (menuDitemukan) {
            System.out.println(
                    "-> [ADA] Menu \"" + menu[indeksMenu] + "\" tersedia dengan harga Rp " + harga[indeksMenu] + "\n");
        } else {
            System.out.println("-> [TIDAK TERSEDIA] Mohon maaf, menu \"" + cariMenu + "\" tidak tersedia di kafe.\n");
        }

        System.out.print("Masukkan berapa jenis menu yang ingin dipesan: ");
        int jumlahPesanan = input.nextInt();

        String[] namaPesanan = new String[jumlahPesanan];
        int[] jumlahBeli = new int[jumlahPesanan];
        int[] subTotal = new int[jumlahPesanan];
        int totalBiayaKeseluruhan = 0;

        input.nextLine();

        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.println("\n--- Pesanan ke-" + (i + 1) + " ---");
            boolean valid = false;
            int idxDitemukan = -1;

            while (!valid) {
                System.out.print("Masukkan nama menu yang valid: ");
                String namaPesanInput = input.nextLine();

                for (int j = 0; j < menu.length; j++) {
                    if (menu[j].equalsIgnoreCase(namaPesanInput)) {
                        valid = true;
                        idxDitemukan = j;
                        break;
                    }
                }

                if (!valid) {
                    System.out.println("Menu tidak valid atau tidak ada di daftar! Silakan masukkan ulang.");
                }
            }

            System.out.print("Masukkan jumlah " + menu[idxDitemukan] + " yang ingin dibeli: ");
            int jml = input.nextInt();
            input.nextLine();

            namaPesanan[i] = menu[idxDitemukan];
            jumlahBeli[i] = jml;
            subTotal[i] = harga[idxDitemukan] * jml;
            totalBiayaKeseluruhan += subTotal[i];
        }

        System.out.println("  STRUK PEMESANAN   ");

        System.out.printf("%-20s | %-6s | %-10s\n", "Nama Menu", "Jumlah", "Subtotal");

        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.printf("%-20s | %-6d | Rp %-7d\n", namaPesanan[i], jumlahBeli[i], subTotal[i]);
        }

        System.out.println("Total Biaya Keseluruhan : Rp " + totalBiayaKeseluruhan);

        input.close();
    }
}