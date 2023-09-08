package Adapter.Example1;

public class Main {
    public static void main(String[] args) {
        Square square = new Square();
        square.size = 10;

        CalculatorAdaptor calculatorAdaptor = new
                CalculatorAdaptor();

        int area = calculatorAdaptor.getArea(square);

        System.out.println("The area is : " +area);
    }
}
