import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Press W, A, S, or D (press Q to quit):");

        while (true) {
            String input = scanner.nextLine().toLowerCase();

            if (input.equals("q")) {
                System.out.println("Goodbye!");
                break;
            }

            switch (input) {
                case "w":
                    //put code here
                    break;

                case "a":
                    //put code here
                    break;

                case "s":
                    //put code here
                    break;

                case "d":
                    //put code here
                    break;

                default:
            }
        }

        scanner.close();
    }
}
