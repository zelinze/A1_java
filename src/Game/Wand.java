package Game;

import java.util.Random;

public class Wand {
    public enum CoreType {
        PHOENIX_FEATHER,
        DRAGON_HEARTSTRING,
        UNICORN_HAIR
    }

    private double size;
    private CoreType core;

    public Wand(double size) {
        this.size = size;

        // 随机选择芯材
        Random random = new Random();
        int num = random.nextInt(3);
        switch (num) {
            case 0:
                this.core = CoreType.PHOENIX_FEATHER;
                break;
            case 1:
                this.core = CoreType.DRAGON_HEARTSTRING;
                break;
            case 2:
                this.core = CoreType.UNICORN_HAIR;
                break;
        }
    }

    public double getSize() {
        return size;
    }

    public CoreType getCore() {
        return core;
    }
}

