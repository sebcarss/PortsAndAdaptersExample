package framework;

import infrastructure.price.PriceRetriever;
import infrastructure.price.ProductPriceRetriever;
import infrastructure.price.model.ProductPrice;

public class PriceResource {

    private final PriceRetriever priceRetriever;

    public PriceResource() {
        // Fake dependency injection
        priceRetriever = new ProductPriceRetriever();
    }

    public ProductPrice getProductPrice() {
        return priceRetriever.getProductPrice("2");
    }
}