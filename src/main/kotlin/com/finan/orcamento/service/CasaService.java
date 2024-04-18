package com.finan.orcamento.service;

import com.finan.orcamento.model.Casa;
import com.finan.orcamento.repositories.CasaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CasaService {
    @Autowired
    private CasaRepository casaRepository;

    public List<Casa> buscarcasa(){
        return CasaRepository.findAll();
    }


    public Casa cadastrarCasa(Casa usuarioModel){
        return CasaRepository.save(usuarioModel);
    }


    public void deletaCasa(Long id){
        CasaRepository.deleteById(id);
    }
}

