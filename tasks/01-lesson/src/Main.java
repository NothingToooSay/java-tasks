import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a scanner to take the number

        while (true) {
            System.out.println("Select exercise (1-14) or 0 to exit:");
            int exercise = scanner.nextInt();

            if (exercise == 0) {
                break; // Exit the loop if the user chooses 0
            }

            switch (exercise) {
                case 1:
                    int answer1 = returnNumber();
                    System.out.println("Answer for question 1: " + answer1);
                    break;
                case 2:
                    System.out.println("Give number for Double:");
                    int a = scanner.nextInt();
                    int answer2 = returnDoubleNumber(a);
                    System.out.println("Answer for question 2: " + answer2);
                    break;
                case 3:
                    System.out.println("Give number to check if it's even:");
                    int aa = scanner.nextInt();
                    String answer3 = checkIfEvenNumber(aa);
                    System.out.println("Answer for question 3: " + answer3);
                    break;
                case 4:
                    System.out.println("Enter the base number:");
                    int base = scanner.nextInt();
                    System.out.println("Enter the exponent:");
                    int exponent = scanner.nextInt();
                    double powerResult = numberToPower(base, exponent);
                    System.out.println("Answer for question 4: " + powerResult);
                    break;
                case 5:
                    System.out.println("Enter two numbers to divide (x y):");
                    int x = scanner.nextInt();
                    int y = scanner.nextInt();
                    int divideResult = divideTheNumber(x, y);
                    System.out.println("Answer for question 5: " + divideResult);
                    break;
                case 6:
                    System.out.println("Enter two strings to join:");
                    scanner.nextLine(); // Consume the newline character
                    String text1 = scanner.nextLine();
                    String text2 = scanner.nextLine();
                    String joinedText = joinString(text1, text2);
                    System.out.println("Answer for question 6: " + joinedText);
                    break;
                case 7:
                    System.out.println("Enter two words to count:");
                    scanner.nextLine(); // Consume the newline character
                    String word1 = scanner.nextLine();
                    String word2 = scanner.nextLine();
                    int wordCount = howManyWords(word1, word2);
                    System.out.println("Answer for question 7: " + wordCount);
                    break;
                case 8:
                    System.out.println("Enter two boolean values (true/false):");
                    boolean p = scanner.nextBoolean();
                    boolean q = scanner.nextBoolean();
                    boolean alterResult = Alter(p, q);
                    System.out.println("Answer for question 8: " + alterResult);
                    break;
                case 9:
                    System.out.println("Enter a number to check if it is zero:");
                    int zeroCheck = scanner.nextInt();
                    checkIfZero(zeroCheck);
                    break;
                case 10:
                    System.out.println("Enter a number to check if it is positive:");
                    double positiveCheck = scanner.nextDouble();
                    checkIfPositive(positiveCheck);
                    break;
                case 11:
                    System.out.println("Enter a number to check if it is even:");
                    int evenCheck = scanner.nextInt();
                    checkIfEven(evenCheck);
                    break;
                case 12:
                    System.out.println("Enter a number to check if it is not divisible by 3:");
                    int divisibleCheck = scanner.nextInt();
                    checkIfNotDivisibleByThree(divisibleCheck);
                    break;
                case 13:
                    System.out.println("Enter a number to check if it is positive and even:");
                    int positiveEvenCheck = scanner.nextInt();
                    checkIfPositiveAndEven(positiveEvenCheck);
                    break;
                case 14:
                    System.out.println("Enter a number to check if it is even, positive, and not divisible by 3:");
                    int evenPositiveNotDivisibleCheck = scanner.nextInt();
                    checkIfEvenPositiveAndNotDivisibleByThree(evenPositiveNotDivisibleCheck);
                    break;
                default:
                    System.out.println("Invalid exercise number. Please select a number between 1 and 14, or 0 to exit.");
                    break;
            }
        }

        scanner.close(); // Close the scanner to avoid memory leaks
    }

    public static int returnNumber() {
        return 42;
    }

    public static int returnDoubleNumber(int a) {
        return a * 2;
    }

    public static String checkIfEvenNumber(int a) {
        return a % 2 == 0 ? "The number is even" : "The number is not even";
    }

    public static double numberToPower(int a, int b) {
        return Math.pow(a, b);
    }

    public static int divideTheNumber(int x, int y) {
        return x / y;
    }

    public static String joinString(String text1, String text2) {
        return text1 + " =) " + text2;
    }

    public static int howManyWords(String text1, String text2) {
        return (text1 + " " + text2).length();
    }

    public static boolean Alter(boolean p, boolean q) {
        return p || q;
    }

    public static void checkIfZero(int number) {
        if (number == 0) {
            System.out.println("Zero");
        } else {
            System.out.println("Not Zero");
        }
    }

    public static void checkIfPositive(double number) {
        if (number > 0) {
            System.out.println("Number greater than 0");
        } else {
            System.out.println("Number is not more than 0");
        }
    }

    public static void checkIfEven(int number) {
        if (number % 2 == 0) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is not even");
        }
    }

    public static void checkIfNotDivisibleByThree(int number) {
        if (number % 3 != 0) {
            System.out.println("The number is not divisible by 3");
        } else {
            System.out.println("The number is divisible by 3");
        }
    }

    public static void checkIfPositiveAndEven(int number) {
        if (number > 0 && number % 2 == 0) {
            System.out.println("The number is positive and even");
        } else {
            System.out.println("The number is not positive and even");
        }
    }

    public static void checkIfEvenPositiveAndNotDivisibleByThree(int number) {
        if (number > 0 && number % 2 == 0 && number % 3 != 0) {
            System.out.println("The number meets all conditions");
        } else {
            System.out.println("The number don't meets all conditions");
        }
    }
}
