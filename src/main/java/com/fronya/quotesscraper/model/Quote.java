package com.fronya.quotesscraper.model;

import lombok.Data;

import java.util.List;

@Data
public class Quote {
    private int id;
    private String value;
    private Author author;
    List<Tag> tags;
}
