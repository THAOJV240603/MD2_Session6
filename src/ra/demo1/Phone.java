package ra.demo1;

public abstract class Phone {
    // dinh nghia cac thuoc tinh
    private String name;

    // phương thức abstract
    public abstract void call();

    // phương thức non-abstract
    public void showInfo(){
        System.out.println(this.name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
