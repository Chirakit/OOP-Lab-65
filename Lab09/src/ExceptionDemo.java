public class ExceptionDemo {
    public static void main(String[] args) {
        try {
        double num1 = Double.parseDouble(args[0]);
        double num2 = Double.parseDouble(args[1]);
        double num3 = Double.parseDouble(args[2]);
        double x1 = (-num2 + Math.sqrt(Math.pow(num2, 2) - (4 * num1 * num3))) / (2 * num1);
        double x2 = (-num2 - Math.sqrt(Math.pow(num2, 2) - (4 * num1 * num3))) / (2 * num1);
        System.out.println("x1: " + x1);
        System.out.println("x2: " + x2);
        } catch(ArrayIndexOutOfBoundsException indexout) {
            System.out.println("Please enter 3 numbers as a, b, and c respectively.");
        } catch(NumberFormatException numonly) {
            System.out.println("Please input data in number format only.");
        }
    }
}
/*
ArrayIndexOutOfBoundsException
NumberFormatException
*/