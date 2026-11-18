package br.unifor.gaitaofspace.controller;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.unifor.gaitaofspace.model.Personagem;
import br.unifor.gaitaofspace.service.PersonagemService;

@RestController 
public class PersonagemController {
    @Autowired
    private PersonagemService service;

    @GetMapping("/personagens")
    public ArrayList<String> listarTodosNomes() {   
        return service.getHeroes();
    }

    @GetMapping("/personagens/{nome}")
    public Personagem listarDetalhes(@PathVariable String nome) {
        return service.getHero(nome);
    }

    @PostMapping("/personagens")
    public void criarPersonagem(@RequestBody Personagem novoPersonagem) {
        service.add(novoPersonagem);
    }

    // @DeleteMapping("/personagens/{id}")
    // public void deletarPersonagem(@PathVariable int id) {
    //     personagens.remove(id);
    // }
}
