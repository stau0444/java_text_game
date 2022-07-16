public class Monster {
    private int hp = 12;

    public int getHp() {
        return hp;
    }

    public void setHp(int damage) {
        this.hp -= damage;
    }
}
