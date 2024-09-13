package ra.demo4;

import java.util.Scanner;

public class Sale implements IEmployee{
    private String code;
    private double bonusSalary;

    //Constructor
    public Sale() {
    }

    public Sale(String code, double bonusSalary) {
        this.code = code;
        this.bonusSalary = bonusSalary;
    }

    public void callVideo(){
        System.out.println("Sale đang gọi khách hàng");
    }

    @Override
    public void inputData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào mã nhân viên");
        this.code = sc.nextLine();
        System.out.println("Nhập vào lương thưởng");
        this.bonusSalary = Double.parseDouble(sc.nextLine());
    }

    @Override
    public void displayData() {
        System.out.println("Mã nhân viên: " + this.code);
        this.calSalary();
    }

    @Override
    public void calSalary() {
        System.out.println("lương: " + (this.bonusSalary + SALARY));
    }
}
