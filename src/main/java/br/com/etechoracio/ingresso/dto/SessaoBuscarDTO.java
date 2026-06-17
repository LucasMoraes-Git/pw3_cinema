package br.com.etechoracio.ingresso.dto;

import br.com.etechoracio.ingresso.entity.Filme;

import java.time.LocalTime;

public record SessaoBuscarDTO(Integer id, String sala, LocalTime horario, Double preco, Filme filme) {
}
