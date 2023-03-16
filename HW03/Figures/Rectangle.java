package HW03.Figures;

import HW03.Exceptions.IncorrectTriangleExceptions;
import HW03.Exceptions.NegativeValueException;

public class Rectangle extends Polygon{

        public Rectangle(int sideA, int sideB) throws NegativeValueException, IncorrectTriangleExceptions{
            super(new int[] { sideA, sideB, sideA, sideB });
        }
    
        public Rectangle() throws NegativeValueException, IncorrectTriangleExceptions{
            this(3, 4);
        }
    
        @Override
        public double area() {
            return sides[0] * sides[1];
        }
        
    
        @Override
        public String toString() {
            return String.format("Прямоугольник\nСторона a: %d\nСторона b: %d", sides[0], sides[1]);
        }
    }   

