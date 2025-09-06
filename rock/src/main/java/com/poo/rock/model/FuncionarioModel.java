package com.poo.rock.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "TBFUNCIONARIO")
public class FuncionarioModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CDFUNCIONARIO")
    private int cdFuncionario;
    @Column(name = "NMFUNCIONARIO")
    private String nmFuncionario;
    @Column(name = "DSFUNCIONARIO")
    private String dsFuncionario;
    @Column(name = "VLSALARIO")
    private Double vlSalario;
    @Column(name = "FLNUMERO")
    private String flNumero;
}
