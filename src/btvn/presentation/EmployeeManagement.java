package btvn.presentation;

import btvn.businessImp.Employee;

import java.util.Scanner;

public class EmployeeManagement {
    //Khai báo mảng gồm 1000 phần tử
    private static Employee[] list = new Employee[1000];
    private static int n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //In Menu
        do{
            System.out.println("********************MENU*********************\n" +
                    "1. Nhập thông tin cho n nhân viên\n" +
                    "2. Hiển thị thông tin nhân viên\n" +
                    "3. Tính lương cho các nhân viên\n" +
                    "4. Tìm kiếm nhân viên theo tên nhân viên\n" +
                    "5. Cập nhật thông tin nhân viên\n" +
                    "6. Xóa nhân viên theo mã nhân viên\n" +
                    "7. Sắp xếp nhân viên theo lương tăng dần\n" +
                    "8. Sắp xếp nhân viên theo tên nhân viên giảm dần\n" +
                    "9. Thoát");
            System.out.println("Nhập lựa chọn");
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    System.out.print("Nhập số lượng nhân viên: ");
                    n = Integer.parseInt(sc.nextLine());
                    //Nhập cho nhiều nv, dùng for
                    for (int i = 0; i < n; i++) {
                        System.out.println("Nhập nhân viên thứ " + (i+1) + " :");
                        //Khởi tạo đối tượng nv
                        list[i] = new Employee();
                        //Gọi đến phương thức inputData()
                        list[i].inputData(sc);
                        System.out.println("\n");
                    }
                    break;
                case 2:
                    //Hiển thị thông tin nhân viên
                    for (int i = 0; i < n; i++) {
                        list[i].displayData();
                    }
                    break;
                case 3:
                    //Tính lương
                    for (int i = 0; i < n; i++) {
                        list[i].displayData();
                        System.out.println("Lương: " + list[i].calSalary());
                    }
                    break;
                case 4:
                    break;
                case 9:
                    System.exit(0);
                default:
                    System.out.println("Sai lựa chọn");
            }
        }while (true);
    }



}
