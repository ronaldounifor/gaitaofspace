package br.unifor.gaitaofspace.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import br.unifor.gaitaofspace.model.Personagem;
import br.unifor.gaitaofspace.repository.PersonagemRepository;

@Service 
public class PersonagemService {
    @Autowired
    private PersonagemRepository repository;

    public ArrayList<String> getHeroes() {
        List<Personagem> personagens = repository.findAll();
        ArrayList<String> nomes = new ArrayList<>();
        
        for (Personagem personagem : personagens)
            if(personagem.isHeroi())
                nomes.add(personagem.getNome());
        
        return nomes;
    }

    public Personagem getHero(String id) {
        return repository.findById(id).get();
    }

    public void add(Personagem novoPersonagem) {
        repository.save(novoPersonagem);
    }

    // public void deletarPersonagem(@PathVariable int id) {
    //     personagens.remove(id);
    // }
}
