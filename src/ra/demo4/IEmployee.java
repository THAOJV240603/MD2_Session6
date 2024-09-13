package ra.demo4;

public interface IEmployee {
    //Lương cơ bản
    //Hằng số: viết hoa tất cả chữ cái
    public static final double SALARY = 50;
    //Triển khai các phương thức
    //Nhập thông tin
    public void inputData();

    //Hiển thị thông tin
    public void displayData();

    //Tính lương calculateSalary
    public void calSalary();

}
