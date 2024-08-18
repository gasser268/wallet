package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Entity
@Table(name = "Transactions")
@Data
public class Transaction {

    @Id
    @GeneratedValue
    private UUID id;

    @Column(nullable = false, length = 100)
    private String type;

    @Column(nullable = false, length = 100)
    private String Date;

    @Column(nullable = false, length = 100)
    private String history;

//    @ManyToOne
//    @JoinColumn
//    private Transaction transaction;

}
