import java.util.ArrayList;
public class ArrayList2D {
    public static void main(String args[]){
        // creating the 2D ArrayList
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        // filling the element . one by one row wise 

        ArrayList<Integer> row1 = new ArrayList<>();
        row1.add(1);
        row1.add(2);
        row1.add(3);

        ArrayList<Integer> row2 = new ArrayList<>();
        row2.add(2);
        row2.add(3);
        row2.add(4);

        ArrayList<Integer> row3 = new ArrayList<>();
        row3.add(3);
        row3.add(4);
        row3.add(5);
      
        // now add the all row into the matrix 
        matrix.add(row1);
        matrix.add(row2);
        matrix.add(row3);
         // iterating and printing the matrix\

         System.out.println("The final arrayList is this : ");
        for(int i = 0 ; i < matrix.size() ;i++){
            for(int j = 0 ; j < matrix.get(i).size() ; j++){
                System.out.print(matrix.get(i).get(j) + " ");
            }
            System.out.println();
        }

        // finding the sum of digonal of matix (primary )and  (secondary ) both we are finding

        // using nested loop , but it will take lots of time n^2 .
        int dsum1 = 0 ;
        int dsum2 = 0 ;
        for(int i = 0 ; i < matrix.size() ;i++){
            for(int j = 0 ; j < matrix.get(i).size(); j++){
                if(i == j){
                    dsum1 = dsum1 + matrix.get(i).get(j);
                }
                if(j + i == matrix.size() - 1 ){     // here i can also use (i + j) == matrix.size() - 1
                    dsum2 = dsum2 + matrix.get(i).get(j);
                }
            }
        }
        // finding both using optimal 
        int Dsum1 = 0 ;
        int Dsum2 = 0 ;
        for(int i = 0 ; i < matrix.size() ;i++){ // or goes till matrix[0].size() also
            Dsum1 = Dsum1 + matrix.get(i).get(i);
            Dsum2 = Dsum2 + matrix.get(i).get(matrix.size() - 1 - i);
        }

         System.out.println("The Sum of primary diagonal : "+dsum1+" and the sum of secondary digonal is : "+dsum2 +" using brute force time complexity O(N2)");
         System.out.println("The Sum of primary diagonal : "+Dsum1+", and the sum of secondary digonal is : "+Dsum2 +" using optimal time complexity O(N)");
    }
}
