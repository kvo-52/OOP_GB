package HW02;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Dog dog = new Dog(15, 3, "карие",
                "собака", "мини щпиц", false,
                false, "рыжий", "01.10.2020");

        Cat cat = new Cat(20, 4, "зелёный", "Люси", "шотландская-вислоухая",
                false, true, "серый", "05.06.2006");

        Wolf wolf = new Wolf(70, 45, "черный-серый", "лес", "очень 2021",
                true);

        Tiger tiger = new Tiger(100, 90, "серый", "тайга", "лето 2022");

        Chicken chicken = new Chicken(1.5, 2, "коричневый");

        Stork stork = new Stork(100, 40, "черный");

        Zoo animals = new Zoo(1);

        Scanner sc = new Scanner(System.in);
        

        int action = 0;
        while (action != 7) {
            System.out.println("Выберите действие: ");
            
            System.out.println("1. Добавить новое животное");
            System.out.println("2. Убрать животное из зоопарка");
            System.out.println("3. Показать информацию о конкретном животном");
            System.out.println("4. Показать животных в зоопарке");
            System.out.println("5. Заставить животное издавать звук");
            System.out.println("6. Заставить всех животных издавать звук");
            System.out.println("7. Выйти из программы");
            System.out.println("----------------------------------------------------");

            action = sc.nextInt();

            switch (action) {
                case 1:
                System.out.println("Выберите животное: ");
                    System.out.println("1. Собака");
                    System.out.println("2. Кот");
                    System.out.println("3. Тигр");
                    System.out.println("4. Волк");
                    System.out.println("5. Аист");
                    System.out.println("6. Курица");
                    System.out.println("------------------------ ");                 
                    

                    while (true) {
                        int chois = sc.nextInt();
                        if (chois == 1) {
                            animals.addAnimal(dog);
                            break;
                        } else if (chois == 2) {
                            animals.addAnimal(cat);
                            break;
                        } else if (chois == 3) {
                            animals.addAnimal(tiger);
                            break;
                        } else if (chois == 4) {
                            animals.addAnimal(wolf);
                            break;
                        } else if (chois == 5) {
                            animals.addAnimal(stork);
                            break;
                        } else if (chois == 6) {
                            animals.addAnimal(chicken);
                            break;
                        } else {
                            System.out.println("Error");
                        }
                    }
                    break;
                case 2:
                    animals.showAllAnimals();
                    System.out.println("Выберите животное: ");
                    int chois = sc.nextInt();
                    animals.removeAnimal(chois);
                    break;
                case 3:
                    animals.showAllAnimals();
                    System.out.println("Выберите животное: ");
                    chois = sc.nextInt();
                    animals.showAnimalInfo(chois);
                    break;
                case 4:
                    animals.showAllAnimals();
                    break;
                case 5:
                    animals.showAllAnimals();
                    System.out.println("Выберите животное: ");
                    chois = sc.nextInt();
                    animals.makeAnimalSound(chois);
                    break;
                case 6:
                    animals.makeAllSounds();
                    break;
                case 7:
                    System.out.println("Выход из программы.");
                    break;
                default:
                    System.out.println("Некорректный ввод, попробуйте еще раз.");
            }
        }

    }
}