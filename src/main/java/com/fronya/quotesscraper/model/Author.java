package com.fronya.quotesscraper.model;

import lombok.Data;

import java.util.Date;

@Data
public class Author {
    private int id;
    private String name;
    private Date birthDate;
    private Location location;
    private String description;

    @Data
    public class Location {
        private int id;
        private String country;
        private String city;
    }
}
