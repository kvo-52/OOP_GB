package Home01;

/**
 * Класс Diapers наследуется от HygieneProduct, который унаследован от Product
 * Добавлены новые поля:
 * size - размер подгузника
 * minWeight - минимальный вес ребёнка
 * maxWeight - максимальный вес ребёнка
 * type - тип подгузника
 */
public class Diapers extends HygieneProduct {
    private String size;
    private int minwt;
    private int maxwt;
    private String type;
    /**
     * Конструктор Diapers сорержит поля:
     * @param name - Название продукта
     * @param price - Цена
     * @param quantity - Количество
     * @param unit - Ед. измерения
     * @param size - Размер
     * @param minwt - Вес ОТ
     * @param maxwt - Вес ДО
     * @param type - Тип
     */
    public Diapers(String name, double price, int quantity, String unit, int packQuantity, String size,
            int minWeight, int maxWeight, String type) {
        super(name, price, quantity, unit, packQuantity);
        this.size = size;
        this.minwt = minWeight;
        this.maxwt = maxWeight;
        this.type = type;
    }

    public String getSize() {
        return size;
    }

    public int getMinwt() {
        return minwt;
    }

    public int getMaxwt() {
        return maxwt;
    }

    public String getType() {
        return type;
    }

    // Вывод информации о товаре (перегрузка метода toString класса Object)
    public String toString() {
        return String.format("%s Размер: %s; От %d до %d лет; Тип: %s",
                super.toString(), this.size, this.minwt, this.maxwt, this.type);
    }
}