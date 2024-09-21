import java.util.Scanner;

public class convo_kika {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isJavaTurn = true;
        System.out.println("Krithika_2022503035");

        System.out.println("Start the conversation between Java and Python (type 'exit' to end):");

        while (true) {

            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {// so basically, ignore the user input case. If they type out exit, we get out
                System.out.println("Conversation ended.");
                break;
            }


            if (isJavaTurn) {
                System.out.println("Java: " + input);
            } else {
                System.out.println("Python: " + input);
            }


            isJavaTurn = !isJavaTurn;
        }

    }
}
