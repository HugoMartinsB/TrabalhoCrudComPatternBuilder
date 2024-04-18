package com.finan.orcamento.service;

import com.finan.orcamento.model.Casa;
import com.finan.orcamento.model.UsuarioModel;
import com.finan.orcamento.repositories.CasaRepository;
import com.finan.orcamento.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CasaService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<Casa> buscarUsuario(){
        return CasaRepository.findAll();
    }

    public Casa buscaId(Long id){
        Optional<Casa> obj=CasaRepository.findById(id);
        if (obj.isPresent()) {
            return obj.get();
        } else {
            throw new RuntimeException("Usuário não encontrado");
        }
    }

    public UsuarioModel cadastrarUsuario(UsuarioModel usuarioModel){
        return usuarioRepository.save(usuarioModel);
    }


    public void deletaUsuario(Long id){
        usuarioRepository.deleteById(id);
    }
}

