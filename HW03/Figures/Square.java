package HW03.Figures;

import HW03.Exceptions.IncorrectTriangleExceptions;
import HW03.Exceptions.NegativeValueException;

public class Square extends Rectangle{
    public Square(int side) throws NegativeValueException, IncorrectTriangleExceptions{
        super(side, side);
    }

    public Square() throws NegativeValueException, IncorrectTriangleExceptions{
        this(6);
    }

    @Override
    public String toString() {
        return String.format("Квадрат\nСторона: %d", sides[0]);
    }
}