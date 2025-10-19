public class Doctor {
    private String name;

    public String getName() {
        return name;
    }

    public double calculateBonus(double salary) {
        return salary * 0.2;
    }

    public double applyBonus(double salary) {
        return salary + calculateBonus(salary);
    }
}
