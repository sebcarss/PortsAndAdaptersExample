package infrastructure.price;

import domain.model.DomainPrice;
import domain.price.DomainPriceRetriever;
import domain.price.PriceRetrievable;
import infrastructure.price.model.ProductPrice;

public class ProductPriceRetriever implements PriceRetriever {

    private final PriceRetrievable priceRetriever;

    public ProductPriceRetriever() {
        priceRetriever = new DomainPriceRetriever();
    }

    public ProductPrice getProductPrice(String id) {
        DomainPrice domainPrice = priceRetriever.getDomainPrice(id);

        // Mapper to convert DomainPrice to a ProductPrice
        ProductPrice productPrice = new ProductPrice();
        productPrice.setPrice(domainPrice.getSellingPrice());

        return productPrice;
    }
}