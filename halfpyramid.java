import java.util.*;

public class halfpyramid {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n :");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " "); // if i code " i " at place of j them the output change as
            }
            System.out.println();
        }
        sc.close();
    }

}
