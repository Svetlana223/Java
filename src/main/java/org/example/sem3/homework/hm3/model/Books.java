package org.example.sem3.homework.hm3.model;

import lombok.AllArgsConstructor;
import lombok.Data;

//Сведения о книге состоят из названия, фамилии автора, цены, года издания и количества страниц.
@Data
@AllArgsConstructor
public class Books {
    private String name;
    private String author;
    private Double price;
    private Integer year;
    private Integer page;
}
