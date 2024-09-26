import java.util.Random;
import java.util.Scanner;

public class Sum_columns_2022503035 {
    int size;
    int[][] A;
    int[][] B;
    int[][] C;

    Scanner sc = new Scanner(System.in);

    public void read () {
        int i;
        System.out.println("Krithika-2022503035 - sum column ");
        System.out.println("Enter the value of the row and the column:");
        size = sc.nextInt();
        A = new int[size][size];
        B = new int[size][size];
        C = new int[size][size];
        for (i = 0; i < size; i++) {
            for(int j =0; j<size; j++){
                A[i][j] = sc.nextInt();
                //B[i][j] = sc.nextInt();
            }
        }
        for (i = 0; i < size; i++) {
            for(int j =0; j<size; j++){
                //A[i][j] = sc.nextInt();
                B[i][j] = sc.nextInt();
            }
        }

        for (i = 0; i < size; i++) {
            for(int j =0; j<size; j++){
                System.out.print(A[i][j] + " | ");

            }
            System.out.println();
        }
        System.out.println("------------------------------");
        for (i = 0; i < size; i++) {
            for(int j =0; j<size; j++){

                System.out.print(B[i][j] + " | ");
            }
            System.out.println();
        }
        System.out.println("------------------------------");
        for (i = 0; i < size; i++) {
            for(int j =0; j<size; j++){
                C[i][j] = B[i][j]+A[i][j];
                System.out.print(C[i][j] +" | ");
            }
            System.out.println();
        }
    }

    public void sum(){
        for(int i = 0; i<size; i++){
            int sum = 0;
            for(int j=0; j<size; j++){
                sum = sum +C[j][i]
            }

        }


    }

    public static void main(String[] args){
        Sum_columns_2022503035 obj = new Sum_columns_2022503035();
        obj.read();
    }
}
