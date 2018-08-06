import framework.*;

public class Main {

    public static void main(String[] args) {
        PriceResource priceResource = new PriceResource();
        System.out.println("The requested product price is " + priceResource.getProductPrice().getPrice());
    }
}