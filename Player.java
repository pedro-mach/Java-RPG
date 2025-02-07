public class Player {
    public String player_name;
    public int level;
    public int life;

    public Player(String player_name, int level, int life) {
        this.player_name = player_name;
        this.level = level;
        this.life = life;
    }

    public String toString() {
        return "Username = " + player_name + ", Nivel = " + level + ", Vida = " + life ;
    }
}
