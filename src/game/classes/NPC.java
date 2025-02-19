package game.classes;
public class NPC {

    public int id;
    public int level;
    public int life;
    public int dano;

    public NPC(int id, int level, int life, int dano) {
        this.id = id;
        this.level = level;
        this.life = life;
        this.dano = dano;
    }

    public void setlife(int life) {
        this.life = life;
    }

    public int getLife() {
        return life;
    }

    public void setlevel(int level) {
        this.level = level;
    }

    public int getlevel() {
        return level;
    }

    public int getdano() {
        return dano;
    }

    public void recebeDano(int quantidadeDano) {
        life = Math.max(0, life - quantidadeDano);
    }

    @Override
    public String toString() {
        return "NPC - id= " + id + "|| Nivel = " + level + "|| Vida = " + life + " || Dano: " + dano;
    }
}
