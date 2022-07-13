import java.util.*;

public class minimumNumberOfComparison {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number of coins : ");
        int n = scn.nextInt();

        System.out.println("Minimum number of comparison are : " + (int) (Math.ceil((Math.log(n)) / Math.log(3))));
    }
}
