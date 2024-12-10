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

        String jsonString = "{\"id\":\"7c9c31e8-a5ad-417e-86f6-23afe3d05b52\",\"version\":null,\"createdDate\":\"2024-12-09T21:07:21.7507658-06:00\",\"lastModifiedDate\":\"2024-12-09T21:07:21.7507658-06:00\",\"beerName\":\"Pale Ale\",\"beerStyle\":\"Alle Ale\",\"upc\":1321564654654,\"price\":9.99,\"quantityOnHand\":null}";

        BeerDto beerDto = objectMapper.readValue(jsonString, BeerDto.class);
        System.out.println(beerDto);
    }


}