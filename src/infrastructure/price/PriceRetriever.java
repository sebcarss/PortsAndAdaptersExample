package infrastructure.price;

import infrastructure.price.model.ProductPrice;

public interface PriceRetriever {
    ProductPrice getProductPrice(String id);
}