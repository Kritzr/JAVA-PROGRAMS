import java.util.Scanner;
import java.util.Random;
public class Occurance_2022503035 {
    int size;//declared as members of the class to access again
    int[] A;
    int[] B;
    Random rd = new Random();// random is another feature just like the scanner
    Scanner sc = new Scanner(System.in);

    public void read () {
        int i;
        System.out.println("Krithika-2022503035 - occurance array");
        System.out.println("Enter the size of the array:");
        size = sc.nextInt();
        A = new int[size];
        B = new int[size];
        int randomNumber;
        int bound = rd.nextInt(8);
        for (i = 0; i < size; i++) {
            A[i] = rd.nextInt(bound);//random number
            B[i] = rd.nextInt(bound);
        }
    }

    public void compare(){
        for(int i =0; i<size; i++){
            int count =0;
            for(int j=0; j<size;j++){
                if(A[i]==B[j]){
                    count++;
                }
        //comparing and checking if the same value is present in the second array
            }
            System.out.println(B[i] +" : occurance is : " + count);
        }

    }

    public void display(){
        for(int i =0; i<size; i++){
            System.out.print(A[i]);
        }
        System.out.println();
        for(int i =0; i<size; i++){
            System.out.print(B[i]);
        }
        System.out.println();
    }

    public static void main(String[] args){
        Occurance_2022503035 obj = new Occurance_2022503035();
        obj.read();
        obj.display();
        obj.compare();
    }
}
