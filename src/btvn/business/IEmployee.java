package btvn.business;

import java.util.Scanner;

public interface IEmployee {
    public static final double BASIC_SALARY = 1300000;

    //Phương thức nhập thông tin
    public void inputData(Scanner sc);

    //Phương thức hiển thị thông tin
    public void displayData();
}
