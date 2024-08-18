package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Entity
@Table(name = "Loyalty")
@Data
public class Loyalty {

    @Id
    @GeneratedValue
    private UUID id;

    @Column(nullable = false, length = 100)
    private Long points;

//    @JoinColumn
//    private User user;


}
