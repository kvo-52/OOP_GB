package HW02;

public interface HomeAnimal extends Animals{
    String getName(); // Кличка

    String getBreed(); // Порода

    boolean isVaccinated(); // Наличие прививок

    String getWoolColor(); // Цвет шерсти

    String getBirthDate(); // Дата рождения

    void showAffection(); // Проявлять ласку
}
