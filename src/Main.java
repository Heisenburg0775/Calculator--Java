import java.util.Scanner;

public class Main {
    public static double add(double number1 , double number2){
        return number1 + number2;
    }
    public static double sub(double number1, double number2){
        return  number1 - number2;
    }
    public static double quo(double number1,double number2){
        return number1 % number2;
    }
    public static double rem(double number1, double number2){
        return  number1 / number2;
    }
    public static double pro(double number1,double number2){
        return  number1 * number2;
    }
    public static double power(double base,double exponent){
        return Math.pow(base,exponent);
    }
    public static double squarest(double number){
        return Math.sqrt(number);
    }

    public static void main(String[] args) {
        double first_number;
        double second_number;
        double result;
        double result_quo;
        double result_rem;
        double result_pro;
        double result_add;
        double result_sub;
        double result_sq_;
        double result_sq__;
        double result_pow;
        Scanner readline = new Scanner(System.in);
        System.out.println("Basic Java calculator!");
        try {
            System.out.println("Choose your operation method(+,-,*,/,p,s,a): ");
            char operation = readline.next().charAt(0);
            switch (operation) {
                case '+' -> {
                    System.out.println("Enter your first number: ");
                    first_number = readline.nextDouble();
                    System.out.println("Enter your second number: ");
                    second_number = readline.nextDouble();
                    result = add(first_number, second_number);
                    System.out.println(first_number + "+" + second_number + " = " + result);
                }
                case '-' -> {
                    System.out.println("Enter your first number: ");
                    first_number = readline.nextDouble();
                    System.out.println("Enter your second number: ");
                    second_number = readline.nextDouble();
                    result = sub(first_number, second_number);
                    System.out.println(first_number + "-" + second_number + " = " + result);
                }
                case '*' -> {
                    System.out.println("Enter your first number: ");
                    first_number = readline.nextDouble();
                    System.out.println("Enter your second number: ");
                    second_number = readline.nextDouble();
                    result = pro(first_number, second_number);
                    System.out.println(first_number + "*" + second_number + " = " + result);
                }
                case '/' -> {
                    System.out.println("Enter your first number: ");
                    first_number = readline.nextDouble();
                    System.out.println("Enter your second number: ");
                    second_number = readline.nextDouble();
                    result_quo = quo(first_number, second_number);
                    result_rem = rem(first_number, second_number);
                    System.out.println(first_number + "+" + second_number + " = " + result_quo + " as quotient " + result_rem + " as remainder");
                }
                case 'p' -> {
                    System.out.println("Enter your first number: ");
                    first_number = readline.nextDouble();
                    System.out.println("Enter your second number: ");
                    second_number = readline.nextDouble();
                    result = power(first_number,second_number);
                    System.out.println(first_number + "^" + second_number + " = " + result);

                }
                case 's' -> {
                    System.out.println("Enter your number: ");
                    first_number = readline.nextDouble();
                    result = squarest(first_number);
                    System.out.println("Square root of "+first_number+" is "+result);
                }
                case 'a' -> {
                    System.out.println("Enter your first number: ");
                    first_number = readline.nextDouble();
                    System.out.println("Enter your second number: ");
                    second_number = readline.nextDouble();
                    result_pow = power(first_number,second_number);
                    result_rem = rem(first_number,second_number);
                    result_add = add(first_number,second_number);
                    result_pro = pro(first_number,second_number);
                    result_quo = quo(first_number,second_number);
                    result_sub = sub(first_number,second_number);
                    result_sq_ = squarest(first_number);
                    result_sq__ = squarest(second_number);
                    String answer = String.format("%f + %f is %f \n%f - %f is %f\n%f / %f = %f as quotient and %f as remainder\n%f^%f = %f\n%f * %f = %f\nSquare root of %f is %f\nSquare root of %f is %f",first_number,second_number,result_add,first_number,second_number,result_sub,first_number,second_number,result_quo,result_rem,first_number,second_number,result_pow,first_number,second_number,result_pro,first_number,result_sq_,second_number,result_sq__);
                    System.out.println(answer);
                }

                default -> System.out.println("Invalid operation method was given");
            }
        }catch (Exception e){
            System.out.println("Invalid input was given. Error "+e);
        }

    }
}