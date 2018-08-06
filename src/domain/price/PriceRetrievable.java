package domain.price;

import domain.model.DomainPrice;

public interface PriceRetrievable {
    DomainPrice getDomainPrice(String id);
}