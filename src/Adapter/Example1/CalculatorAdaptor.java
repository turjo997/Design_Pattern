package Adapter.Example1;

public class CalculatorAdaptor {

    public int getArea(Square square){
        Calculator calculator = new Calculator();
        Rectangle rectangle = new Rectangle();

        rectangle.Width = rectangle.Height = square.size;

        int area = calculator.getArea(rectangle);

        return area;
    }
}
