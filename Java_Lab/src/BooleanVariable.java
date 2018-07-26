import java.util.Scanner;

public class BooleanVariable {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String trueOrFalse = input.nextLine();

        String result = trueOrFalse.equals("True") ? "Yes": "No";
        System.out.println(result);
    }
}
