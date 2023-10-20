import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        System.out.println("welcome to the calculator");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter your command: ");
            String input = scanner.nextLine();

            if (input.contains("exit")) {
                System.out.println("Goodbye!");
                break;
            }

            String[] parts = input.split(" ");
            if (parts.length != 3 && parts.length != 2) {
                System.out.println("Try again");
                continue;
            }
            if(parts[0].contains("id")){
                System.out.println(Calculator.createUniqueID(parts[1]));
            }
            else if(parts.length == 3){
                try {
                    String operation = parts[0];
                    int num1 = Integer.parseInt(parts[1]);
                    int num2 = Integer.parseInt(parts[2]);

                    switch (operation) {
                        case "add":
                            System.out.println(Calculator.add(num1,num2));
                            break;
                        case "subtract":
                            System.out.println(Calculator.subtract(num1,num2));
                            break;
                        case "multiply":
                            System.out.println(Calculator.multiply(num1,num2) );
                            break;
                        case "divide":
                            if (num2 == 0) {
                                System.out.println("Error! Division by zero not allowed.");
                            } else {
                                System.out.println(Calculator.divide(num1,num2));
                            }
                            break;
                        default:
                            System.out.println("Oops that doesnt exist");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Oops that doesnt exist");
                }
            }
            else if(parts.length == 2){
                try {
                    String operation = parts[0];
                    int num1 = Integer.parseInt(parts[1]);

                    switch (operation) {
                        case "fib":
                            System.out.println(Calculator.fibonacciNumberFinder(num1));
                            break;
                        case "binary":
                            System.out.println(Calculator.intToBinaryNumber(num1) );
                            break;

                        default:
                            System.out.println("Oops that doesnt exist");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Oops that doesnt exist");
                }
            }

        }

        scanner.close();
    }
}
