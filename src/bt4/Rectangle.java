package bt4;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    //Khi kế thừa 1 abstract class thì phải triển khai phương thức abstract (non-abstract)
    @Override
    public double getArea() {
        //Tính diện tích
        return width * height;
    }
}
