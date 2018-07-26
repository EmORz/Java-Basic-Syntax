import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String currentDay = input.nextLine();
        String day = "Wednesday";
        if (currentDay.equals(day)) {
            System.out.println("It is Wednesday!");
        } else {
            System.out.println("Not Wednesday.");
        }

    }
}
