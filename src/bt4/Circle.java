package bt4;

public class Circle extends Shape {
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    //Khai báo hằng số Pi
    public static final double PI = 3.14;

    //Khi kế thừa 1 abstract class thì phải triển khai phương thức abstract (non-abstract)
    @Override
    public double getArea() {
        //Tính diện tích hình tròn
        return PI * radius * radius;
    }
}
