package Game;

import Game.Potion.Potion;


public class Wizzard {
    private static int health;
    private Potion largePotion;
    private Potion smallPotion;
    private static Wizzard instance;
    public static Wizzard getInstance() {
        if (instance == null) {
            instance = new Wizzard(
            );
        }
        return instance;
    }


    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public Potion getLargePotion() {
        return largePotion;
    }

    public Potion getSmallPotion() {
        return smallPotion;
    }

    public void addHealth(int amount) {
    }
}
