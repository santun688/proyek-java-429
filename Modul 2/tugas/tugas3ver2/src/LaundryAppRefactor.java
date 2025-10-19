import java.util.Scanner;

public class LaundryAppRefactor {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        tampilkanHeader();
        Pelanggan pelanggan = inputPelanggan();
        LayananLaundry layanan = pilihLayanan();
        tampilkanStruk(pelanggan, layanan);
    }

    // Refactoring 2: Extract Method
    private static void tampilkanHeader() {
        System.out.println("=== APLIKASI LAUNDRY ===");
    }

    private static Pelanggan inputPelanggan() {
        System.out.print("Masukkan nama pelanggan: ");
        String nama = scanner.nextLine();
        return new Pelanggan(nama);
    }

    private static LayananLaundry pilihLayanan() {
        System.out.println("Pilih layanan:");
        System.out.println("1. Cuci Kering");
        System.out.println("2. Cuci Setrika");
        System.out.println("3. Setrika Saja");
        System.out.print("Masukkan pilihan (1-3): ");
        int pilihan = scanner.nextInt();

        System.out.print("Masukkan berat cucian (kg): ");
        double berat = scanner.nextDouble();

        // Refactoring 7: Replace conditional with polymorphism
        switch (pilihan) {
            case 1: return new CuciKering(berat);
            case 2: return new CuciSetrika(berat);
            case 3: return new SetrikaSaja(berat);
            default:
                System.out.println("Pilihan tidak valid, default Cuci Kering digunakan.");
                return new CuciKering(berat);
        }
    }

    private static void tampilkanStruk(Pelanggan pelanggan, LayananLaundry layanan) {
        System.out.println("\n=== STRUK LAUNDRY ===");
        System.out.println("Nama Pelanggan : " + pelanggan.getNama());
        System.out.println("Layanan        : " + layanan.getNamaLayanan());
        System.out.println("Berat Cucian   : " + layanan.berat + " kg");
        System.out.println("Total Bayar    : Rp" + layanan.hitungBiaya());
        System.out.println("======================");
    }
}
