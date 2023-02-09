package Abstract_Classes_Interfaces;

/**
 * Create enum of all the animal types
 */
enum AnimalType {
    Fish,
    Amphibian,
    Reptile,
    Mammal,
    Bird,
    Invertebrate
}

public class Animal {
    public AnimalType animalType;

    /**
     * Construct the animal
     * @param animalType
     */
    public Animal(AnimalType animalType) {
        this.animalType = animalType;
    }
}
