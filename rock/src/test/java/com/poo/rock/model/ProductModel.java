package com.poo.rock.model;

import jakarta.persistence.*;

@Entity
@Table(name = "TBPRODUTO")
public class ProductModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "COPRODUTO")
    private int cdProduto;

}
