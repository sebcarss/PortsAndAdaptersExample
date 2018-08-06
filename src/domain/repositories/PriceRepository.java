package domain.repositories;

import domain.model.DomainPrice;

public interface PriceRepository {
    DomainPrice findPriceByID(String id);
}