import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.lang.String;

public class SymmetricNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        ArrayList<Integer> arr = new ArrayList<Integer>();

        for (int i = 1; i <=number ; i++) {

            if (isSymmetric(i+"")){
                arr.add(i);

            }

        }
        for (int i = 0; i < arr.size(); i++) {
            System.out.printf("%d ", arr.get(i));
        }

    }
    static boolean isSymmetric(String temp){
        for (int j = 0; j <= temp.length()/2; j++) {

            if (temp.charAt(j) != temp.charAt(temp.length()-j-1)){
               return false;
            }
        }
        return true;
    }
}
