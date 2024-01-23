package lessons;

public class CalculatorDemo{

    public static void main(String[] args) {
    Calculator calculator = new Calculator();

    int a = 20;
    int b = 5;

    int ResultFromSub = calculator.sub(a,b);
    System.out.println(" Вычитание "+ a + " - "  + b +  " равно "  + ResultFromSub);

    int ResultFromMult = calculator.mult(a, b);
    System.out.println(" Умножение " + a + " * " + b + " равно " + ResultFromMult);

    int ResultFromDiv = calculator.div(a,b);
    System.out.println(" Деление " + a + " / " + b + " равно " + ResultFromDiv);


    }
}