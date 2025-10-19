public class Main {
    public static void main(String[] args) {
        Doctor doctor = new Doctor();
        double totalSalary = doctor.applyBonus(2000000);
        System.out.println("Gaji total setelah bonus: " + totalSalary);
    }
}
