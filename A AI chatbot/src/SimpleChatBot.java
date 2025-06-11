import java.util.Scanner;

public class SimpleChatBot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        System.out.println("ChatBot: Hello! Type 'bye' to exit.");

        while (true) {
            System.out.print("You: ");
            input = scanner.nextLine().toLowerCase();

            if (input.contains("hello") || input.contains("hi")) {
                System.out.println("ChatBot: Hello there!");
            } else if (input.contains("how are you")) {
                System.out.println("ChatBot: I'm a bot, but I'm functioning well!");
            } else if (input.equals("bye")) {
                System.out.println("ChatBot: Goodbye!");
                break;
            } else {
                System.out.println("ChatBot: Sorry, I don't understand that.");
            }
        }

        scanner.close();
    }
}
