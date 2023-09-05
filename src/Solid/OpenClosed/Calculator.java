package Solid.OpenClosed;

// No modifications in our calculator functionality
// We can keep adding extension by create new operations
public class Calculator {

    public int calculateNumber(int number1 , int number2 , Operation operation){
        return operation.perform(number1,number2);
    }

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        AddOperation addOperation = new AddOperation();
        SubOperation subOperation = new SubOperation();

        System.out.println(calculator.calculateNumber(10,30,addOperation));
        System.out.println(calculator.calculateNumber(10,30,subOperation));


    }
}
