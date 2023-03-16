package HW03.FiguresArray;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import HW03.Figures.*;



public class FigureArray <T extends Figure> {
    private List<T> storage = new ArrayList<T>();

    public void add(T obj) {
        this.storage.add(obj);
    }

    public void delete(int index) {
        this.storage.remove(index);
    }

    public void showFigures() {
        for (T figure : storage) {
            System.out.println(figure);
            System.out.println("------");
        }
    }

    public void showAll() {
        for (Figure figure : storage) {

            System.out.println(figure);
            System.out.printf("Площадь: %.2f\n", figure.area());
            if (figure instanceof Lengthable) {
                System.out.printf("Длина окружности: %.2f\n", ((Lengthable) figure).length());
            }
            if (figure instanceof Perimeterable) {
                System.out.printf("Периметр: %.2f\n", ((Perimeterable) figure).perimeter());
            }
            System.out.println("------");
        }

    }

    public void sort() {
        Collections.sort(this.storage);
    }
}
