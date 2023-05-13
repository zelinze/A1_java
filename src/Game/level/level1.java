package Game.level;



import java.util.Scanner;

import Game.Character;
import Game.Enemy;
import Game.Wizzard;
import Game.Potion.Potion;
import Game.Spell.Spell;

public class level1 {
    private Wizzard player;
    private Enemy enemy;

    public Level1(Wizzard player) {
        this.player = player;
        this.enemy = new Enemy("Troll", 100, 20);
    }

    public void start() {
        System.out.println("Welcome to Level 1!");
        while (player.getHealth() > 0 && enemy.getHealth() > 0) {
            displayStats();

            Scanner scanner = new Scanner(System.in);
            System.out.println("Choose an action:");
            System.out.println("1. Attack");
            System.out.println("2. Use Potion");
            System.out.println("3. Use Spell");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    Character.attack(enemy);
                    if (enemy.getHealth() > 0) {
                        enemy.attack(player);
                    }
                    break;
                case 3:
                    if (Spell.accio()) {
                        Spell.accio();
                        if (enemy.getHealth() > 0) {
                            Character Wizzard = null;
                            enemy.attack(Wizzard);
                        }
                    } else {
                        System.out.println("You don't know any spells!");
                    }
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
                    break;
            }
        }

        if (player.getHealth() <= 0) {
            System.out.println("Game Over. You were defeated by the enemy.");
        } else {
            System.out.println("Congratulations! You defeated the enemy.");
        }
    }

    private void displayStats() {
        System.out.println("-----------------------");
        System.out.println("Health: " + player.getHealth());
        System.out.println("-----------------------");
        System.out.println("Enemy: " + enemy.getName());
        System.out.println("Health: " + enemy.getHealth());
        System.out.println("-----------------------");
    }
}

