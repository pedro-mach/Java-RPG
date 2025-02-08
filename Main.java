import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
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
              int level = 1;
              int vida = level * 30;
              Players.add(new Player(player_name, level, vida));
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
                NPCs.add(new NPC(i, level, vida));
            }

            System.out.println("Lista NPCs");
            for (NPC NPC : NPCs) {
                System.out.println(NPC);
            }

            for (Player player : Players) {
                System.out.println(player);
                System.out.println("Selecione um NPC para atacar pelo ID (1 a 5): ");
                int idnpc = scanner.nextInt();
                if (idnpc >= 1 && idnpc <= NPCs.size()) {
                    NPC selectedNpc = NPCs.get(idnpc - 1);
                    System.out.println("Você atacou: " + selectedNpc);
                    
                    System.out.print("Quanto de dano você deseja causar? ");
                    int dano = scanner.nextInt();
                    
                    selectedNpc.recebeDano(dano);
                    
                    System.out.println("status : " + selectedNpc);
                } else {
                    System.out.println("ID de NPC inválido.");
                }
            }
            scanner.close();
        }
    }
