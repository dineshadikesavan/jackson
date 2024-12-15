package com.tsc.jackson.web.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("snake")
@JsonTest
class BeerDtoSnakeTest extends BaseTest {

    @Autowired
    ObjectMapper objectMapper;

    @Test
    void testSnakeDto() throws JsonProcessingException {
        BeerDto beerDto = getDto();

        String jsonString = objectMapper.writeValueAsString(beerDto);
        System.out.println(jsonString);
    }

    @Test
    void testDeserialize() throws JsonProcessingException {

        String jsonString = "{\"version\":null,\"created_date\":\"2024-12-14T12:00:04-0600\",\"last_modified_date\":\"2024-12-14T12:00:04-0600\",\"beer_name\":\"Pale Ale\",\"beer_style\":\"Alle Ale\",\"upc\":1321564654654,\"price\":\"9.99\",\"quantity_on_hand\":null,\"my_local_date\":\"20241214\",\"beerId\":\"ebef7e0f-27e5-4404-bc0d-cd44df95b077\"}";

        BeerDto beerDto = objectMapper.readValue(jsonString, BeerDto.class);
        System.out.println(beerDto);
    }


}