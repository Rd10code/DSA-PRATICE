import java.util.*;
public class twoD_arrays{

    public static int largest(int arr[][]){
        int largest = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]>largest){
                    largest = arr[i][j];
                }
            }
        }
        return largest;
    }
    public static void main(String args[]){
        int matrix[][]= new int[3][3];
        int m = matrix.length ;
        int n =matrix[0].length;

        Scanner sc = new Scanner(System.in);
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println(" ");
        }

        int largest = largest(matrix);
        System.out.println(largest);

    // for(int i=m-1;i>=0;i--){
    //     for(int j=n-1;j>=0;j--){
    //         System.out.print(matrix[i][j]+ " ");
    //     }
    //     System.out.println("");
    // }




    }
}