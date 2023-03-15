package org.example.sem3.homework.hm2.model;

import lombok.AllArgsConstructor;
import lombok.Data;

//Сведения о товаре состоят из наименования, страны-производителя, веса, цены, сорта.
// Получить наименования товаров заданного сорта с наименьшей ценой.
@Data
@AllArgsConstructor
public class Goods {
    private String product;
    private String country;
    private Double weight;
    private Double price;
    private Integer grade;

}
