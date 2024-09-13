package bt4;

//Tạo abstract class tên là Shape
public abstract class Shape {
    private String color;

    public Shape() {
    }

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //Phương thức trừu tượng tính diện tích
    public abstract double getArea();

    //Phương thức hiển thị màu sắc
    public void display(){
        System.out.println("Màu sắc: " + color);
    }
}
