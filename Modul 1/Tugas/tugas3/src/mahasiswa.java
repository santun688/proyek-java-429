import java.util.Scanner;

public class mahasiswa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nama mahasiswa: ");
        String nama = sc.nextLine();

        System.out.print("Masukkan nilai ujian akhir: ");
        int nilai = sc.nextInt();

        String status = (nilai >= 60) ? "Lulus" : "Tidak Lulus";
        System.out.println("Nama: " + nama + ", Status: " + status);
    }
}
