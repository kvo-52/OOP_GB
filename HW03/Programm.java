package HW03;

import HW03.Exceptions.IncorrectTriangleExceptions;
import HW03.Exceptions.NegativeValueException;
import HW03.Figures.*;
import HW03.FiguresArray.FigureArray;

public class Programm {
    public static void main(String[] args)
        throws NegativeValueException, IncorrectTriangleExceptions, NumberFormatException {


FigureArray<Figure> listFugers = new FigureArray<>();


Figure square = new Square(5);
Figure rectangle = new Rectangle(5, 7);
Figure triangle = new Triangle(3, 4, 5);
Figure circle = new Circle(7);
Figure sq = new Square();


listFugers.add(square);
listFugers.add(rectangle);
listFugers.add(triangle);
listFugers.add(circle);
listFugers.add(sq);


listFugers.delete(4);


listFugers.sort();

// Показать все фигуры и их параметры(длины)
listFugers.showFigures();

// Показать всю информацию о фигурах, включая площадь, периметр/длину
listFugers.showAll();

}
}
