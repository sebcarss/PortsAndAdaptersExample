package infrastructure.repositories;

import domain.model.DomainPrice;
import domain.repositories.PriceRepository;
import infrastructure.database.PriceDAO;
import infrastructure.database.model.DynamoPrice;

public class DynamoDBPriceRepository implements PriceRepository {

    private final PriceDAO priceDAO;

    public DynamoDBPriceRepository() {
        priceDAO = new PriceDAO();
    }

    public DomainPrice findPriceByID(String id) {
        DynamoPrice dynamoPrice = priceDAO.findPriceByID(id);

        // Mapper to convert DynamoPrice to DomainPrice
        DomainPrice domainPrice = new DomainPrice();
        domainPrice.setSellingPrice(dynamoPrice.getNowFrom().intValue());

        return domainPrice;
    }
}