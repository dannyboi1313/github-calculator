import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        System.out.println("welcome to the calculator");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter your command: ");
            String input = scanner.nextLine();
            System.out.println("You typed "+ input);
            if(input.contains("exit")){
                break;
            }
        }

        scanner.close();
    }
}
