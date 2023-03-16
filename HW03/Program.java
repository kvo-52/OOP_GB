package HW03;


import HW03.Exceptions.IncorrectTriangleExceptions;
import HW03.Exceptions.NegativeValueException;
import HW03.Figures.*;
import HW03.FiguresArray.FigureArray;

public class Program {
    public static void main(String[] args)
    throws NegativeValueException, IncorrectTriangleExceptions, NumberFormatException {


FigureArray<Figure> storage = new FigureArray<>();


Figure square = new Square(5);
Figure rectangle = new Rectangle(5, 7);
Figure triangle = new Triangle(3, 4, 5);
Figure circle = new Circle(7);
Figure sq = new Square();


storage.add(square);
storage.add(rectangle);
storage.add(triangle);
storage.add(circle);
storage.add(sq);


storage.delete(4);


storage.sort();

// Показать все фигуры и их параметры(длины)
storage.showFigures();

// Показать всю информацию о фигурах, включая площадь, периметр/длину
storage.showAll();

}
}
