package inter.basic;

public abstract class Vechicle implements IInsurance {
    String brand;
    String model;
    double price;

    public  Vechicle(String brand, String model, double price) {
        this.brand = brand;
        this.model =model;
        this.price =price;
    }
    void getDetails() {
        System.out.println("Brand is :"+brand);
        System.out.println("Model is :"+model);
        System.out.println("Price is :"+price);
    }
    abstract void getMilege();
    public  void  ins

}
