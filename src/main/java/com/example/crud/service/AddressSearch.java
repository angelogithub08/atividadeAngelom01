package com.example.crud.service;

import com.example.crud.domain.address.Adds;
import com.example.crud.domain.product.Product;
import com.example.crud.domain.product.ProductRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class AddressSearch {

    private final RestTemplate restTemplate;
    private final ObjectMapper objectMapper;
    private final ProductRepository productRepository;

    public AddressSearch(RestTemplate restTemplate, ObjectMapper objectMapper, ProductRepository productRepository) {
        this.restTemplate = restTemplate;
        this.objectMapper = objectMapper;
        this.productRepository = productRepository;
    }

    public String searchAddress(String state, String city, String street) {
        String url = "https://viacep.com.br/ws/{state}/{city}/{street}/json/";

        Map<String, String> uriVariables = new HashMap<>();
        uriVariables.put("state", state);
        uriVariables.put("city", city);
        uriVariables.put("street", street);

        ResponseEntity<String> response = restTemplate.getForEntity(url, String.class, uriVariables);

        try {
            List<Adds> addresses = objectMapper.readValue(response.getBody(), objectMapper.getTypeFactory().constructCollectionType(List.class, Adds.class));
            String cep = addresses.get(0).getCep();
            return cep;
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return null;
        }
    }

    public boolean cityEqualDistribution(String cep, String id) {
        String url = "https://viacep.com.br/ws/{cep}/json";
        Product product = productRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Produto não encontrado"));

        Map<String, String> uriVariables = new HashMap<>();
        uriVariables.put("cep", cep);

        ResponseEntity<Map> response = restTemplate.getForEntity(url, Map.class, uriVariables);

        if (response.getBody() == null) {
            return false;
        }

        String city = (String) response.getBody().get("localidade");
        if (city.equalsIgnoreCase(product.getDistribution_center())) {
            return true;
        }
        return false;
    }
}
