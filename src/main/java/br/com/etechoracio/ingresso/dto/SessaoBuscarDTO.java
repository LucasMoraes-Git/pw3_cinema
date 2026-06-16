package br.com.etechoracio.ingresso.dto;

import java.time.LocalTime;

public record SessaoBuscarDTO(Integer id, String sala, LocalTime horario, Double preco) {
}
