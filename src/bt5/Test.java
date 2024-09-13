package bt5;

public class Test {
    public static void main(String[] args) {
        PartTimeEmployee partTimeEmployee = new PartTimeEmployee("Mai", 1200, 4);
        System.out.println("Lương của Mai: " + partTimeEmployee.calculateSalary());

        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("Lâm", 500);
        System.out.println("Lương của Lâm: " + fullTimeEmployee.calculateSalary());
    }
}
