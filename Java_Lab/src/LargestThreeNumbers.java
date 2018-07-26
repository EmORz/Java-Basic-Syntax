import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class LargestThreeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = Arrays.stream(input.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).sorted().toArray();

        int counter = 0;
        for (int i = arr.length-1; i >=0 ; i--) {
           if (counter > 2){
               break;
           }
           System.out.println(arr[i]);
           counter++;

        }
    }
}
