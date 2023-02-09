package Collections_Generics;

import java.util.HashMap;

class Zoo {
    static HashMap<String, Integer> animalMap = new HashMap<String, Integer>();

    public Zoo() {
        addAnimals(originalAnimals);
        addAnimals(newAnimals);
        displayAnimalData(animalMap);
    }

    String[] originalAnimals = {"Zebra", "Lion", "Buffalo"};
    String[] newAnimals = {"Zebra", "Gazelle", "Buffalo", "Zebra"};

    void addAnimals(String[] animals) {
        for (String animal : animals) {
            if (animalMap.containsKey(animal)) {
                animalMap.put(animal, animalMap.get(animal) + 1);
            } else {
                animalMap.put(animal, 1);
            }
        }
    }

    void displayAnimalData(HashMap<String, Integer> map) {
        System.out.println("Animal\tCount");
        for (String animal : map.keySet()) {
            System.out.println(animal + "\t\t" + map.get(animal));
        }
    }

    public static void main(String[] args) {
        new Zoo();
    }
}