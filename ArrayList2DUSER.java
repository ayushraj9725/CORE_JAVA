import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList2DUSER {
    public static int SumOfAllele(ArrayList<ArrayList<Integer>> m , int r , int c){
        int sum = 0 ;
        for(int i = 0 ; i < r ; i++){
            for(int j = 0 ; j < c ;j++){
                sum = sum + m.get(i).get(j);
            }
        }
        return sum ;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the rows or it's size : ");
        int rows = sc.nextInt();
        System.out.print("Enter the column or size :"); 
        int cols = sc.nextInt();

        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        // filling the dat ain to the matrix 
        for(int i = 0 ; i < rows ; i++){
            ArrayList<Integer> row = new ArrayList<>();
            System.out.print("Fill the data of row "+ (i + 1) +" here : ");
            for(int j = 0 ; j < cols ; j++){
                row.add(sc.nextInt());  // adding elements here
            }
           matrix.add(row);  // adding rows into the matrix here 
        }

         // Using a for-each loop to iterate through the 2D ArrayList and print its values
        System.out.println("The 2D ArrayList elements are:");
        for(ArrayList<Integer> row : matrix){  // Outer loop: Iterates over each ArrayList<Integer> (each row) in the 2D ArrayList.

            for(Integer ele : row){            // Inner loop: Iterates over each Integer in the current row.
                System.out.print(ele + " ");
            }
            System.out.println();
        }

        // iterating the matrix using the loop 

        int n = matrix.size();  // size of row
        int m = matrix.get(0).size(); // size of colm

        int sum = SumOfAllele(matrix,n,m);
        System.out.println("The sum of all the elements in arrayList : "+sum);
    }
}
