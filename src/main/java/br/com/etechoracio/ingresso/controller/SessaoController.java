package br.com.etechoracio.ingresso.controller;

import br.com.etechoracio.ingresso.dto.SessaoBuscarDTO;
import br.com.etechoracio.ingresso.service.SessaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/sessoes")

public class SessaoController {

    @Autowired
    private SessaoService sessaoService;

    @GetMapping("/buscarPorIdFilme/{idFilme}")
    public List<SessaoBuscarDTO> retornaSessoesPeloIdFilme(@PathVariable Long idFilme)
    {
        return sessaoService.buscarSessaosPorIdFilme(idFilme);
    }
}
