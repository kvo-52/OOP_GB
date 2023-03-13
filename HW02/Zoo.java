package HW02;

public class Zoo {
    private Animals[] animals;
    private int size;

    public Zoo(int capacity) {
        animals = new Animals[capacity];
        size = 0;
    }

    public void addAnimal(Animals animal) {
        if (size == animals.length) {
            Animals[] newAnimals = new Animals[animals.length * 2];
            for (int i = 0; i < animals.length; i++) {
                newAnimals[i] = animals[i];
            }
            animals = newAnimals;
        }
        animals[size] = animal;
        size++;
    }

    public void removeAnimal(int index) {
        index -= 1;
        if (index >= 0 && index < size) {
            System.out.println("Животное " + animals[index].getClass().getSimpleName()
                    + " удалено из зоопарка");
            for (int i = index; i < size - 1; i++) {
                animals[i] = animals[i + 1];
            }
            size--;
        } else {
            System.out.println("Неверный номер животного");
        }
    }

    public void showAnimalInfo(int index) {
        index -= 1;
        if (index >= 0 && index < size) {
            animals[index].printInfo();
        } else {
            System.out.println("Неверный номер животного");
        }
    }

    public void makeAnimalSound(int index) {
        index -= 1;
        if (index >= 0 && index < size) {
            animals[index].makeSound();
        } else {
            System.out.println("Неверный номер животного");
        }
    }

    public void showAllAnimals() {
        if (size == 0) {
            System.out.println("В зоопарке нет животных");
        } else {
            System.out.println("Животные в зоопарке:");
            for (int i = 0; i < size; i++) {
                System.out.println((i + 1) + ". " + animals[i].getClass().getSimpleName());
            }
        }
    }

    public void makeAllSounds() {
        if (size == 0) {
            System.out.println("В зоопарке нет животных");
        } else {
            System.out.println("Звуки всех животных в зоопарке:");
            for (int i = 0; i < size; i++) {
                animals[i].makeSound();
            }
        }
    }

}

