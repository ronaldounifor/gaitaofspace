package br.unifor.gaitaofspace.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Personagem {
    @Id 
    private String nome;
    private int hp;
    private int attack;
    private boolean heroi;
    public Personagem() {
    }
    public Personagem(String nome, int hp, int attack, boolean heroi) {
        this.nome = nome;
        this.hp = hp;
        this.attack = attack;
        this.heroi = heroi;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getHp() {
        return hp;
    }
    public void setHp(int hp) {
        this.hp = hp;
    }
    public int getAttack() {
        return attack;
    }
    public void setAttack(int attack) {
        this.attack = attack;
    }
    public boolean isHeroi() {
        return heroi;
    }
    public void setHeroi(boolean heroi) {
        this.heroi = heroi;
    }
    
}
