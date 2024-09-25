public class App {

    public static void main(String[] args) throws Exception {
        Monster monster1 = new Monster("Diddy", 100, 20);
        Hero hero1 = new Hero("Erich", 50, 10);
        System.out.println("\nHero: " + hero1.name + " " + hero1.hp);
        System.out.println("Monster: " + monster1.name + " " + monster1.hp);

        System.out.println("\n" + hero1.name + " attackerar " + monster1.name);
        hero1.attack(monster1);

        System.out.println("Hero: " + hero1.name + " " + hero1.hp);
        System.out.println("Monster: " + monster1.name + " " + monster1.hp);
    }
}