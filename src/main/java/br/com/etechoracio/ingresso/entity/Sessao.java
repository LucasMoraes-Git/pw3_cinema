package br.com.etechoracio.ingresso.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

@Entity
@Table(name = "TBL_SESSAO")
@Getter
@Setter

public class Sessao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_SESSAO")
    private Integer id;

    @Column(name = "TX_DATA")
    private LocalDateTime data;

    @Column(name = "TX_HORARIO")
    private LocalTime horario;

    @Column(name = "NR_PRECO")
    private Double preco;

    @Column(name = "TX_SALA")
    private String sala;

    @JoinColumn(name = "ID_FILME")
    @ManyToOne
    List<Filme> filmes;


}
