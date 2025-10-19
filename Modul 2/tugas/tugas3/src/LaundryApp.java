import java.util.Scanner;

public class LaundryApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama;
        String layanan;
        double berat;
        double total = 0;

        System.out.println("=== APLIKASI LAUNDRY ===");
        System.out.print("Masukkan nama pelanggan: ");
        nama = input.nextLine();

        System.out.println("Pilih layanan: ");
        System.out.println("1. Cuci Kering - Rp7000/kg");
        System.out.println("2. Cuci Setrika - Rp10000/kg");
        System.out.println("3. Setrika Saja - Rp5000/kg");
        System.out.print("Masukkan pilihan (1-3): ");
        int pilihan = input.nextInt();

        System.out.print("Masukkan berat cucian (kg): ");
        berat = input.nextDouble();

        if (pilihan == 1) {
            layanan = "Cuci Kering";
            total = 7000 * berat;
        } else if (pilihan == 2) {
            layanan = "Cuci Setrika";
            total = 10000 * berat;
        } else {
            layanan = "Setrika Saja";
            total = 5000 * berat;
        }

        System.out.println("\n STRUK LAUNDRY");
        System.out.println("Nama: " + nama);
        System.out.println("Layanan: " + layanan);
        System.out.println("Berat: " + berat + " kg");
        System.out.println("Total Bayar: Rp" + total);
        System.out.println("======================");
    }
}
