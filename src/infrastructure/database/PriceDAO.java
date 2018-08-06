package infrastructure.database;

import java.util.HashMap;
import java.util.Map;

import infrastructure.database.model.DynamoPrice;

public class PriceDAO {
    // This class would extend CrudRepository but instead it will be a stub

    private final Map<String, DynamoPrice> prices;

    public PriceDAO() {
        prices = new HashMap<>();

        DynamoPrice priceOne = new DynamoPrice();
        priceOne.setNowFrom(35D);
        
        DynamoPrice priceTwo = new DynamoPrice();
        priceTwo.setNowFrom(50D);

        prices.put("1", priceOne);
        prices.put("2", priceTwo);
    }

    public DynamoPrice findPriceByID(String id) {
        return prices.get(id);
    }
}