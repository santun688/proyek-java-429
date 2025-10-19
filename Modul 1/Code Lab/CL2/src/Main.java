import java.util.Scanner;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Masukkan umur Anda: ");
            int umur = scanner.nextInt();

            if (umur <= 0 || umur >= 120) {
                throw new InvalidAgeException("Umur tidak valid! Umur harus antara 1 dan 119.");
            }

            System.out.println("Umur Anda adalah: " + umur);

        } catch (InvalidAgeException e) {
            System.out.println("Kesalahan: " + e.getMessage());

        } catch (Exception e) {
            System.out.println("Terjadi kesalahan input. Harap masukkan angka.");
        }

        scanner.close();
    }
}


