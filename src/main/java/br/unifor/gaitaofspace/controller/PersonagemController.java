package br.unifor.gaitaofspace.controller;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.unifor.gaitaofspace.model.Personagem;

@RestController 
public class PersonagemController {
    private ArrayList<Personagem> personagens = new ArrayList<>(Arrays.asList(
        new Personagem("Zeuda", 12, 4),
        new Personagem("Lincon", 2, 1)
    ));
    @GetMapping("/personagens")
    public ArrayList<String> listarTodosNomes() {
        ArrayList<String> nomes = new ArrayList<>();
        for (Personagem personagem : personagens)
            nomes.add(personagem.getNome());
        
        return nomes;
    }
    @GetMapping("/personagens/{id}")
    public Personagem listarDetalhes(@PathVariable int id) {
        return personagens.get(id);
    }

    @PostMapping("/personagens")
    public void criarPersonagem(@RequestBody Personagem novoPersonagem) {
        personagens.add(novoPersonagem);
    }

    @DeleteMapping("/personagens/{id}")
    public void deletarPersonagem(@PathVariable int id) {
        personagens.remove(id);
    }
}
