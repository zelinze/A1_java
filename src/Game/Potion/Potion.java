package Game.Potion;

import Game.Wizzard;

public class Potion {
    // 记录大量和少量药水的数量
    public static int largePotionCount = 0;
    public static int smallPotionCount = 0;

    public static void healLarge(int amount) {
        // 假设角色的最大生命值为100
        final int MAX_HEALTH = 100;

        // 如果没有大量药水，输出消息并返回
        if (largePotionCount <= 0) {
            System.out.println("You don't have any large healing potions left.");
            return;
        }

        // 使用一瓶大量药水
        largePotionCount--;

        // 将生命值加上治疗量
        Wizzard.getInstance().addHealth(amount);

        // 如果生命值超过最大值，则将其设置为最大值
        if (Wizzard.getInstance().getHealth() > MAX_HEALTH) {
            Wizzard.getInstance().setHealth(MAX_HEALTH);
        }

        // 输出消息和当前生命值以及药水数量
        System.out.println("You used a large healing potion. Your health is now " + Wizzard.getInstance().getHealth() + ".");
        System.out.println("You have " + largePotionCount + " large healing potions left.");
    }

    public static void healSmall(int amount) {
        // 假设角色的最大生命值为100
        final int MAX_HEALTH = 100;

        // 如果没有少量药水，输出消息并返回
        if (smallPotionCount <= 0) {
            System.out.println("You don't have any small healing potions left.");
            return;
        }

        // 使用一瓶少量药水
        smallPotionCount--;

        // 将生命值加上治疗
        Wizzard.getInstance().addHealth(amount);

        // 如果生命值超过最大值，则将其设置为最大值
        if (Wizzard.getInstance().getHealth() > MAX_HEALTH) {
            Wizzard.getInstance().setHealth(MAX_HEALTH);
        }

        // 输出消息和当前生命值以及药水数量
        System.out.println("You used a small healing potion. Your health is now " + Wizzard.getInstance().getHealth() + ".");
        System.out.println("You have " + smallPotionCount + " small healing potions left.");
    }
}
