package game.main;

import game.classes.NPC;
import game.classes.Player;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<NPC> NPCs = new ArrayList<>();
        List<Player> Players = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos Players: ");
        int qntd_player_int = scanner.nextInt();
        scanner.nextLine();
        System.out.println("-".repeat(20));

        for (int count = 0; count < qntd_player_int; count++) {
            System.out.print("Player Name: ");
            String player_name = scanner.nextLine();
            Random rand = new Random();
            int dano = rand.nextInt(10, 15) * 2;
            int level = 1;
            int vida = 50 * (rand.nextInt(2, 5));
            Players.add(new Player(player_name, level, vida, dano));
            System.out.println("-".repeat(20));
        }

        System.out.println("Jogadores cadastrados:");
        for (Player player : Players) {
            System.out.println(player);
        }

        System.out.println("-".repeat(20));
        for (int i = 1; i <= 5; i++) {
            Random rand = new Random();
            int level = rand.nextInt(20) + 1;
            int vida = level * 25;
            int damage_var = rand.nextInt(1, 10);
            int dano = 2 * (level * damage_var);
            NPCs.add(new NPC(i, level, vida, dano));
        }

        System.out.println("Lista NPCs");
        for (NPC NPC : NPCs) {
            System.out.println(NPC);
        }

        while (!Players.isEmpty()) {
            //Usar iterator para evitar ConcurrentModificationException
            for (int i = 0; i < Players.size(); i++) {
                Player player = Players.get(i);
                System.out.println(player);
                System.out.print("Selecione um NPC pelo ID (1 a 5) para lutar:  ");
                int idnpc = scanner.nextInt();
                if (idnpc >= 1 && idnpc <= NPCs.size()) {
                    NPC selectedNpc = NPCs.get(idnpc - 1);
                    System.out.println("Você atacou: " + selectedNpc);
                    int dano_player = player.getdano();
                    System.out.println("Seu Dano : " + dano_player);
                    selectedNpc.recebeDano(dano_player);
                    int dano_npc = selectedNpc.getdano();
                    player.Recebedano(dano_npc);

                    System.out.println("status : " + selectedNpc);
                    System.out.println("status player: " + player);

                    if (selectedNpc.getLife() <= 0) {
                        System.out.println("NPC " + selectedNpc.id + " morreu");
                        NPCs.remove(selectedNpc);
                    }
                    if (player.life <= 0) {
                        System.out.println("Player " + player.player_name + " morreu");
                        Players.remove(player);
                        break; // o jogador morreu
                    }

                } else {
                    System.out.println("ID de NPC inválido.");
                }
            }

            System.out.println("Jogadores cadastrados:");
            for (Player player : Players) {
                System.out.println(player);
            }

            if (NPCs.isEmpty()){
                System.out.println("Todos os npcs morreram");
                break;
            }
        }

        scanner.close();
    }
}
