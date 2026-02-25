# Dungeon-Quest

📄 Parte A — Análise Comparativa

comparando a classes heroi e monstro, foi possível identificar que ambas as classes possuem vários atributos e métodos em commum, como exemplo: 
-nome
-vida
-ataque
-defesa
-atacar()
-ReceberDano()
-estaVivo()

esses atributos representam características básicas do personagem do jogo, independente de ser herói ou monstro. então faz sentido mover esses atributos e métodos para uma classe separada chamada Personagem, assim evitando repetição de código.

já atributos como pocoes e xp pertecem apenas ao heroi, da mesma forma como, xp e  emoji que pertecem apenas ao monstro.

Parte C — Reflexão Escrita 
Pergunta 1:
Se Heroi extends Personagem (ou seja, Heroi herda de Personagem), quais linhas de Heroi.java poderiam ser removidas sem perda de funcionalidade? Liste pelo menos 4 exemplos concretos (atributos ou métodos).

R: 
private String nome;
private int ataque;
private int defesa;
public int atacar()
public void receberDano(int dano)
public boolean estaVivo()

esses já estariam definidos em Personagem,
então não precisariam ser duplicados.

Pergunta 2:
Qual é a vantagem de ter o método receberDano() em um único lugar (Personagem) em vez de copiado em Heroi e Monstro? Dê um exemplo de situação onde ter o código duplicado causaria um problema real.

R: é evitar duplicação de código, pois se a lógica de dano mudar sera necessário apenas alterar na classe personagem,
se caso o método estivesse copiado em heroi e monsto poderia acontecer de esquecerem de atualizar e criar mais bugs que possam ser difíceis de identificar


Pergunta 3:
Por que o método exibirStatus() provavelmente ainda precisaria existir separadamente em Heroi e Monstro, mesmo depois de implementar a herança?

R: pela questão do heroi e o monstro possuem informações diferentes, mesmo com os atributos básicos
como exemplo 
Heroi exibe
-poção
-xp
monstro: 
-XP de recompensa
-emoji do monstro
