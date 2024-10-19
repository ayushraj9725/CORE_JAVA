import java.util.*;
public class ArrayList2D1 {
    public static void reverseMatrix(ArrayList<ArrayList<Integer>> m){
        // reverseing only all row / order of row
        Collections.reverse(m);

        // reverseing here each rows 
        for(ArrayList<Integer> row : m){
            Collections.reverse(row);
        }
    }
    public static void printMatrix(ArrayList<ArrayList<Integer>> m){
        for(ArrayList<Integer> row : m){
            for(Integer e : row){
                System.out.print(e + " ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        matrix.add(new ArrayList<>(Arrays.asList(2,3,5)));
        matrix.add(new ArrayList<>(Arrays.asList(6,7,8)));
        matrix.add(new ArrayList<>(Arrays.asList(9,1,0)));
      //   matrix.add(new ArrayList<>(List.of(1,2,3)));  // we can also use this format to take data row wise and further row adding into matrix
      System.out.println("Matrix before reverse :");
      for(ArrayList<Integer> row : matrix){
        for(Integer e : row){
            System.out.print(e + " ");
        }
        System.out.println();
    }

      // calculating the reverse of matrix 
    
      reverseMatrix(matrix); 
      System.out.println("After Reverse Matrix :");
      printMatrix(matrix);
    } 
}
