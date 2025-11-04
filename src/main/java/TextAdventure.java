// Sumaya Siddiqui, 11/3/2025, AP CS-A 6th Hour, Choose Your Own Path Story
import java.util.Scanner;

public class TextAdventure {
    public static void main(String[] args) {
        // Scanner class
        Scanner sc = new Scanner(System.in);

        // ---------- VARIABLES & INITIALIZATION ----------
        boolean check1 = false;                 // Checks for logs
        boolean check2 = false;                 // Checks for logs
        boolean check02 = false;                // Checks for logs
        boolean check3 = false;                 // Checks for logs
        boolean check03 = false;                // Checks for logs
        boolean check4 = false;                 // Checks for logs
        boolean check5 = false;                 // Checks for logs
        boolean run = true;                     // While looping variable
        boolean hasHeartKey = false;            // First key
        boolean hasDiamondKey = false;          // Second key
        boolean hasCandleKey = false;           // Third key
        boolean hasCrystalKey = false;          // Fourth key
        int health = 3;                         // Player health
        int score = 0;                          // Player score

        // Choice log for bonus summary
        String log1 = "";
        String log2 = "";
        String log02 = "";
        String log3 = "";
        String log03 = "";
        String log4 = "";
        String log5 = "";
        String logOutcome = "";

        // ---------- MAIN GAME ----------
        while (run) {
            // Menu
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

            // ---------- CHECK IF LEVEL INPUT IS VALID ----------
            int level = 0;
            boolean validInput = false;
            while (!validInput) {
                System.out.print("Please select a level (1-5): ");
                if (sc.hasNextInt()) {
                    level = sc.nextInt();
                    if (level >= 1 && level <= 5) {
                        validInput = true;
                    } else {
                        System.out.println("That number is not a level!");
                    }
                } else {
                    System.out.println("Please enter a number!");
                    // Clear the not valid input
                    sc.next();
                }
            }
            System.out.println();

            // ---------- MAIN STORY LEVELS ----------
            switch (level) {

                // ---------- SCENE 1: BLOSSOM VILLAGE ----------
                case 1:
                    // Opening message
                    System.out.println("// Scene 1: Blossom Village");
                    System.out.println("Welcome, Investigator!");
                    System.out.println("You enter the abandoned Blossom Village, the cherry trees glowing faintly.");

                    // ---------- MAJOR DECISION POINT 1 (Getting the Heart Key) ----------
                    System.out.println("A shadow moves near the old shrine. Do you:");
                    System.out.println("1. Investigate the shrine");
                    System.out.println("2. Search the abandoned houses");
                    int choice1 = sc.nextInt();

                    // ---------- SCENE 1A: SHRINE ----------
                    // 1. Investigate the shrine
                    if (choice1 == 1) {
                        log1 = "Investigated the shrine.";
                        System.out.println("You find a mysterious chest near the shrine.");
                        // Mini for loop challenge!
                        System.out.println("You have 3 tries to open the lock (guess a number between 1 and 5): ");
                        int secret = 2;
                        boolean unlocked = false;
                        for (int i = 1; i <= 3; i++) {
                            System.out.print("Try " + i + ": ");
                            int guess = sc.nextInt();
                            if (guess == secret) {
                                unlocked = true;
                                break;
                            } else {
                                System.out.println("The lock clicks... but doesn't open.");
                            }
                        }
                        if (unlocked) {
                            System.out.println("The chest opens! You found the first key! ");
                            System.out.println("It's in a strange shape like a heart, but you pocket it");
                            hasHeartKey = true;
                            score += 10;
                        } else {
                            System.out.println("You failed to open it. The shadow attacks!");
                            health--;
                        }
                    }

                    // ---------- SCENE 1B: ABANDONED HOUSES ----------
                    // 2. Search the abandoned houses
                    else if (choice1 == 2) {
                        log1 = "Searched the abandoned houses.";
                        System.out.println("You search the houses and find a health potion!");
                        health++;
                        score += 5;
                    } else {
                        log1 = "Did nothing and left the village.";
                        System.out.println("You hesitate too long... a storm forces you to leave.");
                        health--;
                    }

                    // Check... the check!
                    check1 = true;

                    // Ask to move onto the next level
                    System.out.println("You've completed the first level! Would you like to continue? (Y/N): ");
                    String decision1 = sc.next();

                    if (decision1.equalsIgnoreCase("N")) {
                        run = false;
                        System.out.println("Great work investigator! Goodbye!");
                    }
                    else if (decision1.equalsIgnoreCase("Y")) {
                        System.out.println("YAY! Prepare for your next challenge...");
                    }
                    else {
                        System.out.println("Not a valid decision! Returning to menu screen.");
                    }

                    break;

                // ---------- SCENE 2: PARTRIDGE VILLAGE ----------
                case 2:
                    // Opening message
                    System.out.println("// Scene 2: Partridge Village");
                    System.out.println("You travel to Partridge Village, covered in mist.");

                    // ---------- MAJOR DECISION POINT 2 (Getting the Diamond Key) ----------
                    System.out.println("A ghostly figure blocks the path. Do you: ");
                    System.out.println("1. Talk to the ghost");
                    System.out.println("2. Try to sneak around it");
                    int choice2 = sc.nextInt();

                    // 1. Talk to the ghost
                    if (choice2 == 1) {
                        log2 = "Chose to talk to the ghost.";
                        if (hasHeartKey) {
                            System.out.println("The ghost sees your key and nods in approval, revealing a secret passage!");
                            score += 10;

                            // ---------- SCENE 2A: DARK PASSAGE ----------
                            System.out.println("You approach the dark passage as the candles on the wall mysteriously light up.");
                            System.out.println("You find the second key at the end of the passageway but it's stuck in between rocks!");
                            System.out.println("The ghost floats in and offers a helping hand. Do you: ");
                            System.out.println("1. Accept the ghost's help");
                            System.out.println("2. Try to dig it out yourself");
                            int choice2a = sc.nextInt();

                            // 1. Accept the ghost's help
                            if (choice2a == 1) {
                                log02 = "Accepted the ghost's help.";
                                System.out.println("The ghost points his finger to the key and it magically flies out of the rubble towards you!");
                                System.out.println("This key is shaped like a diamond and you pocket this one with the first key.");
                                hasDiamondKey = true;
                            }
                            // 2. Try to dig it out yourself
                            else if (choice2a == 2) {
                                log02 = "Attempted to dig the key out.";
                                System.out.println("The ghost shakes his head as you attempt to get the key out... but fail.");
                                System.out.println("The ghost curses you for your pride. You feel weaker and you might even die before finding the cure...");
                                health -= 1;
                            }
                        } else {
                            System.out.println("The ghost attacks because you lack the sacred heart key!");
                            health -= 2;
                        }
                    }

                    // 2. Try to sneak around it
                    else if (choice2 == 2) {
                        log2 = "Tried to sneak around the ghost.";
                        System.out.println("You sneak quietly and succeed, but lose your way in the fog.");
                        score += 5;
                    } else {
                        log2 = "Stayed still in fear.";
                        System.out.println("You stand frozen in fear until morning. The ghost fades away...");
                    }

                    // Check... the check!
                    check2 = true;
                    check02 = true;

                    // Ask to move on to the next level
                    System.out.println("You've completed the second level! Would you like to continue? (Y/N): ");
                    String decision2 = sc.next();

                    if (decision2.equalsIgnoreCase("N")) {
                        run = false;
                        System.out.println("Great work investigator! Goodbye!");
                    }
                    else if (decision2.equalsIgnoreCase("Y")) {
                        System.out.println("YAY! Prepare for your next challenge...");
                    }
                    else {
                        System.out.println("Not a valid decision! Returning to menu screen.");
                    }

                    break;

                // ---------- SCENE 3: CANDLEWOOD CAMP ----------
                case 3:
                    // Opening message
                    System.out.println("// Scene 3: CandleWoodCamp");
                    System.out.println("You rest at CandleWood Camp, but bandits approach!");

                    // ---------- MAJOR DECISION POINT 3 (Getting the Candle Key) ----------
                    System.out.println("Do you: ");
                    System.out.println("1. Fight");
                    System.out.println("2. Run");
                    System.out.println("3. Negotiate");
                    int choice3 = sc.nextInt();

                    // 1. Fight
                    if (choice3 == 1) {
                        log3 = "Decided to fight with bandits.";
                        System.out.println("You bravely fight but rest for a few days before getting out of there!!");
                        score += 10;
                        health--;
                    }

                    // 2. Run
                    else if (choice3 == 2) {
                        log3 = "Decided to run from bandits.";
                        System.out.println("You escape, but drop supplies, and have to quit your adventure here.");
                        score -= 5;
                    }

                    // 3. Negotiate
                    else if (choice3 == 3) {
                        // ---------- SCENE 3A: SECRET CAVE ----------
                        log3 = "Decided to negotiate with bandits.";
                        System.out.println("They agree to share food and tell you about a secret cave!");
                        score += 5;
                        System.out.println("After a good nights rest, you sneak away to the cave and find filled with candles");
                        System.out.println("Ironic... huh?");
                        System.out.println("There's a minecart at the beginning of the entrance. Do you: ");
                        System.out.println("1. Jump in");
                        System.out.println("2. Turn back and decide it's not worth it");
                        int choice3a = sc.nextInt();

                        // 1. Jump in
                        if (choice3a == 1) {
                            log03 = "Jumped into the minecart.";
                            System.out.println("You ride until you reach a fancy room with pillars.");
                            System.out.println("The minecart speeds are faster than expected! Hold on tight!");
                            if (Math.random() < 0.5) {
                                System.out.println("You crash at the end and scrape your arm (-1 health).");
                                health -= 1;
                            }
                            else {
                                System.out.println("You safely reach the chamber at the end!");
                            }
                            // ---------- SCENE 3B: CHAMBER ----------
                            System.out.println("At the end of the hallway, you spot the third key!");
                            System.out.println("You quickly run to it, holding the candle frame as it glows brightly, and you pocket it");
                            hasCandleKey = true;
                        }

                        // 2. Turn back and decide it's not worth it
                        else if (choice3a == 2) {
                            log03 = "Decided to turn back because the dangerous minecart was not worth it.";
                            System.out.println("You turn back around steal the bandits supplies and run from the camp.");
                        }
                    }

                    // Check... the check!
                    check3 = true;
                    check03 = true;

                    // Ask to move on to the next level
                    System.out.println("You've completed the third level! Would you like to continue? (Y/N): ");
                    String decision3 = sc.next();

                    if (decision3.equalsIgnoreCase("N")) {
                        run = false;
                        System.out.println("Great work investigator! Goodbye!");
                    }
                    else if (decision3.equalsIgnoreCase("Y")) {
                        System.out.println("YAY! Prepare for your next challenge...");
                    }
                    else {
                        System.out.println("Not a valid decision! Returning to menu screen.");
                    }

                    break;
                // ---------- SCENE 4: CRYSTAL COTTAGES ----------
                case 4:
                    // Opening message
                    System.out.println("// Scene 4: Crystal Cottages");
                    System.out.println("Everything is glowing, and you're mesmerised.");
                    System.out.println("That is, until you hear rustling noises in the bushes behind you.");
                    System.out.println("Thinking it's those bandits again looking for revenge, you frantically look for a place to hide.");

                    // ---------- MAJOR DECISION POINT 4 (Getting the Crystal Key) ----------
                    System.out.println("Do you: ");
                    System.out.println("1. Run towards the nearest cottage");
                    System.out.println("2. Fight the bandits");
                    int choice4 = sc.nextInt();

                    // 1. Run towards the nearest cottage
                    if (choice4 == 1){
                        // ---------- SCENE 4A: CRYSTAL COTTAGE WITH MAGICAL DOOR ----------
                        log4 = "Ran towards the nearest crystal cottage.";
                        System.out.println("The sound behind the bushes calms down as you hide behind the house.");
                        System.out.println("The Cottages shimmer with magic. You find a glowing crystal door with a candle shaped door handle.");
                        if (hasCandleKey) {
                            System.out.println("Your key fits! The door opens to reveal ancient writing.");
                            score += 15;
                            System.out.println("The text can be translated to \n\"Hidden under, \nthe 13th creak of floors, \nthe sneak, \nhideaway, \nkeys unfold\"");
                            System.out.println("You quickly begin checking for any loose floorboards, and find a crystal key under the 13th floorboard from the door!");
                            System.out.println("You quickly pocket the key, and hurry outside.");
                            hasCrystalKey = true;
                        }
                        else {
                            System.out.println("Without the key, the door stays sealed.");
                        }
                    }

                    // 2. Fight the bandits
                    else if (choice4 == 2) {
                        log4 = "Fought with the bandits by the Crystal Cottages.";
                        System.out.println("You attempt to fight the bandits, but are outnumbered and have to leave the cottages.");
                        health -= 1;
                    }
                    // Check... the check!
                    check4 = true;

                    // Ask to move on to the next level
                    System.out.println("You've completed the fourth level! Would you like to continue? (Y/N): ");
                    String decision4 = sc.next();

                    if (decision4.equalsIgnoreCase("N")) {
                        run = false;
                        System.out.println("Great work investigator! Goodbye!");
                    }
                    else if (decision4.equalsIgnoreCase("Y")) {
                        System.out.println("YAY! Prepare for your next challenge...");
                    }
                    else {
                        System.out.println("Not a valid decision! Returning to menu screen.");
                    }

                    break;

                // ---------- SCENE 5: STAR-LIGHT ISLANDS ----------
                case 5:
                    System.out.println("// Scene 5: Star-Light Islands (Final Scene)");
                    System.out.println("You arrive at the final location. The sky sparkles with starlight.");
                    log5 = "Reached the Star-Light Islands for the final challenge.";
                    if (hasHeartKey && hasDiamondKey && hasCandleKey && hasCrystalKey){
                        logOutcome = "You won!!";
                        // ---------- SCENE 5A: LIBRARY! ----------
                        System.out.println("The four keys start to glow as they float out of your hands and fuse into one.");
                        System.out.println("A bright light flashes! A new star shaped key appears in front of you.");
                        System.out.println("You reach out to the library door and unlock the secrets that are as old as time.");
                        System.out.println("Inside one of the books lies the cure for the world!");
                        System.out.println("YOU WIN! :)");

                    }
                    else if (health <= 0) {
                        logOutcome = "You died...";
                        System.out.println("You collapse before reaching the library. The world fades to darkness.");
                        System.out.println("BAD ENDING X.X");
                    }
                    else {
                        logOutcome = "You failed the mission.";
                        System.out.println("You reach the library, but cannot open it... the mystery remains unsolved.");
                        System.out.println("NEUTRAL ENDING ;-;");
                    }

                    // Check... the check!
                    check5 = true;

                    // ---------- REPLAY OPTION ----------
                    System.out.print("Would you like to play again? (Y/N): ");
                    String replay = sc.next();
                    if (replay.equalsIgnoreCase("N")) {
                        run = false;
                        System.out.println("Great work investigator! Goodbye!");
                    }
                    else if (replay.equalsIgnoreCase("Y")) {
                        // Reset for next round
                        health = 3;
                        score = 0;
                        hasHeartKey = false;
                        hasDiamondKey = false;
                        hasCandleKey = false;
                        hasCrystalKey = false;
                        log1 = "";
                        log2 = "";
                        log02 = "";
                        log3 = "";
                        log03 = "";
                        log4 = "";
                        log5 = "";
                        logOutcome = "";
                    }
                    else {
                        System.out.println("Not a valid answer, so goodbye anyways!");
                    }
                    break;

                default:
                    System.out.println("Enter a valid number next time!");

            }

            // ---------- DISPLAY PLAYER STATS ----------
            System.out.println();
            System.out.println("-----STATUS-----");
            System.out.println("Health: " + health);
            System.out.println("Score: " + score);
            System.out.println("Keys Collected: ");
            boolean hasAnyKey = hasHeartKey || hasDiamondKey || hasCandleKey || hasCrystalKey;
            if (!hasAnyKey) {
                System.out.println("- None yet");
            }
            if (hasHeartKey) {
                System.out.println("- Heart Key");
            }
            if (hasDiamondKey) {
                System.out.println("- Diamond Key");
            }
            if (hasCandleKey) {
                System.out.println("- Candle Key");
            }
            if (hasCrystalKey) {
                System.out.println("- Crystal Key");
            }
            System.out.println("-----------------");
            System.out.println();

            // ---------- ADVENTURE SUMMARY ----------
            System.out.println();
            System.out.println("---ADVENTURE SUMMARY---");
            if (check1)
            {
                System.out.println(log1);
            }
            if (check2)
            {
                System.out.println(log2);
            }
            if (check02)
            {
                System.out.println(log02);
            }
            if (check3)
            {
                System.out.println(log3);
            }
            if (check03)
            {
                System.out.println(log03);
            }
            if (check4)
            {
                System.out.println(log4);
            }
            if (check5)
            {
                System.out.println(log5);
            }
            System.out.print("------------------------");
            System.out.println();
        }
    }
}
