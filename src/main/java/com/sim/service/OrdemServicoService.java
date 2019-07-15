package com.sim.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sim.dto.OrdemServicoCreate;
import com.sim.exception.NotFoundException;
import com.sim.model.OrdemServico;
import com.sim.model.Poste;
import com.sim.repository.OrdemServicoRepository;

@Service
public class OrdemServicoService {
    @Autowired
    private OrdemServicoRepository repo;

    @Autowired
    private PosteService posteService;

    public OrdemServico findById(String ordem) throws NotFoundException {
        return this.repo.findById(ordem).orElseThrow(() -> new NotFoundException("Ordem de serviço não encontrado"));
    }

    public List<OrdemServico> findAll() {
        return repo.findAll();
    }

    public OrdemServico save(OrdemServicoCreate ordem) throws NotFoundException {
        Poste p = this.posteService.findById(ordem.getPoste());
        return this.repo.save(new OrdemServico(p,ordem.getDescricao(), ordem.getEquipamento()));
    }

}
