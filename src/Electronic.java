public class Electronic extends Product {
    int waranty;

    public Electronic(String name, double price, int waranty) {
        super(name, price);
        this.waranty = waranty;
    }

    public int getWaranty() {
        return waranty;
    }

    public void setWaranty(int waranty) {
        this.waranty = waranty;
    }

    // Overiding
    public void infoProduct() {
        super.infoProduct();
        System.out.println("Waranty :" + getWaranty());
    }

}
//