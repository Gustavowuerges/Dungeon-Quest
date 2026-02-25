package aula3;

public class Personagem {

    String nome;
    int vida;
    int ataque;
    int defesa;


    public Personagem(String nome, int vida, int ataque, int defesa){
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
    }

    void exibirStatus() {
        System.out.println("=== " + nome + " ===");
        System.out.println("❤️ Vida: " + vida);
        System.out.println("⚔️ Ataque: " + ataque);
        System.out.println("🛡️ Defesa: " + defesa);
    }
    /*public int atacar() {
        int variacao = (int)(Math.random() * 10) - 5;
        return ataque + variacao;
    }

    public void receberDano(int dano) {
        int danoReal = dano - defesa;
        if (danoReal < 1) danoReal = 1;
        vida -= danoReal;
        if (vida < 0) vida = 0;
        System.out.println("  💥 " + nome + " recebeu " + danoReal + " de dano!");
    }

    public boolean estaVivo() {
        return vida > 0;
    }

    // Getters básicos
    public String getNome() { return nome; }
    public int    getVida() { return vida; }
}*/
}
