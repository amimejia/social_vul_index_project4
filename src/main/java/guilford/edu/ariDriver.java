package guilford.edu;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class ariDriver {
    public static void main(String[] args) {
        ArrayList<At_Risk_Individual> ari_ArrayList = new ArrayList<At_Risk_Individual>();

        // Let the User Choose how many Arrays to make
        Scanner scan = new Scanner(System.in);
        System.out.println("How many At Risk Individuals would you like to create?: ");

        int num_ari = scan.nextInt();
        //Create num_ari arrays
        for (int i = 0; i < num_ari; i++) {
            ari_ArrayList.add(new At_Risk_Individual());
        }
        //Print out num_ari arrays
        for (int i = 0; i < num_ari; i++) {
            System.out.println(ari_ArrayList.get(i).toString());
        }

        //add a static selectionSort method that takes an array of social vulnerbility index and sorts them in ascending order
        public static void selectionSort(At_Risk_Individual[] 


        
    }
}
