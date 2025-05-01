package com.example.ordermanagement.entity;

@Entity
public class Product {
 @Id @GeneratedValue private Long id;
 private String name;
 private int stock;
}