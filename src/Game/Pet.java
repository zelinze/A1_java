package Game;

public class Pet {
    public enum PetType {
        OWL,
        CAT,
        TOAD,
        RAT
    }

    private PetType petType;

    public Pet(PetType type) {
        this.petType = type;
    }

    public PetType getPetType() {
        return petType;
    }
}

