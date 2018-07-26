import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class TreeIntegerSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        if (!checkTreeIntegers(a, b, c) &&
                !checkTreeIntegers(c, a, b) &&
                !checkTreeIntegers(b, c, a))
            System.out.println("No");


    }
    static boolean checkTreeIntegers(int a, int b, int c){
        if (a + b !=c){
            return  false;
        }
        if (a<=b){
            System.out.printf("%d + %d = %d\n", a, b, c);
        }else{
            System.out.printf("%d + %d = %d\n", b, a, c);
        }

        return true;
    }
}






