public class Food extends Product {
    String expired;

    public Food(String name, double price, String expired) {
        super(name, price);
        this.expired = expired;
    }

    public String getExpired() {
        return expired;
    }

    public void setExpired(String expired) {
        this.expired = expired;
    }

    // Overiding
    public void infoProduct(){
        super.infoProduct();
        System.out.println("Expired :" + getExpired());
    }
}
//