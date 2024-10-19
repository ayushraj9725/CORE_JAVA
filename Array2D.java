import java.util.Scanner;
import java.util.ArrayList;
public class Array2D {
    public static ArrayList<Integer> searchIndex(int[][] m , int key){
        ArrayList<Integer> r = new ArrayList<>();
        for(int i = 0 ; i < m.length ;i++){
            for(int j = 0 ; j < m[0].length ;j++){
                if(m[i][j] == key){
                    r.add(i);
                    r.add(j);
                }
            }
        }
        return r ;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of 2D array enter row column size :");
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println("Enter the array element : ");
        // creating the 2D array 
        int matrix[][] = new int[n][m];
        for(int i = 0 ; i < n ;i++){
            for(int j = 0 ; j < m ; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Final Stored Matrix : ");

        for(int i = 0 ; i < matrix.length ;i++){
            for(int j =0 ; j < matrix[0].length ;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }


        // Searching in array and return the index 
        ArrayList<Integer> result = new ArrayList<>();
        // calling the for the searching function
        System.out.print("Enter the key : ");
        int key = sc.nextInt();

        result = searchIndex(matrix,key);

        System.out.println("the index is this " +result );

        sc.close();
    }
}
