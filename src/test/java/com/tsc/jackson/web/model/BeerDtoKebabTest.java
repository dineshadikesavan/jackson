package com.tsc.jackson.web.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("kebab")
@JsonTest
class BeerDtoKebabTest extends BaseTest {

    @Autowired
    ObjectMapper objectMapper;

    @Test
    void testKebabDto() throws JsonProcessingException {
        BeerDto beerDto = getDto();

        String jsonString = objectMapper.writeValueAsString(beerDto);
        System.out.println(jsonString);
    }

    @Test
    void testDeserialize() throws JsonProcessingException {

        String jsonString = "{\"version\":null,\"created-date\":\"2024-12-14T12:01:19-0600\",\"last-modified-date\":\"2024-12-14T12:01:19-0600\",\"beer-name\":\"Pale Ale\",\"beer-style\":\"Alle Ale\",\"upc\":1321564654654,\"price\":\"9.99\",\"quantity-on-hand\":null,\"my-local-date\":\"20241214\",\"beerId\":\"4a6d3ea9-bdad-4b67-b033-8e5ac9388c29\"}";

        BeerDto beerDto = objectMapper.readValue(jsonString, BeerDto.class);
        System.out.println(beerDto);
    }


}