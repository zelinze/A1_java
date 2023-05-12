package Game;

import java.util.Random;

public class House {
    public enum HouseType {
        GRYFFINDOR,
        HUFFLEPUFF,
        RAVENCLAW,
        SLYTHERIN
    }

    private HouseType houseType;

    public House() {
        // 随机分配学院
        Random random = new Random();
        int num = random.nextInt(4);
        switch (num) {
            case 0:
                this.houseType = HouseType.GRYFFINDOR;
                break;
            case 1:
                this.houseType = HouseType.HUFFLEPUFF;
                break;
            case 2:
                this.houseType = HouseType.RAVENCLAW;
                break;
            case 3:
                this.houseType = HouseType.SLYTHERIN;
                break;
        }
    }

    public HouseType getHouseType() {
        return houseType;
    }
}
