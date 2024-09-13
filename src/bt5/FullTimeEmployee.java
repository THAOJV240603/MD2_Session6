package bt5;

public class FullTimeEmployee extends Employee{
    //Không có thuộc tính thì không cần setter, getter
    //Constructor có tham số
    public FullTimeEmployee(String name, int paymentPerHour) {
        super(name, paymentPerHour);
    }

    @Override
    public int calculateSalary() {
        return 8*super.getPaymentPerHour();
    }
}
