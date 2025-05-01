package com.example.ordermanagement.entity;

@Entity
public class User {
 @Id @GeneratedValue private Long id;
 private String username;
 private String role;
}