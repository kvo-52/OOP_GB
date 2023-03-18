package HW04;

public class Program {
    public static void main(String[] args) {

        DynamicArray<Integer> dynamicArray = new DynamicArray<>();

        // добавляем элементы
        dynamicArray.add(15);
        dynamicArray.add(6);
        dynamicArray.add(31);
        dynamicArray.add(-3);

        // выводим элементы массива
        dynamicArray.print();

        // выводим размер массива
        System.out.println("Размер массива: " + dynamicArray.size());

        // удаляем элемент по индексу
        dynamicArray.remove(3);
        dynamicArray.print();

        // поиск индекса элемента массива
        int foundIndex = dynamicArray.findIndex(1);
        System.out.printf("foundIndex = %d\n", foundIndex);

        // поиск элемента по индексу
        int foundElement = dynamicArray.getElement(0);
        System.out.printf("foundElement = %d\n", foundElement);

        // проверка в массиве наличия элемента с заданным значением
        boolean availability = dynamicArray.contains(6);
        System.out.printf("availability = %b\n", availability);

        // удаляем все элементы со значением 10
        for (int i = 0; i < dynamicArray.size(); i++) {
            if (dynamicArray.getElement(i) == 10) {
                dynamicArray.remove(i);
                i--;
            }
        }

        // выводим размер массива после удаления элементов со значением 30
        System.out.println("Массив после удаления элемента:");
        dynamicArray.print();

        // изменяем элемент с индексом 0 на значение 11
        dynamicArray.setElement(0, 11);
        System.out.println("Массив после изменения значения элемента:");
        dynamicArray.print();

        // выводим минимальный элемент
        Integer min = (Integer) dynamicArray.getMinimum();
        System.out.println("Минимальное значение: " + min);

        // выводим максимальный элемент
        Integer max = (Integer) dynamicArray.getMaximum();
        System.out.println("Максимальное значение: " + max);

        // сумма элементов массива
        System.out.println("Сумма элементов: " + dynamicArray.sum());

        // произведение элементов массива
        System.out.println("Произведение элементов: " + dynamicArray.product());

        // новый массив типа double
        Double[] doubleArray = { 8.5, 1.5, 7.3, 1.1, 7.9 };
        DynamicArray<Double> doubleDynamicArray = new DynamicArray<>(doubleArray);
        System.out.println("Новый массив doubleArray: ");
        doubleDynamicArray.print();
        System.out.println("Сумма элементов массива doubleArray: " + doubleDynamicArray.sum());

        // пузырьковая сортировка для массива doubleArray
        doubleDynamicArray.bubbleSort();
        System.out.println("Отсортированный массив doubleArray: ");
        doubleDynamicArray.print();

        // сортировка вставками для массива dynamicArray
        dynamicArray.insertionSort();
        System.out.println("Отсортированный массив dynamicArray: ");
        dynamicArray.print();

        // новый массив типа Integer
        Integer[] intArray = { 27, 6, 555, -10, 0, 95, 222 };
        DynamicArray<Integer> intDynamicArray = new DynamicArray<>(intArray);
        System.out.println("Новый массив intArray: ");
        intDynamicArray.print();
        intDynamicArray.selectionSort();
        System.out.println("Отсортированный массив intArray: ");
        intDynamicArray.print();

        // удаление всех элементов массива dynamicArray
        dynamicArray.clear();
        dynamicArray.print();
    }
}
