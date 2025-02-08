public class Player {
    public String player_name;
    public int level;
    public int life;

    public Player(String player_name, int level, int life) {
        this.player_name = player_name;
        this.level = level;
        this.life = life;
    }

    public void setlife(int life) {
		this.life = life;
	}

    public int getlife() {
		return life;
	}

    public void setlevel(int level) {
		this.level = level;
	}

    public int getlevel() {
		return level;
	}

    public void Recebedano ( int dano){
        life -= dano;
    }

    @Override
    public String toString() {
        return "Username = " + player_name + "|| Nivel = " + level + "|| Vida = " + life ;
    }
}
