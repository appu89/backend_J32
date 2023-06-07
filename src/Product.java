public class Product {
    double price = 800.858;
    public double getprice(){
        return price;
    }
    public double setprice(double price) {
        this.price = price;
        return price;

    }
    public double getPrice(int Quantity) {
        return price*Quantity;
    }
    public double getPrice(int Quantity,int discount) {
        return price*Quantity* discount;
    }


    public static void main(String[] args) {
        Product p1 = new Product();
        System.out.println("inital price "+p1.getprice());
        System.out.println("changed price"+p1.setprice(956.00));
        System.out.println("with multiple quantity"+p1.getPrice(3));
        System.out.println("with discount price "+p1.getPrice(5,15));


    }}