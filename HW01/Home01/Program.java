package Home01;

public class Program {
    public static void main(String[] args) {

        Product productMilk = new Milk("Молоко", 85.5, 1, "литр",
                        "13 марта 2023", 3.5);
        System.out.println(productMilk); 

        // Изменяем цену продукта "Молоко" и выводим новую информацию
        productMilk.setPrice(90.1);
        System.out.println(productMilk); 

        Product limonade = new Product("Лимонад", 90, 2, "литр");
        System.out.println(limonade); 

        Product bread = new Bread("Хлеб", 35, 800, "грамм", "пшеница");
        System.out.println(bread); 

        Product eggs = new Eggs("Яйца", 120, 1, "упаковка", 10);
        System.out.println(eggs); 

        Product masks = new BabyProduct("Маска", 584, 1, "шт",
                        3, "низкая");
        System.out.println(masks); 

        Product toiletPaper = new ToiletPaper("Туалетная бумага", 380, 1,
                        "упаковка", 15, 4);
        System.out.println(toiletPaper); 

        Product diapers = new Diapers("Подгузники", 2100, 1, "уп.",
                        8, "12-14", 2, 4, "#3");
        System.out.println(diapers); 

        Product pacifier = new BabyProduct("Соска", 123, 1, "шт",
                        0, "средняя");
        System.out.println(pacifier); 

}
}
