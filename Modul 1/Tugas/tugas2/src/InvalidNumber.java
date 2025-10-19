import java.util.Scanner;

class InvalidNumberException extends Exception {
    public InvalidNumberException(String message) {
        super(message);
    }
}

public class InvalidNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan sebuah angka positif: ");
        int angka = sc.nextInt();

        try {
            if (angka <= 0) {
                throw new InvalidNumberException("Angka harus lebih besar dari 0!");
            }
            System.out.println("Valid: " + angka);
        } catch (InvalidNumberException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
