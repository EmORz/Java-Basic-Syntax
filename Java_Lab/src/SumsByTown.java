import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeMap;

public class SumsByTown {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int n = Integer.parseInt(input.nextLine());

        TreeMap<String, Double> sumsByTown = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            String[] tokens = input.nextLine().split("\\|");
            String town = tokens[0].trim();
            double income = Double.parseDouble(tokens[1].trim());

            if ( sumsByTown.containsKey(town)){
                sumsByTown.put(town, sumsByTown.get(town)+income);
            }
            else {
                sumsByTown.put(town, income);
            }
        }
        for (String towns: sumsByTown.keySet()
             ) {
            System.out.println(towns +" -> "+sumsByTown.get(towns));
        }

        }

}
