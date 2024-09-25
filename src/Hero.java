public class Hero {

    public String name;
    public int hp;
    public int dmg;
    Monster target;

    public Hero(String name, int hp, int dmg) {
        this.name = name;
        this.hp = hp;
        this.dmg = dmg;
    }

    public void attack(Monster monster) {
        target=monster;
        target.takeDamage(this.dmg);
    }

    public void takeDamage(int damage) {
        this.hp -= damage;
    }


}