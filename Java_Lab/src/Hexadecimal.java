import java.util.Scanner;

public class Hexadecimal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String strHexa = in.nextLine();
        int num = Integer.parseInt(strHexa, 16);
        System.out.println(num);
    }
}
