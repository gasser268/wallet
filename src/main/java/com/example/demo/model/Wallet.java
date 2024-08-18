package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Entity
@Table(name = "Wallet")
@Data
public class Wallet {

    @Id
    @GeneratedValue
    private UUID id;

    @Column(nullable = false, length = 100)
    private Long Balance;

//    @ManyToOne
//    @JoinColumn
//    private User user;


}
