package com.poo.rock.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "TBPRODUTO")
public class ProductModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CDPRODUTO")
    private int cdProduto;
    @Column(name = "NMPRODUTO")
    private String nmProduto;
    @Column(name = "DSPRODUTO")
    private String dsProduto;
    @Column(name = "VLPRODUTO")
    private Double vlProduto;
    @Column(name = "FLATIVO")
    private String flAtivo;
}
