package com.tarantsoff;

import java.util.LinkedHashMap;

public class Heap {

    public static void main(String[] args) {

        LinkedHashMap<String, String> userCityMapping = new LinkedHashMap<>();

        userCityMapping.put("Rajeev", "Bengaluru");
        userCityMapping.put("Chris", "London");
        userCityMapping.put("David", "Paris");
        userCityMapping.put("Jesse", "California");

        System.out.println("=== Iterating over a LinkedHashMap using Java 8 forEach and lambda ===");
        userCityMapping.forEach((user, city) -> System.out.println(user + " => " + city));
    }
}
