package Game;

public class Enemy extends Character {
    private int attackPower;

    public Enemy(String name, int health, int attackPower) {
        super(name, health);
        this.attackPower = attackPower;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public void attack(Character target) {
        System.out.println(getName() + " is attacking " + target.getName());
        // 实现敌人的攻击行为
        int damage = attackPower;
        target.setHealth(target.getHealth() - damage);
        System.out.println(target.getName() + " loses " + damage + " health points.");
        System.out.println(target.getName() + "'s remaining health: " + target.getHealth());
    }

    Enemy mangemorts = new Enemy("Mangemorts", 110, 22);
    Enemy troll = new Enemy("Troll", 100, 20);
    Enemy basilisk = new Enemy("Basilisk", 150, 30);
    Enemy dementors = new Enemy("Dementors", 80, 15);
    Enemy voldemort = new Enemy("Voldemort", 200, 40);
    Enemy peterPettigrow = new Enemy("Peter Pettigrow", 120, 25);
    Enemy doloresUmbridge = new Enemy("Dolores Umbridge", 90, 18);
}

// 其他操作...

