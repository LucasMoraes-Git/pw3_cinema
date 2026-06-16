package br.com.etechoracio.ingresso.service;

import br.com.etechoracio.ingresso.dto.SessaoBuscarDTO;
import br.com.etechoracio.ingresso.mapper.SessaoMapper;
import br.com.etechoracio.ingresso.repository.SessaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SessaoService {

    @Autowired
    private SessaoRepository sessaoRepository;

    @Autowired
    private SessaoMapper sessaoMapper;

    public List<SessaoBuscarDTO> buscarSessaosPorIdFilme(Long idFilme)
    {
        var sessoes = sessaoRepository.findAll();
        var sessoesFiltradas = sessoes.stream().filter(sessao -> sessao.getFilmes().stream().filter(filme -> filme.getId() == idFilme).isParallel()).toList();
        return sessaoMapper.retornarSessaoBuscadasDTOS(sessoesFiltradas);
    }
}
