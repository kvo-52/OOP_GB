package Home01;

/**
 * Класс Bread наследуется от Product
 * Добавлено поле flourType, которое хранит тип муки.
 */
public class Bread extends Product {
    private String flourType;

    /**
     * Конструктор Bread содержит поля:
     * 
     * @param name      - Название продукта
     * @param price     - Цена
     * @param quantity  - Количество
     * @param unit      - ед. измерения
     * @param flourType - Тип муки
     */
    public Bread(String name, double price, int quantity, String unit, String flourType) {
        super(name, price, quantity, unit);
        this.flourType = flourType;
    }

    public String getFlourType() {
        return flourType;
    }

    public void setFlourType(String flourType) {
        this.flourType = flourType;
    }

    // Вывод информации о товаре (перегрузка метода toString класса Object)
    public String toString() {
        return String.format("%s Тип муки: %s;", super.toString(), this.flourType);
    }
}
