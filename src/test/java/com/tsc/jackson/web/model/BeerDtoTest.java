package com.tsc.jackson.web.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;

import static org.junit.jupiter.api.Assertions.*;

@JsonTest
class BeerDtoTest extends BaseTest {

    @Autowired
    ObjectMapper objectMapper;

    @Test
    void testSerializeDto() throws JsonProcessingException {
        BeerDto beerDto = getDto();

        String jsonString = objectMapper.writeValueAsString(beerDto);
        System.out.println(jsonString);
    }

    @Test
    void testDeserialize() throws JsonProcessingException {

        String jsonString = "{\"version\":null,\"createdDate\":\"2024-12-14T11:48:36-0600\",\"lastModifiedDate\":\"2024-12-14T11:48:36-0600\",\"beerName\":\"Pale Ale\",\"beerStyle\":\"Alle Ale\",\"upc\":1321564654654,\"price\":\"9.99\",\"quantityOnHand\":null,\"myLocalDate\":\"20241214\",\"beerId\":\"3012471d-4a81-4518-a570-271c14ad0626\"}";

        BeerDto beerDto = objectMapper.readValue(jsonString, BeerDto.class);
        System.out.println(beerDto);
    }


}