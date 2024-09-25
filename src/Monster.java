public class Monster {

    public String name;
    public int hp;
    public int dmg;

    public Monster(String name, int hp, int dmg) {
        this.name = name;
        this.hp = hp;
        this.dmg = dmg;
    }

    public void takeDamage(int damage) {
        this.hp -= damage;
    }

    public void attack(Hero hero) {
        hero.takeDamage(this.dmg);
    }
}