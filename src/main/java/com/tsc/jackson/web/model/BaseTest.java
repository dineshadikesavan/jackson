package com.tsc.jackson.web.model;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

public class BaseTest {

    BeerDto getDto() {
        return BeerDto.builder()
                .beerName("Pale Ale")
                .beerStyle("Alle Ale")
                .id(UUID.randomUUID())
                .createdDate(OffsetDateTime.now())
                .lastModifiedDate(OffsetDateTime.now())
                .price(new BigDecimal("9.99"))
                .upc(1321564654654L)
                .build();
    }
}
