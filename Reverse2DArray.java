import java.util.Scanner ;
public class Reverse2DArray {
    public static void reverseRows(int[][] rows,int n){
           for(int i = 0 ; i < n/2 ;i++){
                int[] temp = rows[i];
                rows[i] = rows[n - 1 -i];
                rows[n - 1 -i] = temp ;
           }
    }
    public static void reverseEachRows(int[] erow,int m){
            int i = 0 , j = m-1 ;
            while(i < j){
                int temp = erow[i];
                erow[i] = erow[j];
                erow[j] = temp ;
                i++;
                j--; 
            }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of row : ");
        int n = sc.nextInt();
        System.out.print("Enter the size of column : ");
        int m = sc.nextInt();
        int matrix[][] = new int[n][m];

        for(int i = 0 ; i < n ;i++){
            for(int j = 0 ; j < m ; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Before reversed the final matrix : ");
        for(int i = 0 ; i < n ;i++){
            for(int j = 0 ; j < m ; j++){
               System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        // calling
        reverseRows(matrix,n);
        for(int i = 0 ; i < n ; i++){
            reverseEachRows(matrix[i],m);
        }

        System.out.println("After reversed the final matrix : ");
        for(int i = 0 ; i < n ;i++){
            for(int j = 0 ; j < m ; j++){
               System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // now find the transpose of matrix 
        int transe[][] = new int[m][n];
        for(int i = 0 ; i < n ;i++){
            for(int j = 0 ; j < m ;j++){
                transe[i][j] = matrix[j][i];
            }
        }
        System.out.println("Transepose matrix is this : ");
        for(int i = 0 ; i < n ;i++){
            for(int j = 0 ; j < m ;j++){
                System.out.print(transe[i][j]+" ");
            }
            System.out.println();
        }

        // calculating the multiplication of actual matric and transepose matrixx ;
        int result[][] = new int[n][n] ; // for storing the multiplication result 
        for(int i = 0 ; i < n ;i++){
            for(int j = 0 ; j < m ;j++){
                result[i][j] = 0 ;
                for(int k = 0 ; k < n ; k++){
                    result[i][j] = result[i][j] + matrix[i][k] * transe[k][j];
                }
            }
        }
        System.out.println("Multiplication of actual matrix and it's transpose is this : ");
        for(int i = 0 ; i < n ;i++){
            for(int j = 0 ; j < n ;j++){
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
    }
}
