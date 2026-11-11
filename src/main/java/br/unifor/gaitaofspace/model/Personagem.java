package br.unifor.gaitaofspace.model;

public class Personagem {
    private String nome;
    private int hp;
    private int attack;
    public Personagem(String nome, int hp, int attack) {
        this.nome = nome;
        this.hp = hp;
        this.attack = attack;
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
}
