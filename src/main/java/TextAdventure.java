import java.util.Scanner;

public class TextAdventure
{
    public static void main(String[] args) {
        // Scanner class
        Scanner sc = new Scanner(System.in);

        // Have a boolean value to keep while running
        boolean run = true;

        while (run) {
            // Menu
            System.out.println();
            System.out.println();
            System.out.println("    *******   ******");
            System.out.println("  *****    **    *****");
            System.out.println("  **** BrooksTale ****");
            System.out.println("   ***            ***");
            System.out.println("    **            **");
            System.out.println("      **        **");
            System.out.println("         ******");
            System.out.println();
            System.out.println("Welcome to BrooksTale!");
            System.out.println("1. Blossom Village");
            System.out.println("2. Partridge Village");
            System.out.println("3. CandleWood Camp");
            System.out.println("4. Crystal Cottages");
            System.out.println("5. Star-Light Islands");
            System.out.println();
            System.out.print("Please select a level: ");
            int level = sc.nextInt();
            System.out.println();

            // Going through each level
            switch (level) {
                case 1:
                    // Helpful side character introduction
                    System.out.print("Welcome investigator! \nI am Lenny the elf and here to assist you on your adventure. \nPlease enter your name: ");
                    String name = sc.nextLine();
                    System.out.println();
                    System.out.println("Nice to meet you " + name + "!");
                    System.out.print("Congratulations! You've found the first piece of the puzzle. \nWould you like to continue on your remarkable journey?: ");
                    String answer = sc.nextLine();
                    if (answer.equals("N"))
                    {
                        run = false;
                        System.out.println("Great work investigator! Goodbye!");
                    }

                    break;
                default:
                    // Print an error
                    System.out.print("Enter a valid number: ");
            }
        }
    }
}
