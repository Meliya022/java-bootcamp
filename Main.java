//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

        // 1. For loop to print numbers from 0 to the given number
        public void printNumbersForLoop(int num) {
            for (int i = 0; i <= num; i++) {
                System.out.println(i);
            }
        }

        // 2. While loop to print numbers from 0 to the given number
        public void printNumbersWhileLoop(int num) {
            int i = 0;
            while (i <= num) {
                System.out.println(i);
                i++;
            }
        }

        // 3. Do-While loop to print numbers from 0 to the given number
        public void printNumbersDoWhileLoop(int num) {
            int i = 0;
            do {
                System.out.println(i);
                i++;
            } while (i <= num);
        }

        // Main method to test the loops
        public static void main(String[] args) {

            Main main = new Main();

            // Testing with number 5
            System.out.println("For Loop:");
            main.printNumbersForLoop(5);

            System.out.println("\nWhile Loop:");
            main.printNumbersWhileLoop(5);

            System.out.println("\nDo-While Loop:");
            main.printNumbersDoWhileLoop(5);
        }
    }


