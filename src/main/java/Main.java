import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        System.out.println("welcome to the calculator");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter your command: ");
            String input = scanner.nextLine();

            if (input.contains("exit")) {
                System.out.println("Exiting Calculator App. Goodbye!");
                break;
            }

            String[] parts = input.split(" ");
            if (parts.length != 3 && parts.length != 2) {
                System.out.println("Try again");
                continue;
            }
            if(parts.length == 3){
                try {
                    String operation = parts[0];
                    double num1 = Double.parseDouble(parts[1]);
                    double num2 = Double.parseDouble(parts[2]);

                    switch (operation) {
                        case "add":
                            System.out.println("Add: " + num1 + num2 );
                            break;
                        case "subtract":
                            System.out.println("Subtract: " + num1 + num2 );
                            break;
                        case "multiply":
                            System.out.println("Multiply: " + num1 + num2 );
                            break;
                        case "divide":
                            if (num2 == 0) {
                                System.out.println("Error! Division by zero not allowed.");
                            } else {
                                System.out.println("divide: " + num1 + num2 );
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
                    double num1 = Double.parseDouble(parts[1]);

                    switch (operation) {
                        case "fib":
                            System.out.println("Add: " + num1 );
                            break;
                        case "binary":
                            System.out.println("Subtract: " + num1 );
                            break;
                        case "uid":
                            System.out.println("id: " + num1 );
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
