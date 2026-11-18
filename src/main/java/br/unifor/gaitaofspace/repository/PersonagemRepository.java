package br.unifor.gaitaofspace.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.unifor.gaitaofspace.model.Personagem;

public interface PersonagemRepository extends JpaRepository<Personagem, String> {

}
