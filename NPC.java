public class NPC {

    public int id;
    public int level;
    public int life;

    public NPC(int id, int level, int life) {
        this.id = id;
        this.level = level;
        this.life = life;
    }

    @Override
    public String toString() {
        return "NPC - id= " + id + ", Nivel = " + level + ", Vida = " + life;
    }
}
