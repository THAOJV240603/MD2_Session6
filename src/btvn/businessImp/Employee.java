package btvn.businessImp;

import btvn.business.IEmployee;

import java.util.Scanner;

public class Employee implements IEmployee {
    private String id;
    private String name;
    private int year;
    private float rate;
    private float commission;
    private float salary;
    private boolean status;

    //Constructor
    public Employee() {
    }

    public Employee(String id, String name, int year, float rate, float commission, float salary, boolean status) {
        this.id = id;
        this.name = name;
        this.year = year;
        this.rate = rate;
        this.commission = commission;
        this.salary = salary;
        this.status = status;
    }

    //Getter, setter
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public float getRate() {
        return rate;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }

    public float getCommission() {
        return commission;
    }

    public void setCommission(float commission) {
        this.commission = commission;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public void inputData(Scanner sc) {
        System.out.println("Nhập thông tin nhân viên:");
        System.out.print("ID: ");
        this.id = sc.nextLine();
        System.out.print("Tên: ");
        this.name = sc.nextLine();
        System.out.print("Năm sinh: ");
        this.year = Integer.parseInt(sc.nextLine());
        System.out.print("Hệ số lương: ");
        this.rate = Float.parseFloat(sc.nextLine());
        System.out.print("Hoa hồng: ");
        this.commission = Float.parseFloat(sc.nextLine());
        System.out.print("Tình trạng: ");
        this.status = Boolean.parseBoolean(sc.nextLine());
    }

    @Override
    public void displayData() {
        System.out.println("======== Thông tin nhân viên ========");
        System.out.println("ID: " + this.id);

        System.out.println("Tên: " + this.name);

        System.out.println("Năm sinh: " + this.year);

        System.out.println("Hệ số lương: " + this.rate);

        System.out.println("Hoa hồng: " + this.commission);

        System.out.println("Tình trạng: " + (this.status? "Đang làm viêc" : "Đã nghỉ"));
    }


    //Phương thức tính lương
    public float calSalary() {
        return (float) (this.rate*BASIC_SALARY+this.commission);
    }
}
