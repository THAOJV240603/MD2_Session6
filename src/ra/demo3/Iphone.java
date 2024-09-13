package ra.demo3;

public class Iphone implements Phone, Camera {
    @Override
    public void call() {
        System.out.println("iPhone đang gọi điện");
    }

    //Có thể triển khai phương thức của riêng nó
    public void playGame(){
        System.out.println("iPhone đang chơi chém hoa quả");
    }

    @Override
    public void chup() {
        System.out.println("iPhone đang chụp ảnh");
    }
}
