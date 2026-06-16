package br.com.etechoracio.ingresso.mapper;

import br.com.etechoracio.ingresso.dto.SessaoBuscarDTO;
import br.com.etechoracio.ingresso.entity.Sessao;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface SessaoMapper {

    List<SessaoBuscarDTO> retornarSessaoBuscadasDTOS(List<Sessao> entities);

}
