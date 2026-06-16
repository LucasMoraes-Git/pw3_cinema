package br.com.etechoracio.ingresso.repository;

import br.com.etechoracio.ingresso.dto.SessaoBuscarDTO;
import br.com.etechoracio.ingresso.entity.Sessao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface SessaoRepository extends JpaRepository<Sessao, Integer> {

    @Query(value = "SELECT * FROM TBL_SESSAO WHERE TBL_SESSAO.ID_FILME = :id_filme", nativeQuery = true)
    List<Sessao> retornarSessaoBuscar(@Param("id_filme") Long idFilme);
}
