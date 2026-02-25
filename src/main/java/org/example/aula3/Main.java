package aula3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        exibirTitulo();

        System.out.println("🦸🏽‍♂ Digite o nome do seu heroí: ️");
        String nomeHeroi = scanner.next();

        Heroi heroi = new Heroi(nomeHeroi, 150,35,5);

        heroi.adicionarItem(new Item("Poção Pequena 🧪",  "cura", 20));
        heroi.adicionarItem(new Item("Poção Grande ⚗️",   "cura", 100));
        heroi.adicionarItem(new Item("Erva da boa 🌿", "cura", 15));
        heroi.adicionarItem(new Item("Erva negra", "cura", 20));
        heroi.adicionarItem(new Item("Poção regenerativa", "cura", 50));


        System.out.println("\n✅ Herói criado com sucesso!");
        heroi.exibirStatus();

        Monstro[] monstros = {
                //(vida, atack, defesa, xp )
                new Monstro("Lobo", "🐺", 20, 8, 1, 30),// nivel facil
                new Monstro("Goblin", "👿", 60,10,2,40), //nivel médio
                new Monstro("Pebble", "🪨", 70,1,10,50),// pouca vida/dano e alta resistencia
                new Monstro("Sombra encarnada", "👤", 50, 50, 0, 90), // como assim uma sombra atacka ? 🤔
                new Monstro("False Satan", "😒💅", 100, 25, 20, 200),// boss padrão
                new Monstro("Bode Demoniaco", "🐐💨", 150,30,20,250),//boss alternativo
                new Monstro("True Satan", "😈", 200, 50, 30, 300)// boss alternativo final apenas quando bode for derrotado

        };

        int vitorias = 0;

        for(Monstro monstro: monstros) {
            System.out.println("\n\n🗺️ Você avança pela dungeon...");
            System.out.println("🚪 Um " + monstro.getNome() + " bloqueia o caminho!");
            System.out.println("\n [1] Lutar");
            System.out.println(" [2] Fugir (pula essa batalha)");
            System.out.println(" Escolha: ");

            int opcao;
            try {
                opcao = scanner.nextInt();
            } catch (Exception e ){
                opcao = 1;
                scanner.nextLine();
            }

            if (opcao == 2) {
                System.out.println(" 🏃🏽 Você fugiu para o proximo corredor...");
                continue;
            }

            Batalha batalha = new Batalha(heroi, monstro, scanner);
            boolean venceu = batalha.iniciar();

            if (venceu) {
                vitorias++;
                System.out.println("\n [Pressione ENTER para continuar]");
                scanner.nextLine();
                scanner.nextLine();
            } else {
                exibirGameOver(nomeHeroi, vitorias, heroi.getXp());
                scanner.close();
                return;
            }

        }

        exibirVitoria(heroi, vitorias);
        scanner.close();
    }

    private static void exibirTitulo() {
        System.out.println("-------------------------------------------");
        System.out.println("-         ⚔️ DUNGEON QUEST                -");
        System.out.println("-  Programação Orientação a Objeto        -");
        System.out.println("-------------------------------------------");
        System.out.println();
    }

    private static void exibirGameOver(String nome, int vitorias, int xp) {
        System.out.println("-------------------------------------------");
        System.out.println("-            ☠️ GAME OVER                 -");
        System.out.println("-------------------------------------------");
        System.out.println(" Fim da Jornada de " + nome);
        System.out.println(" Vitórias: "+ vitorias);
        System.out.println(" XP Total: " + xp);
        System.out.println();
    }

    private static void exibirVitoria(Heroi heroi, int vitorias) {
        System.out.println("-----------------------------------------------");
        System.out.println("-           👑 DUNGEON COMPLETA!              -");
        System.out.println("-----------------------------------------------");
        System.out.println(" Parabéns, " + heroi.getNome() + "!");
        System.out.println(" Vitórias: " + vitorias);
        System.out.println(" XP Total: " + heroi.getXp());
        heroi.exibirStatus();
    }
}