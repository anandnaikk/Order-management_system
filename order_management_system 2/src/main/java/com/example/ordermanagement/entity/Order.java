package com.example.ordermanagement.entity;

@Entity
public class Order {
 @Id @GeneratedValue private Long id;
 private String status;
}