package Home01;

/**
 * Класс DrinkProduct наследуется от Product
 * Добавлено новое поле - volume, которое хранит объём напитка.
 */
public class DrinkProduct extends Product {
    private int volume;
    /**
     * Конструктор DrinkProduct
     * @param name - Название продукта
     * @param price - Цена
     * @param quantity - Количество
     * @param unit - ед. измерения
     * @param volume - объём
     */
    public DrinkProduct(String name, float price, int quantity, String unit, int volume) {
        super(name, price, quantity, unit);
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String toString() {
        return String.format("%s Объём: %d", super.toString(), this.volume);
    }
} 