import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.util.List;

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
    
            scanner.close();
            System.out.println("-".repeat(20));
            for (int i = 1; i <= 5; i++) {
                Random rand = new Random();
                int level = rand.nextInt(20) + 1;
                int vida = level * 25;;
                NPCs.add(new NPC(i, level, vida));
            }

            System.out.println("Lista NPCs");
            for (NPC NPC : NPCs) {
                System.out.println(NPC);
            }
    }
}



