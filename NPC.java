public class NPC {

    public int id;
    public int level;
    public int life;

    public NPC(int id, int level, int life) {
        this.id = id;
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
        return "NPC - id= " + id + "|| Nivel = " + level + "|| Vida = " + life;
    }
}
