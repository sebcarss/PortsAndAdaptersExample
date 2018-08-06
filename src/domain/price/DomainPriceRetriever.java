package domain.price;

import domain.model.DomainPrice;
import domain.repositories.PriceRepository;
import infrastructure.repositories.DynamoDBPriceRepository;

public class DomainPriceRetriever implements PriceRetrievable {

    private final PriceRepository priceRepository;

    public DomainPriceRetriever() {
        // Fake dependency injection - with Spring this would not be coupled like this
        priceRepository = new DynamoDBPriceRepository();
    }

    public DomainPrice getDomainPrice(String id) {
        return priceRepository.findPriceByID(id);
    }
}