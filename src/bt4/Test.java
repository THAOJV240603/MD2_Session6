package bt4;

public class Test {
    public static void main(String[] args) {
        //Không khởi tạo đối tượng thông qua khai báo như bình thường
//        Shape shape = new Shape() {
//            //lớp nặc danh
//            @Override
//            public double getArea() {
//                return 0;
//            }
//        }

        Shape circle = new Circle(40);
        //return thì phải in sout
        //circle.getArea();
        System.out.println("Diện tích hình tròn: " + circle.getArea());

        Shape rectangle = new Rectangle(10, 20);
        System.out.println("Diện tích hình chữ nhật: " + rectangle.getArea());
    }
}
