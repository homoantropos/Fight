package Competitions;

import java.util.Scanner;

public class ScanningHelper {
    static private Scanner inChoice;
    static private String choiceStr;
    static private Integer choiceInt;
    static private String choice;

    static String inputString() {
        inChoice = new Scanner(System.in);
        choiceStr = inChoice.nextLine();
        return choiceStr;
    }

    static Integer inputInt() {
        inChoice = new Scanner(System.in);
        choiceInt = Integer.parseInt(inChoice.nextLine());
        return choiceInt;
    }

    static String setChoice() {
        choice = ScanningHelper.inputString();
        switch (choice) {
            case "+": {
                System.out.println("Додайте: ");
                return choice;
            }
            case "-": {
                return choice;
            }
            default: {
                System.out.println("Зробіть свій вибір - натисніть + або -:");
                setChoice();
            }
        }
        return choice;
    }
}
